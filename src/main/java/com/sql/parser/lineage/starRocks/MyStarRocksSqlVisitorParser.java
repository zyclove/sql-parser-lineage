package com.sql.parser.lineage.starRocks;


import com.sql.parser.lineage.SqlParserAbstract;
import com.sql.parser.lineage.entity.dto.TableLineageDto;
import com.sql.parser.lineage.enums.SqlEngine;
import com.sql.parser.lineage.utils.SQLUtil;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;
import org.codehaus.plexus.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;


@Slf4j
public class MyStarRocksSqlVisitorParser extends SqlParserAbstract {

    private ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);


    public List<TableLineageDto> tableLineage(String statement, String engine) throws Exception {
        SqlEngine sqlEngine = checkParams(statement, engine);
        List<String> stmts = SQLUtil.splitSql(statement);
        SqlContext sqlContext = null;
        try {
            sqlContext = parse(stmts.get(0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (sqlContext == null) {
            throw new RuntimeException("table lineage sqlContext is null");
        }
        List<String> inputTables = SqlContextAnalyzer.findInputTable(sqlContext);
        List<String> outputTables = SqlContextAnalyzer.findOutputTable(sqlContext);
        if (CollectionUtils.isEmpty(outputTables)) {
            return Collections.singletonList(new TableLineageDto("", inputTables));
        }
        return outputTables.stream().map(x -> new TableLineageDto(x, inputTables)).collect(Collectors.toList());
    }


    private SqlEngine checkParams(String statement, String engine) throws Exception {
        if (StringUtils.isEmpty(statement)) {
            throw new Exception("statement cannot be null");
        }
        if (StringUtils.isEmpty(engine)) {
            throw new Exception(("engine type cannot be null"));
        }
        SqlEngine engineType = SqlEngine.fromString(engine);
        if (engineType == null) {
            throw new Exception(String.format("does not support %s engine", engine));
        }
        return engineType;
    }

    public SqlContext parse(String sql) {
        return parse(sql, "default");
    }

    public SqlContext parse(String sql, String currentDb) {
        SqlContext sqlContext = null;
        long startTime = System.currentTimeMillis();
        Future future = executorService.submit(() -> {
            try {
                parseWithEngine(sql, firstEngine, currentDb);
            } catch (Exception e) {
                log.error("parse sql failed", e);
            }
        });
        try {
            sqlContext = (SqlContext) future.get(40, TimeUnit.SECONDS);
            long endTime = System.currentTimeMillis();
            log.info("parse sql:{} with engine:{} use:{} ",sql,firstEngine,(endTime - startTime));
        } catch (TimeoutException e) {
            log.warn("parse sql:{} with engine:{} tasks too long time,just mark sqlContext=null to user next engine",sql,firstEngine);
        } catch (Exception e) {
            log.error("parse sql and future get failed", e);
        }
        if (sqlContext != null) {
            return sqlContext;
        }
        for (SQLEngineEnum sqlEngine : SQLEngineEnum.values()) {
            if (sqlEngine != firstEngine) {
                sqlContext = parseWithEngine(sql, sqlEngine, currentDb);
                if (sqlContext != null) {
                    break;
                }
            }
        }
        return sqlContext;
    }

    private SqlContext parseWithEngine(String sql, String currentDb) {
        try {
//            switch (engine) {
//                case HIVE:
//                    return hiveParser(sql, currentDb);
//                case SPARK:
//                    return sparkParser(sql, currentDb);
//                case PRESTO:
//                    return prestoParser(sql, currentDb);
//            }

            return prestoParser(sql, currentDb);
        } catch (Exception e) {
            log.error("parse sql error,sql " + sql + " engine:" + engine, e);
            throw new RuntimeException(e);
        }
        return null;
    }

    private SqlContext prestoParser(String stmt, String currentDb) {
        ParserRuleContext tree = getParserRuleTree(stmt, SQLEngineEnum.PRESTO);
        StarRocksSqlVisitor visitor = new StarRocksSqlVisitor(tableSchemaFinder, currentDb);
        return visitor.visit(tree);
    }


}
