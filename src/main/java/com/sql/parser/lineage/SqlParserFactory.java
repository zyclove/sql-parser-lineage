package com.sql.parser.lineage;

import com.sql.parser.lineage.doris.MyDorisSqlListenerParser;
import com.sql.parser.lineage.doris.MyDorisSqlVisitorParser;
import com.sql.parser.lineage.enums.SqlEngineEnum;
import com.sql.parser.lineage.hive.MyHiveSqlParser;
import com.sql.parser.lineage.presto.MyPresoSqlParser;

/**
 * @ClassName SqlParserFactory
 * @description:
 * @author: again
 * @Date: 2021/3/10 4:21 下午
 */
public class SqlParserFactory {

    public static SqlParserService getParser(SqlEngineEnum sqlEngineEnum) {
        if (SqlEngineEnum.HIVE.equals(sqlEngineEnum)) {
            return new MyHiveSqlParser();
        } else if (SqlEngineEnum.PRESTO.equals(sqlEngineEnum)) {
            return new MyPresoSqlParser();
        } else if (SqlEngineEnum.DORIS_VISITOR.equals(sqlEngineEnum)) {
            return new MyDorisSqlVisitorParser();
        } else if (SqlEngineEnum.DORIS_LISTENER.equals(sqlEngineEnum)) {
            return new MyDorisSqlListenerParser();
        }
        throw new RuntimeException("db type is not support");
    }
}
