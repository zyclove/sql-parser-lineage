package com.sql.parser.lineage.doris;


import com.sql.parser.lineage.model.lineage.*;
import doris.DorisParser;
import doris.DorisParser.QuotedIdentifierContext;
import doris.DorisParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

public class DorisPostProcessor extends DorisParserBaseListener {
    private Boolean namedExpressionSeqFlag;
    private TableNameModel outputTable;
    private final HashMap<String, FieldLineageSelectModel> dorisFieldSelects = new LinkedHashMap<>();
    private final Map<Integer, String> selectParentKeyMap = new HashMap<>();
    private String thisSelectId;
    private String parentId;
    private String relationParentId;
    private String sourceSQL;
    private String aliasedQueryParentType;
    private String aliasedQueryParentFromClauseText = "";
    private String aliasedQueryParentFromClauseTextUnion = "";
    private Integer aliasedQueryParentFromClauseTextUnionId = 0;

    private Integer aliasedQueryParentFromClauseId = 0;
    private boolean nameExpressionFlag = false;
    private boolean nameAsFlag = false;
    private boolean unionFastSelectFlag = false;
    private Integer fromClauseContextId = 0;
    private Integer unionIndex = -1;
    private Integer selectIndex = -1;
    /**
     * for select Item
     */
    private FieldLineageSelectItemModel selectItemModel;
    private List<FieldLineageSelectItemModel> selectFields = new ArrayList<>();
    private Boolean startSelectItem = false;
    private final List<FieldLineageSelectModel> dorisFieldSelectList = new ArrayList<>();
    private DorisFieldLineageSelectModel dorisFieldLineageSelectModel;
    private List<DorisFieldLineageSelectModel> dorisFieldLineageSelectModelAllList = new ArrayList<>();
    private List<DorisFieldLineageSelectModel> fieldSelectUnionList = new ArrayList<>();
    FieldLineageSelectModel fieldLineageSelectModel;
    TableNameModel tableNameModel;
    private String tableAlias = "";
    private String aliasedTableTextUnion = "";
    private Boolean dereference = false;
    private TableNameModel targetTable;
    private String fieldAsName;
    String processText;
    String fromClauseContextText = "";
    Boolean isUnionFlag = false;

    /**
     * Remove the back ticks from an Identifier.
     */
    @Override
    public void exitQuotedIdentifier(QuotedIdentifierContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token) ctx.getChild(0).getPayload();

        CommonToken commonToken = new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                DorisParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 1,
                token.getStopIndex() - 1);

        commonToken.setText(commonToken.getText().replace("``", "`"));
        parent.addChild(commonToken);
    }

    /**
     * Treat non-reserved keywords as Identifiers.
     */
    @Override
    public void exitNonReserved(DorisParser.NonReservedContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token) ctx.getChild(0).getPayload();

        parent.addChild(new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                DorisParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 0,
                token.getStopIndex() - 0));
    }

    @Override
    public void enterFromClause(DorisParser.FromClauseContext ctx) {
        aliasedQueryParentFromClauseTextUnion = ctx.getText();
//        aliasedQueryParentFromClauseTextUnionId = ctx.getStart().getStartIndex();

        super.enterFromClause(ctx);
    }

    @Override
    public void enterTableAlias(DorisParser.TableAliasContext ctx) {
        super.enterTableAlias(ctx);
    }


    @Override
    public void enterAliasedQuery(DorisParser.AliasedQueryContext ctx) {
        if (aliasedQueryParentType.equals("RELATION")) {
            aliasedQueryParentFromClauseText = Optional.ofNullable(ctx.getParent().getParent()).map(ParserRuleContext::getText).orElse("");
            aliasedQueryParentFromClauseId = Optional.ofNullable(ctx.getParent().getParent()).map(ParserRuleContext::getStart).get().getStartIndex();

        }
        if (aliasedQueryParentType.equals("JOIN_RELATION")) {
            aliasedQueryParentFromClauseText = Optional.ofNullable(ctx.getParent().getParent().getParent().getParent()).map(ParserRuleContext::getText).orElse("");
            aliasedQueryParentFromClauseId = Optional.ofNullable(ctx.getParent().getParent().getParent().getParent()).map(ParserRuleContext::getStart).get().getStartIndex();

        }
        tableAlias = ctx.tableAlias().getText();

        super.enterAliasedQuery(ctx);
    }

    @Override
    public void enterRelation(DorisParser.RelationContext ctx) {
        aliasedQueryParentType = "RELATION";
        super.enterRelation(ctx);
    }


    @Override
    public void enterJoinRelation(DorisParser.JoinRelationContext ctx) {
        aliasedQueryParentType = "JOIN_RELATION";
        super.enterJoinRelation(ctx);
    }


    @Override
    public void enterSelectClause(DorisParser.SelectClauseContext ctx) {
        String fromClauseText = Optional.ofNullable(((DorisParser.RegularQuerySpecificationContext) ctx.parent))
                .map(DorisParser.RegularQuerySpecificationContext::fromClause)
                .map(DorisParser.FromClauseContext::getText).orElse("");
        DorisParser.FromClauseContext fromClauseContext = Optional.ofNullable(((DorisParser.RegularQuerySpecificationContext) ctx.parent))
                .map(DorisParser.RegularQuerySpecificationContext::fromClause).get();
        fromClauseContextText = fromClauseContext.getText();
        fromClauseContextId = fromClauseContext.getStart().getStartIndex();
        if (isUnionFlag && unionIndex == -1) {
            unionIndex = 0;
        } else if (isUnionFlag && unionIndex >= 0) {
            unionIndex += 1;
        }
        selectIndex = 0;
        super.enterSelectClause(ctx);
    }

    @Override
    public void enterNamedExpressionSeq(DorisParser.NamedExpressionSeqContext ctx) {
        namedExpressionSeqFlag = true;
        super.enterNamedExpressionSeq(ctx);
    }

    @Override
    public void exitNamedExpressionSeq(DorisParser.NamedExpressionSeqContext ctx) {
        namedExpressionSeqFlag = false;
        super.exitNamedExpressionSeq(ctx);
    }

    @Override
    public void enterNamedExpression(DorisParser.NamedExpressionContext ctx) {
        final Optional<DorisParser.ErrorCapturingIdentifierContext> errorCapturingIdentifierContext = Optional.ofNullable(ctx.errorCapturingIdentifier());
        String fieldName = Optional.ofNullable(ctx.errorCapturingIdentifier()).map(DorisParser.ErrorCapturingIdentifierContext::getText).orElse("");
        if (fieldName.equals("")) {
            nameAsFlag = false;
        } else {
            nameAsFlag = true;
        }
        nameExpressionFlag = true;
        final String text = ctx.getText();


        processText = Optional.ofNullable(ctx).map(DorisParser.NamedExpressionContext::expression)
                .map(DorisParser.ExpressionContext::getText)
                .orElse("");

        fieldAsName = Optional.ofNullable(ctx.errorCapturingIdentifier())
                .map(DorisParser.ErrorCapturingIdentifierContext::getText)
                .orElse("");
        super.enterNamedExpression(ctx);
    }

    @Override
    public void enterDereference(DorisParser.DereferenceContext ctx) {
        dereference = true;
        super.enterDereference(ctx);
    }

    @Override
    public void exitDereference(DorisParser.DereferenceContext ctx) {
        dereference = false;
        super.exitDereference(ctx);
    }


    @Override
    public void enterColumnReference(DorisParser.ColumnReferenceContext ctx) {
        String computedFieldName = "";
        String fieldTableAliasName = "";
        dorisFieldLineageSelectModel = new DorisFieldLineageSelectModel();
        dorisFieldLineageSelectModel.setId(fromClauseContextId.toString());
        if (isUnionFlag && unionFastSelectFlag) {
            dorisFieldLineageSelectModel.setParentText(aliasedQueryParentFromClauseTextUnion);
            dorisFieldLineageSelectModel.setParentTableAlias(aliasedTableTextUnion);
            dorisFieldLineageSelectModel.setParentId(aliasedQueryParentFromClauseTextUnionId.toString());

        } else {
            dorisFieldLineageSelectModel.setParentId(aliasedQueryParentFromClauseId.toString());
            dorisFieldLineageSelectModel.setParentTableAlias(tableAlias);
            dorisFieldLineageSelectModel.setParentText(aliasedQueryParentFromClauseText);

        }


        dorisFieldLineageSelectModel.setSelfText(fromClauseContextText);
//        if ((namedExpressionSeqFlag && !isUnionFlag) || (namedExpressionSeqFlag && unionIndex == 0)) {
        if (namedExpressionSeqFlag) {
            if (dereference) {
                computedFieldName = Optional.ofNullable((DorisParser.DereferenceContext) ctx.parent)
                        .map(DorisParser.DereferenceContext::identifier)
                        .map(DorisParser.IdentifierContext::getText).orElse("");
                fieldTableAliasName = ctx.getText();
                dorisFieldLineageSelectModel.setFieldTableAlias(fieldTableAliasName);
                dereference = false;
            } else {
                computedFieldName = ctx.getText();
            }
            if (!nameAsFlag) {
                dorisFieldLineageSelectModel.setFieldName(computedFieldName);
            } else {
                dorisFieldLineageSelectModel.setFieldName(fieldAsName);
            }
            dorisFieldLineageSelectModel.setComputedFieldName(computedFieldName);
            dorisFieldLineageSelectModel.setSelfFieldNameKey(dorisFieldLineageSelectModel.getId() + "_" + dorisFieldLineageSelectModel.getFieldTableAlias() + "_" + dorisFieldLineageSelectModel.getFieldName());
            dorisFieldLineageSelectModel.setSelfComputedFieldKey(dorisFieldLineageSelectModel.getId() + "_" + dorisFieldLineageSelectModel.getFieldTableAlias() + "_" + dorisFieldLineageSelectModel.getComputedFieldName());
            dorisFieldLineageSelectModel.setParentFieldNameKey(dorisFieldLineageSelectModel.getParentId() + "_" + dorisFieldLineageSelectModel.getParentTableAlias() + "_" + dorisFieldLineageSelectModel.getFieldName());
            dorisFieldLineageSelectModel.setParentSecondFieldNameKey(dorisFieldLineageSelectModel.getParentId() + "_" + "_" + dorisFieldLineageSelectModel.getFieldName());
            dorisFieldLineageSelectModelAllList.add(dorisFieldLineageSelectModel);
//            if (unionIndex == 0) {
//                fieldSelectUnionList.add(dorisFieldLineageSelectModel);
//            }
        }
        selectIndex += 1;
        super.enterColumnReference(ctx);
    }

    @Override
    public void enterTableName(DorisParser.TableNameContext ctx) {
        tableNameModel = new TableNameModel();
//        tableNameModel = Optional.ofNullable(ctx).map(DorisParser.TableNameContext::getText).map(TableNameModel::parseTableName).get();
        tableNameModel = Optional.ofNullable(ctx).map(DorisParser.TableNameContext::multipartIdentifier).map(RuleContext::getText).map(TableNameModel::parseTableName).get();

        Integer startIndex = ctx.getParent().getParent().getStart().getStartIndex();
        for (DorisFieldLineageSelectModel lineageSelectModel : dorisFieldLineageSelectModelAllList) {
            if (lineageSelectModel.getId().equals(startIndex.toString())) {
                lineageSelectModel.setFromTable(tableNameModel);
            }
        }
        super.enterTableName(ctx);
    }

    @Override
    public void enterInsertIntoTable(DorisParser.InsertIntoTableContext ctx) {
        targetTable = new TableNameModel();
        targetTable = Optional.ofNullable(ctx).map(DorisParser.InsertIntoTableContext::multipartIdentifier)
                .map(DorisParser.MultipartIdentifierContext::getText)
                .map(TableNameModel::parseTableName)
                .get();
        super.enterInsertIntoTable(ctx);
    }

    /**
     * 判断是否使用了union关键字
     * @param ctx
     */
    @Override
    public void enterSetOperation(DorisParser.SetOperationContext ctx) {
        TerminalNode union = ctx.UNION();
        if (ctx.UNION() != null) {
            isUnionFlag = true;
            aliasedTableTextUnion = tableAlias;
            aliasedQueryParentFromClauseTextUnionId = fromClauseContextId;
        }
        super.enterSetOperation(ctx);
    }

    @Override
    public void enterQueryTermDefault(DorisParser.QueryTermDefaultContext ctx) {
//        DorisParser.QueryTermContext queryTermContext = Optional.ofNullable((DorisParser.QueryTermContext) ctx.parent).get();
//        282 是 UNION
        if (ctx.getParent().getTokens(282).size() != 0) {
            unionFastSelectFlag = true;
        } else {
            unionFastSelectFlag = false;
        }
        super.enterQueryTermDefault(ctx);
    }

    @Override
    public void exitSetOperation(DorisParser.SetOperationContext ctx) {
        isUnionFlag = false;
        unionIndex = -1;
        fieldSelectUnionList.clear();
        super.enterSetOperation(ctx);
    }

    /**
     * 转换HashMap存储为List
     */
    private void transSelectToList() {
        for (String key : dorisFieldSelects.keySet()) {
            dorisFieldSelectList.add(dorisFieldSelects.get(key));
        }
    }

    /**
     * 获取目标字段
     * 也就是parentId为null的最外层select的字段别名
     */
    private List<FieldNameModel> getTargetFields() {
        List<List<String>> items = dorisFieldSelectList.stream()
                .filter(item -> item.getParentId() == null)
                .map(FieldLineageSelectModel::getSelectItems)
                .map(fields -> fields.stream()
                        .map(FieldLineageSelectItemModel::getAlias)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        List<String> res = new ArrayList<>();
        for (List<String> item : items) {
            res.addAll(item);
        }
        res = res.stream().distinct().collect(Collectors.toList());
        List<FieldNameModel> fieldNameModels = new ArrayList<>();
        for (String i : res) {
            FieldNameModel fieldNameModel = new FieldNameModel();
            if (outputTable != null) {
                fieldNameModel.setDbName(outputTable.getDbName());
                fieldNameModel.setTableName(outputTable.getTableName());
            }
            fieldNameModel.setFieldName(i);
            fieldNameModels.add(fieldNameModel);
        }
        return fieldNameModels;
    }

    private HashSet<FieldNameWithProcessModel> sourceFields;
    private String fieldProcess = "";

    /**
     * 递归按每个字段从外到内寻找每个字段的来源
     * 逻辑为最外的字段别名，父id -> 匹配子id别名 ->
     * -> 如果是来源是表，存储，如果来源是子select，继续递归
     */
    private void findFieldSource(String targetField, String parentId) {
    }

    public List<FieldLineageModel> getDorisFieldLineage() {
        List<DorisFieldLineageSelectModel> collect = dorisFieldLineageSelectModelAllList.stream().filter(i -> i.getParentId().equals("0"))
                .map(i -> {
                    i.setChildren(getSourceFields(i, dorisFieldLineageSelectModelAllList));
                    return i;
                }).collect(Collectors.toList());
        List<FieldLineageModel> fieldLineageModels = new ArrayList<>();
        HashMap<String, FieldLineageModel> fieldLineageModelMap = new LinkedHashMap<>();

        HashMap<String, FieldLineageModel> dorisFieldLineageMap = new LinkedHashMap<>();

        for (DorisFieldLineageSelectModel lineageSelectModel : collect) {
            FieldNameModel targetFieldNameModel = new FieldNameModel();
            targetFieldNameModel.setFieldName(lineageSelectModel.getFieldName());
            targetFieldNameModel.setTableName(targetTable.getTableName());
            targetFieldNameModel.setDbName(targetTable.getDbName());
            FieldLineageModel fieldLineageModel = new FieldLineageModel();
            fieldLineageModel.setTargetField(targetFieldNameModel);
            String targetHashCode = targetFieldNameModel.hashCode() + "";
            dorisFieldLineageMap.put(targetHashCode, fieldLineageModel);
            HashSet<FieldNameWithProcessModel> sourceFieldsEmpty = new HashSet<>();
            FieldNameWithProcessModel sourceCleanFields = getSourceCleanFields(lineageSelectModel, dorisFieldLineageMap, targetHashCode, sourceFieldsEmpty);
//            if (sourceCleanFields == null) {
//                continue;
//            }
            fieldLineageModel.setSourceFields(sourceFieldsEmpty);

            /*
             * 相同 field 的需要将进行合并
             * */
            if (fieldLineageModelMap.get(fieldLineageModel.getTargetField().getFieldName()) != null) {
                FieldLineageModel fieldModel1 = fieldLineageModelMap.get(fieldLineageModel.getTargetField().getFieldName());
                HashSet<FieldNameWithProcessModel> sourceFields1 = fieldModel1.getSourceFields();
                sourceFields1.addAll(fieldLineageModel.getSourceFields());
                fieldLineageModel.setSourceFields(sourceFields1);
            }
            fieldLineageModelMap.put(fieldLineageModel.getTargetField().getFieldName(), fieldLineageModel);
        }
        fieldLineageModelMap.forEach((key, value) -> fieldLineageModels.add(value));
        return fieldLineageModels;
    }

    private FieldNameWithProcessModel getSourceCleanFields(DorisFieldLineageSelectModel i, HashMap<String, FieldLineageModel> dorisFieldLineageMap, String targetHashCode, HashSet<FieldNameWithProcessModel> sourceFieldsEmpty) {
        if (i.getChildren().size() != 0) {
            i.getChildren().forEach(lineageSelectModel -> {
                        getSourceCleanFields(lineageSelectModel, dorisFieldLineageMap, targetHashCode, sourceFieldsEmpty);
                    }
            );
        } else if (i.getFromTable() != null) {
            FieldNameWithProcessModel fieldNameWithProcessModel = new FieldNameWithProcessModel();
            fieldNameWithProcessModel.setDbName(i.getFromTable().getDbName());
            fieldNameWithProcessModel.setTableName(i.getFromTable().getTableName());
            fieldNameWithProcessModel.setFieldName(i.getComputedFieldName());
            fieldNameWithProcessModel.setProcess(i.getProcess());
            sourceFieldsEmpty.add(fieldNameWithProcessModel);
        }
        return null;
    }

    private List<DorisFieldLineageSelectModel> getSourceFields(DorisFieldLineageSelectModel root, List<DorisFieldLineageSelectModel> all) {
        List<DorisFieldLineageSelectModel> children = all.stream().filter(i -> {
            if (i.getParentFieldNameKey().equals(root.getSelfComputedFieldKey())) {
                return true;
            } else if (i.getParentSecondFieldNameKey().equals(root.getSelfComputedFieldKey())) {
                return true;
            } else {
                return false;
            }
        }).map(i -> {
            i.setChildren(getSourceFields(i, all));
            return i;
        }).collect(Collectors.toList());
        return children;
    }


}

