package com.sql.parser.lineage.schema;


import java.util.List;

public interface TableSchemaFinder {

    TableSimpleSchema findSchema(String dbName, String tableName) throws Exception;

    static ColumnContext generateColCtxFromTable(String tableName, String col,Integer secureLevel) {
        ColumnContext result = new ColumnContext();
        result.setName(col);
        result.setAlias(col);
        result.setTable(tableName);
        result.setSecureLevel(secureLevel);
        return result;
    }

    List<DataDictColumn> findColumns(String dbName, String tableName) ;
}
