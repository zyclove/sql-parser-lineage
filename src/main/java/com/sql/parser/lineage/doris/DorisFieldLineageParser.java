package com.sql.parser.lineage.doris;


import com.sql.parser.lineage.model.lineage.*;
import com.sql.parser.lineage.doris.DorisParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.Collectors;

import static com.sql.parser.lineage.doris.DorisParser.*;


public class DorisFieldLineageParser extends DorisParserBaseVisitor {

    private TableNameModel outputTable;
    private final HashMap<String, FieldLineageSelectModel> dorisFieldSelects = new LinkedHashMap<>();
    private final Map<Integer, String> selectParentKeyMap = new HashMap<>();
    private String thisSelectId;
    private String parentId;
    private String relationParentId;
    private final String sourceSQL;
    private List<String> parentList = new ArrayList<>();
    private String aliasedQueryParentType;
    private String aliasedQueryParentFromClauseText = "";
    private Integer aliasedQueryParentFromClauseId = 0;
    private boolean nameExpressionFlag = false;
    private boolean nameAsFlag = false;
    private Integer fromClauseContextId;
    /**
     * for select Item
     */
    private FieldLineageSelectItemModel selectItemModel;
    private List<FieldLineageSelectItemModel> selectFields = new ArrayList<>();
    private Boolean startSelectItem = false;
    private final List<FieldLineageSelectModel> dorisFieldSelectList = new ArrayList<>();
    private DorisFieldLineageSelectModel dorisFieldLineageSelectModel;
    private List<DorisFieldLineageSelectModel> dorisFieldLineageSelectModelAllList = new ArrayList<>();
    private List<DorisFieldLineageSelectModel> dorisFieldLineageSelectModelPartList = new ArrayList<>();
    private List<DorisFieldLineageSelectModel> selectModelFromList = new ArrayList<>();
    FieldLineageSelectModel fieldLineageSelectModel;
    TableNameModel tableNameModel;
    private String tableAlias = "";
    private Boolean dereference = false;
    private TableNameModel targetTable;
    private String fieldAsName;
    String processText;
    String fromClauseContextText = "";

    @Override
    public Object visitFromClause(FromClauseContext ctx) {

        return super.visitFromClause(ctx);
    }

    @Override
    public Object visitRelation(DorisParser.RelationContext ctx) {
        aliasedQueryParentType = "RELATION";
        return super.visitRelation(ctx);
    }

    @Override
    public Object visitRegularQuerySpecification(DorisParser.RegularQuerySpecificationContext ctx) {
        return super.visitRegularQuerySpecification(ctx);
    }

    @Override
    public Object visitJoinRelation(DorisParser.JoinRelationContext ctx) {
        aliasedQueryParentType = "JOIN_RELATION";
        return super.visitJoinRelation(ctx);
    }

    @Override
    public Object visitAliasedQuery(DorisParser.AliasedQueryContext ctx) {
        if (aliasedQueryParentType.equals("RELATION")) {
            aliasedQueryParentFromClauseText = Optional.ofNullable(ctx.getParent().getParent()).map(ParserRuleContext::getText).orElse("");
            aliasedQueryParentFromClauseId = Optional.ofNullable(ctx.getParent().getParent()).map(ParserRuleContext::getStart).get().getStartIndex();

        }
        if (aliasedQueryParentType.equals("JOIN_RELATION")) {
            aliasedQueryParentFromClauseText = Optional.ofNullable(ctx.getParent().getParent().getParent()).map(ParserRuleContext::getText).orElse("");
            aliasedQueryParentFromClauseId = Optional.ofNullable(ctx.getParent().getParent().getParent()).map(ParserRuleContext::getStart).get().getStartIndex();

        }
        tableAlias = ctx.tableAlias().getText();
        return super.visitAliasedQuery(ctx);
    }

    @Override
    public Object visitSelectClause(DorisParser.SelectClauseContext ctx) {
        ParseTree child = ctx.getParent().getChild(1);
        String fromClauseText = Optional.ofNullable(((DorisParser.RegularQuerySpecificationContext) ctx.parent))
                .map(DorisParser.RegularQuerySpecificationContext::fromClause)
                .map(DorisParser.FromClauseContext::getText).orElse("");
        DorisParser.FromClauseContext fromClauseContext = Optional.ofNullable(((DorisParser.RegularQuerySpecificationContext) ctx.parent))
                .map(DorisParser.RegularQuerySpecificationContext::fromClause).get();
        fromClauseContextText = fromClauseContext.getText();
        fromClauseContextId = fromClauseContext.getStart().getStartIndex();

        return super.visitSelectClause(ctx);
    }


    @Override
    public Object visitNamedExpression(DorisParser.NamedExpressionContext ctx) {
        final Optional<DorisParser.ErrorCapturingIdentifierContext> errorCapturingIdentifierContext = Optional.ofNullable(ctx.errorCapturingIdentifier());
        String fieldName = Optional.ofNullable(ctx.errorCapturingIdentifier()).map(ErrorCapturingIdentifierContext::getText).orElse("");
        if (fieldName.equals("")) {
            nameAsFlag = false;
        } else {
            nameAsFlag = true;
        }
        nameExpressionFlag = true;
        final String text = ctx.getText();


        processText = Optional.ofNullable(ctx).map(NamedExpressionContext::expression)
                .map(ExpressionContext::getText)
                .orElse("");

        fieldAsName = Optional.ofNullable(ctx.errorCapturingIdentifier())
                .map(ErrorCapturingIdentifierContext::getText)
                .orElse("");
        return super.visitNamedExpression(ctx);
    }

    @Override
    public Object visitDereference(DorisParser.DereferenceContext ctx) {
        if (nameExpressionFlag) {
            dereference = true;
        }
        return super.visitDereference(ctx);
    }


    @Override
    public Object visitColumnReference(ColumnReferenceContext ctx) {
        String computedFieldName = "";
        String fieldTableAliasName = "";
        dorisFieldLineageSelectModel = new DorisFieldLineageSelectModel();
        dorisFieldLineageSelectModel.setId(fromClauseContextId.toString());
        // 字段父级字段逻辑调整：
        dorisFieldLineageSelectModel.setParentId(aliasedQueryParentFromClauseId.toString());
        dorisFieldLineageSelectModel.setParentTableAlias(tableAlias);
        dorisFieldLineageSelectModel.setParentText(aliasedQueryParentFromClauseText);

        dorisFieldLineageSelectModel.setSelfText(fromClauseContextText);
        if (nameExpressionFlag) {
            if (dereference) {
                computedFieldName = Optional.ofNullable((DereferenceContext) ctx.parent)
                        .map(DereferenceContext::identifier)
                        .map(IdentifierContext::getText).orElse("");
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
            //
            dorisFieldLineageSelectModel.setParentFieldNameKey(dorisFieldLineageSelectModel.getParentId() + "_" + dorisFieldLineageSelectModel.getParentTableAlias() + "_" + dorisFieldLineageSelectModel.getFieldName());
            dorisFieldLineageSelectModel.setParentSecondFieldNameKey(dorisFieldLineageSelectModel.getParentId() + "_" + dorisFieldLineageSelectModel.getFieldName());
            dorisFieldLineageSelectModelAllList.add(dorisFieldLineageSelectModel);
        }
        return super.visitColumnReference(ctx);
    }

    @Override
    public Object visitComparison(ComparisonContext ctx) {
        nameExpressionFlag = false;
        return super.visitComparison(ctx);
    }


    @Override
    public Object visitTableName(TableNameContext ctx) {
        tableNameModel = new TableNameModel();
        tableNameModel = Optional.ofNullable(ctx).map(TableNameContext::getText).map(TableNameModel::parseTableName).get();
        Integer startIndex = ctx.getParent().getParent().getStart().getStartIndex();
        Object visit = super.visitTableName(ctx);
        for (DorisFieldLineageSelectModel lineageSelectModel : dorisFieldLineageSelectModelAllList) {
            if (lineageSelectModel.getId().equals(startIndex.toString())) {
                lineageSelectModel.setFromTable(tableNameModel);
            }
        }
        return visit;
    }


    @Override
    public Object visitInsertIntoTable(InsertIntoTableContext ctx) {
        targetTable = new TableNameModel();
        targetTable = Optional.ofNullable(ctx).map(InsertIntoTableContext::multipartIdentifier)
                .map(MultipartIdentifierContext::getText)
                .map(TableNameModel::parseTableName)
                .get();
        return super.visitInsertIntoTable(ctx);
    }

    public DorisFieldLineageParser(String sql) {
        this.sourceSQL = sql;
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
        } else {
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
            return i.getParentFieldNameKey().equals(root.getSelfComputedFieldKey());
        }).map(i -> {
            i.setChildren(getSourceFields(i, all));
            return i;
        }).collect(Collectors.toList());
        return children;
    }

}
