package com.sql.parser.lineage.demo.starRocks.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sql.parser.lineage.SqlParserFactory;
import com.sql.parser.lineage.SqlParserService;
import com.sql.parser.lineage.enums.SqlEngineEnum;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class starRcoksSqlTest {

    String abPath = "src/test/java/com/sql/parser/lineage/demo/starRocks";

    @Test
    public void test1() {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.STARROCKS_LISTENER);

        String demo01 = getSQLFileData("/sql/demo01.sql");
        System.out.println("字段血源:" + demo01);
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(demo01), SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
        System.out.println("\n");
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
