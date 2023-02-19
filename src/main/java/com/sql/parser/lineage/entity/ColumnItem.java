package com.sql.parser.lineage.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class ColumnItem implements Serializable {
    private String table;
    private String colName;

    public ColumnItem() {}

    public ColumnItem(String table, String colName) {
        this.table = table;
        this.colName = colName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnItem that = (ColumnItem) o;
        return Objects.equals(table, that.table) &&
                Objects.equals(colName, that.colName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, colName);
    }

    @Override
    public String toString() {
        return String.format("%s.%s", table, colName);
    }
}
