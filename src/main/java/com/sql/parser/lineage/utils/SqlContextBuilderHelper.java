package com.sql.parser.lineage.utils;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.sql.parser.lineage.schema.TableSchemaFinder;
import com.sql.parser.lineage.starRocks.ColumnContext;
import com.sql.parser.lineage.starRocks.SqlContext;
import javafx.util.Pair;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by qunyan on 2019/4/11.
 */
@Getter
@Setter
public class SqlContextBuilderHelper extends VisitorHelper {

    private Stack<SqlContext> contextStack = new Stack();
    private Stack<SqlContext> usedContextStack = new Stack();
    private List<Pair<ColumnContext, List<ColumnContext>>> joinCols = Lists.newArrayList();

    private List<SqlContext> joinContext = Lists.newArrayList();

    public SqlContextBuilderHelper(TableSchemaFinder schemaFinder) {
        super(schemaFinder);
    }

    /*
     * 为ColumnContext替换表名
     * */
    public List<ColumnContext> replaceColTable(List<ColumnContext> oldCtxs, String newTab) {
        List<ColumnContext> newCtxs = Lists.newArrayList();
        //exp(row_number() over(partition by kdt_id order by score desc) - 1) as punish 此时name 会获取不到
        for (ColumnContext ctx : oldCtxs) {
            if (ctx == null) {
                continue;
            }
            ColumnContext newCtx = new ColumnContext();
            newCtx.setName(ctx.getName() == null ? "" : ctx.getName());
            newCtx.setAlias(ctx.getAlias());
            newCtx.setTable(newTab);
            newCtx.setSource(Lists.newArrayList(ctx));
            newCtxs.add(newCtx);
        }
        return newCtxs;
    }

    public List<ColumnContext> mergeUnionColumn(List<List<ColumnContext>> outputCols) {
        List<ColumnContext> result = Lists.newArrayList();
        if (equalLength(outputCols)) {
            for (int i = 0; i < outputCols.get(0).size(); i++) {
                ColumnContext colItem = new ColumnContext();
                List<ColumnContext> sourceItem = Lists.newArrayList();
                for (List<ColumnContext> cols : outputCols) {
                    if (cols.get(i)==null){
                        continue;
                    }
                    sourceItem.add(cols.get(i));
                }
                String alias = commonAlias(sourceItem);
                colItem.setName("_c" + i);
                if (alias != null) {
                    colItem.setAlias(alias);
                } else {
                    //union 时可能会有填充字段,比如 select '',0 from
                    String aliasFirst = sourceItem.stream().filter(x -> x.getAlias() != null && !x.getAlias().startsWith("_c")).map(x -> x.getAlias()).findFirst().orElse("_c" + i);
                    colItem.setAlias(aliasFirst);
                }

                colItem.setType("union");
                colItem.setSource(sourceItem);
                result.add(colItem);
            }
        }
        return result;
    }

    public boolean equalLength(List<List<ColumnContext>> lists) {
        if (!lists.isEmpty()) {
            int length = lists.get(0).size();
            for (int i = 1; i < lists.size(); i++) {
                List list = lists.get(i);
                if (list.size() != length)
                    return false;
            }
        }
        return true;
    }

    public String commonAlias(List<ColumnContext> cols) {
        String commAlais = null;
        if (!cols.isEmpty()) {
            commAlais = cols.get(0).getAlias();
            if (commAlais == null) {
                return null;
            }
            for (ColumnContext col : cols) {
                if (col.getAlias() == null || !col.getAlias().equalsIgnoreCase(commAlais)) {
                    return null;
                }
            }
        }
        return commAlais;
    }

    public void addSource(ColumnContext columnContext, List<ColumnContext> newSource) {
        if (!isEmptyList(newSource)) {
            List<ColumnContext> source = columnContext.getSource();
            for (ColumnContext col : newSource) {
                if (source == null) {
                    source = Lists.newArrayList();
                }
                source.add(col);
            }
            columnContext.setSource(source);
        }
    }

    public void addCondition(ColumnContext columnContext, List<ColumnContext> newCondition) {
        if (!isEmptyList(newCondition) && columnContext != null) {
            List<ColumnContext> condition = columnContext.getCondition();
            for (ColumnContext col : newCondition) {
                /*List<ColumnContext> cols = col.getSource();
                if (cols != null && columnContext.containsColumnAlias(cols, columnContext)) {
                    continue;
                }*/
                if (condition == null) {
                    condition = Lists.newArrayList();
                }
                condition.add(col);
            }
            columnContext.setCondition(condition);
        }
    }

    public void addGroupBy(ColumnContext columnContext, List<ColumnContext> newGroupBy) {
        if (!isEmptyList(newGroupBy) && columnContext != null) {
            List<ColumnContext> groupBy = columnContext.getGroupBy();
            for (ColumnContext col : newGroupBy) {
                if (groupBy == null) {
                    groupBy = Lists.newArrayList();
                }
                groupBy.add(col);
            }
            columnContext.setGroupBy(groupBy);
        }
    }

    public void addOrganizationCols(ColumnContext columnContext, List<ColumnContext> newOrgCols) {
        if (!isEmptyList(newOrgCols) && columnContext != null) {
            List<ColumnContext> groupBy = columnContext.getGroupBy();
            for (ColumnContext col : newOrgCols) {
                if (groupBy == null) {
                    groupBy = Lists.newArrayList();
                }
                groupBy.add(col);
            }
            columnContext.setOrganizationCols(groupBy);
        }
    }

    public void addFunction(ColumnContext columnContext, List<ColumnContext> newFunction) {
        if (!isEmptyList(newFunction) && columnContext != null) {
            List<ColumnContext> newFunctionList = newFunction.stream().filter(x -> x != null).collect(Collectors.toList());
            List<String> funs = columnContext.getFunctions();
            for (ColumnContext funCtx : newFunctionList) {
                if (funs == null) {
                    funs = Lists.newArrayList();
                }
                if (!isEmptyList(funCtx.getFunctions())) {
                    funs.addAll(funCtx.getFunctions());
                }
            }
            columnContext.setFunctions(funs);
        }
    }

    public Map<String, Set<String>> getMergedTableAlias(SqlContext queryContext, SqlContext withContext) {
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
        return withTabAlias;
    }

    public ColumnContext generateNewColumnContext(ColumnContext columnContext) {
        ColumnContext newCol = new ColumnContext();
        newCol.setName(columnContext.getName());
        newCol.setAlias(columnContext.getAlias());
        newCol.setTable(columnContext.getTable());
        newCol.setSource(columnContext.getSource());
        return newCol;
    }

    public ColumnContext copyFromColumnContext(ColumnContext columnContext) {
        ColumnContext newCol = new ColumnContext();
        BeanUtils.copyProperties(columnContext, newCol);
        return newCol;
    }

    public void addOutputCondition(SqlContext sql, List<ColumnContext> newConditionCols) {
        if (!isEmptyList(sql.getOutputCols()) && !isEmptyList(newConditionCols)) {
            sql.getOutputCols().stream().forEach(col -> addCondition(col, newConditionCols));
        }
    }

}
