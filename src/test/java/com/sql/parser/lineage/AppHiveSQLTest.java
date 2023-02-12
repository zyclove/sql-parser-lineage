package com.sql.parser.lineage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sql.parser.lineage.enums.SqlEngineEnum;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppHiveSQLTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void HiveDemo1() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.HIVE);
        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, t2.name FROM( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
        System.out.println("sql类型");
        System.out.println(parserService.parseSqlType(sql));
        System.out.println("\n");

        System.out.println("sql格式化");
        System.out.println(parserService.parseSqlFormatter(sql));
        System.out.println("\n");

        System.out.println("表血缘");
        System.out.println(JSON.toJSONString(parserService.parseSqlTableLineage(sql), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");

        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(sql), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");

        String createSql = "CREATE TABLE db1.table1 (id number comment 'id', name string comment '姓名', age number)";
        System.out.println("元数据");
        System.out.println(JSON.toJSONString(parserService.parseSqlMetadata(createSql), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");

    }
}
