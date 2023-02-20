package com.sql.parser.lineage.starRocks;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.sql.parser.lineage.context.*;
import com.sql.parser.lineage.enums.StatementType;
import com.sql.parser.lineage.schema.TableSchemaFinder;
import com.sql.parser.lineage.schema.TableSimpleSchema;
import com.sql.parser.lineage.utils.SqlContextBuilderHelper;
import com.sql.parser.lineage.utils.SqlStringUtils;
import javafx.util.Pair;
import org.apache.commons.lang.StringUtils;
import starRcoks.StarRocksBaseVisitor;
import starRcoks.StarRocksParser;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class StarRocksSqlVisitor extends StarRocksBaseVisitor<SqlContext> {

    private String currentDb;
    private StarRocksSqlContextBuildHelper buildHelper;

    class StarRocksSqlContextBuildHelper extends SqlContextBuilderHelper {
        public StarRocksSqlContextBuildHelper(TableSchemaFinder schemaFinder) {
            super(schemaFinder);
        }

        private List<String> findColNameFromColumnAliases(StarRocksParser.ColumnAliasesContext ctx) {
            if (ctx == null)
                return null;
            List<String> result = ctx.identifier().stream().map(col -> unescapeIdentifier(col)).collect(toList());
            return result;
        }
    }

    public StarRocksSqlVisitor(TableSchemaFinder schemaFinder, String currentDb) {
        buildHelper = new StarRocksSqlContextBuildHelper(schemaFinder);
        this.currentDb = currentDb;
    }

    /**
     * 只要是执行sql，都走这个方法
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitSingleStatement(StarRocksParser.SingleStatementContext ctx) {
        SqlContext sqlContext = new SqlContextCopycat().copy(ctx, visit(ctx.statement()));
        return sqlContext;
    }

    /**
     * 查询语句
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitQueryStatement(StarRocksParser.QueryStatementContext ctx) {
        SqlContext result = new SqlContextCopycat<>().copy(ctx, visit(ctx.getRuleContext()));
        result.setJoinCols(buildHelper.getJoinCols());
        return result;
    }


    /**
     * 插入语句
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitInsertStatement(StarRocksParser.InsertStatementContext ctx) {
        InsertSqlContext result = new InsertSqlContext(ctx);
        String tableName = unescapeQualifiedName(ctx.qualifiedName());
        if (!tableName.contains(".")) {
            tableName = currentDb + "." + tableName;
        }
        String fullTableName = tableName;
        List<String> colNames = buildHelper.findColNameFromColumnAliases(ctx.columnAliases());
        if (colNames != null) {
            List<ColumnContext> insertCols = colNames.stream().map(colName -> new ColumnContext(colName, colName, fullTableName)).collect(toList());
            result.setInsertCols(insertCols);
        }
        result.setInsertTable(tableName);
        result.setQueryContext(visit(ctx.queryStatement()));

        if (result.getQueryContext() != null) {
            TableSimpleSchema schema = null;
            try {
                schema = buildHelper.getSchema(result.getInsertTable());
            } catch (Exception e) {
                throw new RuntimeException(String.format("get schema of table %s failed", result.getInsertTable()));
            }
            if (schema != null) {
                result.setInsertCols(schema.getCols().subList(0, result.getQueryContext().getOutputCols().size()));
            }
        }
        return result;
    }

    /**
     * 带with
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitQueryRelation(StarRocksParser.QueryRelationContext ctx) {
        SqlContext withContext = null;
        SqlContext queryContext = null;
        SqlContext result = null;
        if (ctx.withClause() != null) {
            withContext = visit(ctx.withClause());
        }
        queryContext = visit(ctx.queryNoWith());
        if (withContext != null) {
            //将with中的别名与query别名合并
            Map<String, Set<String>> withTabAlias = Maps.newHashMap();
            for (Map.Entry<String, Set<String>> entry : queryContext.getTabAlias().entrySet()) {
                Set<String> newSet = Sets.newHashSet();
                for (String table : entry.getValue()) {
                    if (withContext.getTabAlias().containsKey(table)) {
                        newSet.addAll(withContext.getTabAlias().get(table));
                    } else {
                        newSet.add(table);
                    }
                }
                withTabAlias.put(entry.getKey(), newSet);
            }
            result = new SqlContextCopycat().copy(ctx, queryContext);
            result.setTabAlias(withTabAlias);
            result.setInputCols(queryContext.getInputCols());
            result.setOutputCols(queryContext.getOutputCols());
            result.setStatementType(StatementType.SELECT);
        } else {
            result = new SqlContextCopycat().copy(ctx, queryContext);
            result.setStatementType(StatementType.SELECT);
        }
        return result;
    }

    /**
     * 获取删除语句中的表名
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitDeleteStatement(StarRocksParser.DeleteStatementContext ctx) {
        DeleteSqlContext result = new DeleteSqlContext(ctx);
        String tableName = unescapeQualifiedName(ctx.qualifiedName());
        result.setDeleteTable(tableName);
        /*TODO booleanExpression解析*/
        return result;
    }


    @Override
    public SqlContext visitWithClause(StarRocksParser.WithClauseContext ctx) {
        List<StarRocksParser.CommonTableExpressionContext> namedQueryContexts = ctx.commonTableExpression();
        List<Map<String, Set<String>>> aliasCtxs = Lists.newArrayList();
        for (StarRocksParser.CommonTableExpressionContext namedCtx : namedQueryContexts) {
            SqlContext queryBodyCtx = visit(namedCtx);
            aliasCtxs.add(queryBodyCtx.getTabAlias());
        }
        SqlContext result = new SqlContext(ctx);
        result.setTabAlias(buildHelper.mergeAlias(aliasCtxs));
        return result;
    }

    /**
     * 整体查询分析
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitCommonTableExpression(StarRocksParser.CommonTableExpressionContext ctx) {
        String aliasName = unescapeIdentifier(ctx.name);
        TableSimpleSchema simpleSchema = new TableSimpleSchema();
        simpleSchema.setTableName(aliasName);
        List<ColumnContext> schemaCols = Lists.newArrayList();
        SqlContext result = new SqlContextCopycat<>().copy(ctx, visit(ctx.queryRelation()));
        result.setTabAlias(buildHelper.appendAlias(result.getTabAlias(), aliasName));
        List<ColumnContext> resultOutput = null;
        for (ColumnContext col : result.getOutputCols()) {
            ColumnContext newCol = new ColumnContext();
            newCol.setSource(Lists.newArrayList(col));
            newCol.setTable(aliasName);
            newCol.setAlias(col.getAlias());
            newCol.setName(col.getName());
            if (resultOutput == null) {
                resultOutput = Lists.newArrayList();
            }
            resultOutput.add(newCol);
            schemaCols.add(newCol);
        }
        simpleSchema.setCols(schemaCols);
        buildHelper.getSchema().put(aliasName, simpleSchema);
        result.setOutputCols(resultOutput);
        buildHelper.getWithTabAlias().putAll(result.getTabAlias());
        return result;
    }

    /**
     * 获取排序字段
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitQueryNoWith(StarRocksParser.QueryNoWithContext ctx) {
        SqlContext result = new SqlContextCopycat<>().copy(ctx, visit(ctx.queryPrimary()));
        if (ctx.ORDER() != null) {
            List<ColumnContext> orderByCols = Lists.newArrayList();
            buildHelper.getContextStack().push(result);
            for (StarRocksParser.SortItemContext sortItemContext : ctx.sortItem()) {
                orderByCols.addAll(visit(sortItemContext).getOutputCols());
            }
            result.getOutputCols().stream().forEach(col -> buildHelper.addOrganizationCols(col, orderByCols));
            buildHelper.getContextStack().pop();
        }
        return result;
    }

    /**
     * 获取join时，匹配和结合字段
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitSetOperation(StarRocksParser.SetOperationContext ctx) {
        SqlContext leftContext = visit(ctx.left);
        SqlContext rightContext = visit(ctx.right);
        SqlContext result = new SqlContext(ctx);
        List<List<ColumnContext>> unionCols = Lists.newArrayList();
        unionCols.add(leftContext.getOutputCols());
        unionCols.add(rightContext.getOutputCols());
        List<ColumnContext> outputCols = buildHelper.mergeUnionColumn(unionCols);
        result.setOutputCols(outputCols);
        List<ColumnContext> inputCols = Lists.newArrayList();
        inputCols.addAll(leftContext.getOutputCols());
        inputCols.addAll(rightContext.getOutputCols());
        result.setInputCols(inputCols);
        return result;
    }

    /**
     * 排序字段晒别结合别的一起用，单独重写不生效
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitSortItem(StarRocksParser.SortItemContext ctx) {
        return new SqlContextCopycat<>().copy(ctx, visit(ctx.expression()));
    }

    @Override
    public SqlContext visitQueryPrimaryDefault(StarRocksParser.QueryPrimaryDefaultContext ctx) {
        return new SqlContextCopycat<>().copy(ctx, visit(ctx.querySpecification()));
    }

    @Override
    public SqlContext visitQueryWithParentheses(StarRocksParser.QueryWithParenthesesContext ctx) {
        return new SqlContextCopycat<>().copy(ctx, visit(ctx.subquery()));
    }

    @Override
    public SqlContext visitTableAtom(StarRocksParser.TableAtomContext ctx) {
        SqlContext result = new SqlContext(ctx);
        String tableName = unescapeQualifiedName(ctx.qualifiedName());
        if (!tableName.contains(".")) {
            tableName = currentDb + "." + tableName;
        }
        Map<String, Set<String>> tabAliasMap = Maps.newHashMap();
        tabAliasMap.put(tableName, Sets.newHashSet(tableName));
        result.setTabAlias(tabAliasMap);
        TableSimpleSchema tableSchema = null;
        try {
            tableSchema = buildHelper.getSchema(tableName);
        } catch (Exception e) {
            throw new RuntimeException(String.format("get schema of table %s failed", tableName));
        }
        if (tableSchema != null) {
            result.setInputCols(tableSchema.getCols());
            result.setOutputCols(tableSchema.getCols());
        } else {
            throw new RuntimeException(String.format("cannot find schema of table %s", tableName));
        }
        return result;
    }

    @Override
    public SqlContext visitSubquery(StarRocksParser.SubqueryContext ctx) {
        return new SqlContextCopycat<>().copy(ctx, visit(ctx.queryRelation()));
    }


    /**
     * 查询语句的整体解析：where、group、from等等
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitQuerySpecification(StarRocksParser.QuerySpecificationContext ctx) {
        SqlContext result = new SqlContext(ctx);
        SqlContext fromContext = null;
        StarRocksParser.FromContext from = (StarRocksParser.FromContext) ctx.fromClause();
        if (from.FROM() != null) {
            List<SqlContext> fromSqlContextList = Lists.newArrayList();
            // From在starRocks.g4语法里面嵌套了一层，所以不像presto那样
            from.relations().relation().stream().forEach(context -> fromSqlContextList.add(visit(context)));
            fromContext = new SqlContext(ctx);
            List<Map<String, Set<String>>> aliasList = Lists.newArrayList();
            List<ColumnContext> inputColList = Lists.newArrayList();
            List<Pair<ColumnContext, List<ColumnContext>>> joinCols = Lists.newArrayList();
            for (SqlContext fromSqlContext : fromSqlContextList) {
                aliasList.add(fromSqlContext.getTabAlias());
                inputColList.addAll(fromSqlContext.getOutputCols());
                if (!buildHelper.isEmptyList(fromSqlContext.getJoinCols())) {
                    joinCols.addAll(fromSqlContext.getJoinCols());
                }
            }

            result.setTabAlias(buildHelper.mergeAlias(aliasList));
            result.setJoinCols(joinCols);
            result.setInputCols(inputColList);
            fromContext.setTabAlias(buildHelper.mergeAlias(aliasList));
            fromContext.setOutputCols(inputColList);
        }

        if (fromContext != null)
            buildHelper.getContextStack().push(fromContext);
        List<ColumnContext> outputColList = Lists.newArrayList();
        for (StarRocksParser.SelectItemContext selectCtx : ctx.selectItem()) {
            outputColList.addAll(visit(selectCtx).getOutputCols());
        }


        //解析where条件
        if (ctx.where != null) {
            SqlContext whereSqlContext = visit(ctx.where);
            if (!buildHelper.isEmptyList(whereSqlContext.getOutputCols())) {
                outputColList.stream().forEach(output -> buildHelper.addCondition(output, whereSqlContext.getOutputCols()));
            }
        }

        //解析group by
        //TODO 和presto的结构不一样，需要观察一下
        if (ctx.groupingElement() != null) {
            SqlContext groupBySqlContext = visit(ctx.groupingElement());
            if (!buildHelper.isEmptyList(groupBySqlContext.getOutputCols())) {
                outputColList.stream().forEach(output -> buildHelper.addGroupBy(output, groupBySqlContext.getOutputCols()));
            }
        }

        //解析having
        if (ctx.having != null) {
            SqlContext havingSqlContext = visit(ctx.having);
            if (!buildHelper.isEmptyList(havingSqlContext.getOutputCols())) {
                outputColList.stream().forEach(output -> buildHelper.addCondition(output, havingSqlContext.getOutputCols()));
            }
        }

        if (fromContext.getJoinCols() != null) {
            List<ColumnContext> joinCols = Lists.newArrayList();
            for (Pair<ColumnContext, List<ColumnContext>> pair : fromContext.getJoinCols()) {
                joinCols.add(pair.getKey());
                joinCols.addAll(pair.getValue());
            }
            outputColList.stream().forEach(output -> buildHelper.addCondition(output, joinCols));
        }

        result.setOutputCols(outputColList);
        //将join字段加入输出字段的condition中
        if (!buildHelper.isEmptyList(result.getJoinCols())) {
            Set<ColumnContext> joinConditionCols = Sets.newHashSet();
            for (Pair<ColumnContext, List<ColumnContext>> joinPair : result.getJoinCols()) {
                joinConditionCols.add(joinPair.getKey());
                joinConditionCols.addAll(joinPair.getValue());
            }
            buildHelper.addOutputCondition(result, Lists.newArrayList(joinConditionCols));
        }
        if (fromContext != null) {
            buildHelper.getUsedContextStack().push(fromContext);
            buildHelper.getContextStack().pop();
        }

        return result;

    }

    // TODO 先观察
//    看了一下starRocks.g4的语法文件，两个不一样，所以这个方法感觉不用写，先观察
//    @Override
//    public SqlContext visitGroupBy(PrestoBaseParser.GroupByContext ctx) {
//        SqlContext result = new SqlContext(ctx);
//        List<ColumnContext> outputCols = Lists.newArrayList();
//        for (PrestoBaseParser.GroupingElementContext groupingElementContext : ctx.groupingElement()) {
//            outputCols.addAll(visit(groupingElementContext).getOutputCols());
//        }
//        result.setOutputCols(outputCols);
//        return result;
//    }

    @Override
    public SqlContext visitSingleGroupingSet(StarRocksParser.SingleGroupingSetContext ctx) {
        return new SqlContextCopycat<>().copy(ctx, visit(ctx.expressionList()));
    }


    @Override
    public SqlContext visitExpressionList(StarRocksParser.ExpressionListContext ctx) {
        List<StarRocksParser.ExpressionContext> expressioList = ctx.expression();
        SqlContext result = new SqlContext(ctx);
        ColumnContext outputCol = new ColumnContext();
        for (StarRocksParser.ExpressionContext expressionContext : expressioList) {
            SqlContext expCtx = visit(expressionContext);
            if (outputCol != null) {
                buildHelper.addSource(outputCol, expCtx.getOutputCols());
            }
        }
        result.setOutputCols(Collections.singletonList(outputCol));
        return result;
    }

    @Override
    public SqlContext visitRelation(StarRocksParser.RelationContext ctx) {
        return new SqlContextCopycat<>().copy(ctx, visit(ctx.relationPrimary()));
    }


//    presto存在，starRocksbu不知道要不要写
//    @Override
//    public SqlContext visitSampledRelation(PrestoBaseParser.SampledRelationContext ctx) {
//        return new SqlContextCopycat<>().copy(ctx, visit(ctx.aliasedRelation()));
//    }


    /**
     * StarRcosk 的连接是分为外和内来区分的
     *
     * @param ctx the parse tree
     * @return
     */
    @Override
    public SqlContext visitJoinRelation(StarRocksParser.JoinRelationContext ctx) {
        //TODO join格式不一致，需要观察
        StarRocksParser.OuterAndSemiJoinTypeContext outerAndSemiJoinTypeContext = ctx.outerAndSemiJoinType();
        SqlContext result = new SqlContext(ctx);
        SqlContext leftSqlContext = visit(outerAndSemiJoinTypeContext.LEFT());
        if (outerAndSemiJoinTypeContext.RIGHT() != null) {
            SqlContext rightSqlContext = visit(outerAndSemiJoinTypeContext.RIGHT());
            List<Map<String, Set<String>>> alias = Lists.newArrayList(leftSqlContext.getTabAlias(), rightSqlContext.getTabAlias());
            result.setTabAlias(buildHelper.mergeAlias(alias));
            List<ColumnContext> newInputCols = Lists.newArrayList();
            newInputCols.addAll(leftSqlContext.getOutputCols());
            newInputCols.addAll(rightSqlContext.getOutputCols());
            result.setInputCols(newInputCols);
            result.setOutputCols(newInputCols);
        } else if (ctx.rightRelation != null) {
            SqlContext rightSqlContext = visit(ctx.rightRelation);
            List<Map<String, Set<String>>> alias = Lists.newArrayList(leftSqlContext.getTabAlias(), rightSqlContext.getTabAlias());
            result.setTabAlias(buildHelper.mergeAlias(alias));
            List<ColumnContext> newInputCols = Lists.newArrayList();
            newInputCols.addAll(leftSqlContext.getOutputCols());
            newInputCols.addAll(rightSqlContext.getOutputCols());
            result.setInputCols(newInputCols);
            result.setOutputCols(newInputCols);
            buildHelper.getContextStack().push(result);
            SqlContext joinCtx = visit(ctx.joinCriteria());
            result.setJoinCols(joinCtx.getJoinCols());
            buildHelper.getUsedContextStack().push(result);
            if (!buildHelper.isEmptyList(leftSqlContext.getJoinCols())) {
                result.getJoinCols().addAll(leftSqlContext.getJoinCols());
            }
            buildHelper.getContextStack().pop();
        }
        return result;
    }

    @Override
    public SqlContext visitJoinCriteria(StarRocksParser.JoinCriteriaContext ctx) {
        SqlContext result = new SqlContext(ctx);
        if (ctx.expression() != null) {
            BooleanExpressionSqlContext booleanExpressionSqlContext = (BooleanExpressionSqlContext) visit(ctx.expression());
            List<Pair<ColumnContext, List<ColumnContext>>> joinPairList = booleanExpressionSqlContext.getJoinCols();
            /*for (PredicatedSqlContext predicatedSqlContext : booleanExpressionSqlContext.getSubContext()) {
                List<ColumnContext> predicateCols = predicatedSqlContext.getPredicateCols();
                if (!buildHelper.isEmptyList(predicateCols) && predicateCols.size() == 2) {
                    Pair<ColumnContext, List<ColumnContext>> joinPair = new Pair(predicateCols.get(0), Collections.singletonList(predicateCols.get(1)));
                    joinPairList.add(joinPair);
                }
            }
            buildHelper.getJoinCols().addAll(joinPairList);*/
            result.setJoinCols(joinPairList);
        } else {
            List<StarRocksParser.IdentifierContext> idList = ctx.identifier();
            List<Pair<ColumnContext, List<ColumnContext>>> joinPairList = Lists.newArrayList();
            SqlContext sqlContext = buildHelper.getContextStack().peek();
            for (StarRocksParser.IdentifierContext idCtx : idList) {
                String fieldName = unescapeIdentifier(idCtx);
                List<ColumnContext> joinFields = Lists.newArrayList();
                for (ColumnContext col : sqlContext.getOutputCols()) {
                    if (col.getAlias().equalsIgnoreCase(fieldName)) {
                        joinFields.add(col);
                    }
                }
                if (joinFields.size() == 2) {
                    Pair<ColumnContext, List<ColumnContext>> joinPair = new Pair(joinFields.get(0), Collections.singletonList(joinFields.get(1)));
                    joinPairList.add(joinPair);
                    buildHelper.getJoinCols().add(joinPair);
                }
            }
            result.setJoinCols(joinPairList);

        }
        return result;
    }

    @Override
    public SqlContext visitTableFunction(StarRocksParser.TableFunctionContext ctx) {
        String tableName = unescapeQualifiedName(ctx.qualifiedName());
        SqlContext sqlContext = new SqlContext(ctx);
        TableSimpleSchema schema = null;
        try {
            schema = buildHelper.getSchema(tableName);
            if (schema == null && !tableName.contains(".")) {
                tableName = currentDb + "." + tableName;
                schema = buildHelper.getSchema(tableName);
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("get schema of table %s failed", tableName));
        }
        Map<String, Set<String>> tabAliasMap = Maps.newHashMap();
        tabAliasMap.put(tableName, Sets.newHashSet(tableName));
        sqlContext.setTabAlias(tabAliasMap);

        if (schema != null) {
            List<ColumnContext> fieldOutput = schema.getCols();
            sqlContext.setOutputCols(fieldOutput);
            sqlContext.setInputCols(fieldOutput);
        } else {
            throw new RuntimeException(String.format("cannot find schema of table %s", tableName));
        }
        return sqlContext;
    }

    /**
     * 获取创建表sql：tablename、column\
     * @param ctx
     * @return
     */
    @Override
    public SqlContext visitCreateTableStatement(StarRocksParser.CreateTableStatementContext ctx) {
        CreateSqlContext result = new CreateSqlContext(ctx);
        result.setCreateTable(unescapeQualifiedName(ctx.qualifiedName()));
        buildHelper.getWithTabAlias().put(ctx.qualifiedName().getText(), Sets.newHashSet(ctx.qualifiedName().getText()));
        buildHelper.getContextStack().push(result);
        List<ColumnContext> columnCtx = ctx.columnDesc().stream().map(item -> visit(item).getOutputCols().get(0)).collect(toList());
        result.setCreateColumns(columnCtx);
        buildHelper.getUsedContextStack().push(result);
        buildHelper.getContextStack().pop();
        return result;
    }

    @Override
    public SqlContext visitCreateTableAsSelectStatement(StarRocksParser.CreateTableAsSelectStatementContext ctx) {
        CreateAsSqlContext result = new CreateAsSqlContext(ctx);
        String tableName = unescapeQualifiedName(ctx.qualifiedName());
        result.setCreateTable(tableName);
        SqlContext querySqlContext = visit(ctx.queryStatement());
        result.setSelectSqlContext(querySqlContext);
        if (ctx.identifier() != null) {
            List<ColumnContext> createCols = Lists.newArrayList();
            if (querySqlContext.getOutputCols().size() != ctx.identifier().size()) {
                throw new RuntimeException(String.format("the column number of table %s is not equal than select output", tableName));
            }
            for (int i = 0; i < ctx.identifier().size(); i++) {
                StarRocksParser.IdentifierContext identifierContext = ctx.identifier(i);
                String colName = unescapeIdentifier(identifierContext);
                ColumnContext createCol = new ColumnContext(colName, colName, tableName);
                buildHelper.addSource(createCol, Collections.singletonList(querySqlContext.getOutputCols().get(i)));
                createCols.add(createCol);
            }
            result.setCreateColumns(querySqlContext.getOutputCols());
        } else {
            List<ColumnContext> createCols = Lists.newArrayList();
            if (!buildHelper.isEmptyList(querySqlContext.getOutputCols())) {
                for (int i = 0; i < querySqlContext.getOutputCols().size(); i++) {
                    ColumnContext outputCol = querySqlContext.getOutputCols().get(i);
                    if (!StringUtils.isEmpty(outputCol.getAlias())) {
                        createCols.add(new ColumnContext(outputCol.getAlias(), outputCol.getAlias(), tableName));
                    } else {
                        createCols.add(new ColumnContext("_col" + i, "_col" + i, tableName));
                    }
                }
            }
            result.setCreateColumns(createCols);
        }
        return result;
    }


    @Override
    public SqlContext visitTableRenameClause(StarRocksParser.TableRenameClauseContext ctx) {
        StarRocksParser.IdentifierContext identifierContext = ctx.identifier();
        String fromTableName = unescapeIdentifier(identifierContext);
        AlterSqlContext result = new AlterSqlContext(ctx);
        result.setAlterTable(fromTableName);
        return result;
    }


    private String unescapeQualifiedName(StarRocksParser.QualifiedNameContext ctx) {
        return String.join(".", ctx.identifier().stream().map(id -> unescapeIdentifier(id)).collect(toList()));
    }

    private String unescapeIdentifier(StarRocksParser.IdentifierContext ctx) {
        return SqlStringUtils.unescapeIdentifier(ctx.getText());
    }


}
