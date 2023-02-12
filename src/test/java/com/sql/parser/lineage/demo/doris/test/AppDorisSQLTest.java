package com.sql.parser.lineage.demo.doris.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sql.parser.lineage.SqlParserFactory;
import com.sql.parser.lineage.SqlParserService;
import com.sql.parser.lineage.enums.SqlEngineEnum;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * Unit test for simple App.
 */
public class AppDorisSQLTest {
    String abPath = "src/test/java/com/sql/parser/lineage/demo/doris";

    /**
     * Rigorous Test :-)
     */
    @Test
    public void dorisDemo1() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);

        String demo01 = getSQLFileData("/sql/demo01.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo01), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");

    }

    /*
     * 使用Antlr4 监听器模式LISTENER，解析语法
     * */
    @Test
    public void dorisDemo2() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String sql = getSQLFileData("/sql/demo02.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(sql), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");
    }

    @Test
    public void dorisDemo3() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo03 = getSQLFileData("/sql/demo03.sql");
        System.out.println("demo03 :" + demo03);
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo03), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");
    }


    @Test
    public void dorisDemo04() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo04 = getSQLFileData("/sql/demo04.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo04), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
    }

    @Test
    public void dorisDemo05() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo04 = getSQLFileData("/sql/demo05.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo04), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
    }

    @Test
    public void dorisDemo11() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo11 = getSQLFileData("/sql/demo11.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo11), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
    }

    @Test
    public void dorisDemo12() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo11 = getSQLFileData("/sql/demo12.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo11), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
    }

    @Test
    public void dorisDemo13() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo11 = getSQLFileData("/sql/demo13.sql");
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo11), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
    }

    @Test
    public void dorisDemo14() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.DORIS_LISTENER);
        String demo14 = getSQLFileData("/sql/demo14.sql");
        System.out.println("demo14: " + demo14);
        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo14), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
    }

    public String getSQLFileData(String fileName) {
        String inputFile = System.getProperty("user.dir") + File.separator + abPath + File.separator + fileName;
        String data = "";
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            data = IOUtils.toString(fis, "UTF-8");
        } catch (Exception e) {
            System.out.println("数据读取失败：" + inputFile);
        }
        return data;
    }

}
