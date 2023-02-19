package com.sql.parser.lineage.doris;


import doris.DorisParser;
import doris.DorisParserBaseListener;

import java.util.HashMap;
import java.util.List;


public class DorisSqlListenerRewrite extends DorisParserBaseListener {
    HashMap<String, String> sourceTableMapWith = new HashMap<>();
    String sqlStr;

    @Override
    public void enterSingleStatement(DorisParser.SingleStatementContext ctx) {
        sqlStr = ctx.getText();
    }

    @Override
    public void enterWith(DorisParser.WithContext ctx) {
        StringBuffer sb = null;
        sqlStr = sqlStr.replace(ctx.getText(), "");
        List<DorisParser.NamedQueryContext> namedQueryContexts = ctx.namedQuery();
        for (DorisParser.NamedQueryContext context : namedQueryContexts) {
            sb = new StringBuffer();
            for (int i = 1; i < context.getChildCount(); i++) {
                if (!context.getChild(i).getText().equals("AS")) {
                    sb.append(context.getChild(i).getText());
                }
            }
            sourceTableMapWith.put(context.getChild(0).getText(), sb.toString());
            sqlStr = sqlStr.replace(context.getChild(0).getText(), sb.toString());
        }
        System.out.println(sqlStr);
//        return ""; //这里就把with 别名 as （）子查询的写法直接删掉，
    }

    @Override
    public void enterTableName(DorisParser.TableNameContext ctx) {
        String curTableName = ctx.multipartIdentifier().getText();
        String replacedSubQueryTableName = null;
        if (sourceTableMapWith.containsKey(curTableName)) {
            replacedSubQueryTableName = sourceTableMapWith.get(curTableName);
        } else {
            replacedSubQueryTableName = curTableName;
        }
//        return replacedSubQueryTableName;
    }

}
