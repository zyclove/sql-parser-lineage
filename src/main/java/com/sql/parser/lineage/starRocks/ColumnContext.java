package com.sql.parser.lineage.starRocks;

import com.google.common.collect.Sets;
import com.sql.parser.lineage.entity.ColumnItem;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
public class ColumnContext {
    private String alias;
    private String name;
    private String table;
    private Integer secureLevel;
    private List<ColumnContext> source;
    private List<ColumnContext> condition;
    private List<ColumnContext> groupBy;
    private List<String> functions;
    private List<ColumnContext> organizationCols;
    private String type = "";
    private Boolean isAsterisk = false; //used to identify count(*) and count(1)

    public ColumnContext() {}

    public ColumnContext(String alias, String name, String table) {
        this.alias = alias;
        this.name = name;
        this.table = table;
    }

    public Set<ColumnItem> getColSource() {
        Set<ColumnItem> result = Sets.newLinkedHashSet();
        if (getSource() != null) {
            getSource().stream().forEach(col -> result.addAll(getColSource(col)));
        } else if (!StringUtils.isEmpty(getTable()) && !StringUtils.isEmpty(getName())) {
            result.add(new ColumnItem(getTable(), getName()));
        }
        return result;
    }

    public Set<ColumnItem> getColCondition() {
        Set<ColumnItem> result = Sets.newHashSet();
        if (getCondition() != null) {
            getCondition().stream().filter(Objects::nonNull).forEach(col -> result.addAll(getColCondition(col, false)));
        }
        if (getSource() != null) {
            getSource().stream().filter(Objects::nonNull).forEach(col -> result.addAll(getColCondition(col, true)));
        }
        return result;
    }

    public Set<ColumnItem> getColGroupBy() {
        Set<ColumnItem> result = Sets.newHashSet();
        if (getSource() != null) {
            getSource().stream().filter(Objects::nonNull).forEach(col -> result.addAll(getColGroupBy(col, true)));
        }
        if (getGroupBy() != null) {
            getGroupBy().stream().filter(Objects::nonNull).forEach(col -> result.addAll(getColGroupBy(col, false)));
        }
        return result;
    }

    public void getColSource(ColumnContext original, Set<ColumnItem> result) {
        //add function check, if it's count() , no column need to be return
        if (original == null) {
            return;
        }
        if (original.getIsAsterisk()
                && original.getFunctions() != null
                && original.getFunctions().size() == 1
                && original.getFunctions().get(0).toLowerCase().equals("count")) {
            return;
        }
        if (original.getSource() != null) {
            for (ColumnContext childCtx : original.getSource()) {
                if (childCtx != null) {
                    if (containsColumn(result, childCtx)) {
                        continue;
                    }
                    getColSource(childCtx, result);
                }
            }
        } else if (!StringUtils.isEmpty(original.getTable()) && !StringUtils.isEmpty(original.getName())) {
            ColumnItem columnItem = new ColumnItem();
            columnItem.setTable(original.getTable().toLowerCase());
            columnItem.setColName(original.getName().toLowerCase());
            result.add(columnItem);
        }
    }

    public Set<ColumnItem> getColSource(ColumnContext original) {
        Set<ColumnItem> result = Sets.newLinkedHashSet();
        getColSource(original, result);
        return result;
    }

    public void getColCondition(ColumnContext original, boolean fromSource, Set<ColumnItem> result) {
        //add function check, if it's count() , no column need to be return
        if (original.getIsAsterisk()
                && original.getFunctions() != null
                && original.getFunctions().size() == 1
                && original.getFunctions().get(0).toLowerCase().equals("count")) {
            return;
        }
        if (original.getSource() != null) {
            for (ColumnContext childCtx : original.getSource()) {
                if (childCtx != null) {
                    if (containsColumn(result, childCtx)) {
                        continue;
                    }
                    getColCondition(childCtx, fromSource, result);
                }
            }
        } else if (!fromSource && !StringUtils.isEmpty(original.getTable()) && !StringUtils.isEmpty(original.getName())) {
            ColumnItem columnItem = new ColumnItem();
            columnItem.setTable(original.getTable().toLowerCase());
            columnItem.setColName(original.getName().toLowerCase());
            result.add(columnItem);
        }
        if (original.getCondition() != null) {
            for (ColumnContext childCtx : original.getCondition()) {
                if (childCtx != null) {
                    if (containsColumn(result, childCtx)) {
                        continue;
                    }
                    getColCondition(childCtx, false, result);
                }
            }
        }
    }

    public Set<ColumnItem> getColCondition(ColumnContext original, boolean fromSource) {
        Set<ColumnItem> result = Sets.newHashSet();
        getColCondition(original, fromSource, result);
        return result;
    }

    public void getColGroupBy(ColumnContext original, boolean fromSource, Set<ColumnItem> result) {
        //add function check, if it's count() , no column need to be return
        if (original.getIsAsterisk()
                && original.getFunctions() != null
                && original.getFunctions().size() == 1
                && original.getFunctions().get(0).toLowerCase().equals("count")) {
            return;
        }
        if (original.getSource() != null) {
            for (ColumnContext childCtx : original.getSource()) {
                if (childCtx != null) {
                    if (containsColumn(result, childCtx)) {
                        continue;
                    }
                    getColGroupBy(childCtx, fromSource, result);
                }
            }
        } else if (!fromSource && !StringUtils.isEmpty(original.getTable()) && !StringUtils.isEmpty(original.getName())) {
            ColumnItem columnItem = new ColumnItem();
            columnItem.setTable(original.getTable().toLowerCase());
            columnItem.setColName(original.getName().toLowerCase());
            result.add(columnItem);
        }
        if (original.getGroupBy() != null) {
            for (ColumnContext childCtx : original.getGroupBy()) {
                if (childCtx != null) {
                    if (containsColumn(result, childCtx)) {
                        continue;
                    }
                    getColGroupBy(childCtx, false, result);
                }
            }
        }
    }

    public Set<ColumnItem> getColGroupBy(ColumnContext original, boolean fromSource) {
        Set<ColumnItem> result = Sets.newHashSet();
        getColGroupBy(original, fromSource, result);
        return result;
    }

    public boolean containsColumn(Collection<ColumnItem> columnItems, ColumnContext columnContext) {
        for (ColumnItem item : columnItems) {
            if (item.toString().equals(columnContext.getFullColName())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsColumnAlias(Collection<ColumnContext> columnContexts, ColumnContext columnContext) {
        for (ColumnContext col : columnContexts) {
            if (col.getAlias() != null
                    && columnContext.getAlias() != null
                    && col.getAlias().equals(columnContext.getAlias())) {
                return true;
            }
        }
        return false;
    }

    public String getFullColName() {
        return String.format("%s.%s", table, name);
    }
}

