package com.sql.parser.lineage.doris;


import doris.DorisParser;
import doris.DorisParserBaseVisitor;

import java.util.HashMap;
import java.util.List;


public class DorisSqlRewrite extends DorisParserBaseVisitor<String> {
    HashMap<String, String> sourceTableMapWith = new HashMap<>();
    public String sqlStr;

    @Override
    public String visitSingleStatement(DorisParser.SingleStatementContext ctx) {
        sqlStr = ctx.getText();
        return ctx.getText();
    }

    @Override
    public String visitWith(DorisParser.WithContext ctx) {
        StringBuffer sb = null;
        sqlStr.replaceAll(ctx.getText(), "");

        List<DorisParser.NamedQueryContext> namedQueryContexts = ctx.namedQuery();
        for (DorisParser.NamedQueryContext context : namedQueryContexts) {
            sb = new StringBuffer();
            for (int i = 1; i < context.getChildCount(); i++) {
                if (!context.getChild(i).getText().equals("AS")) {
                    sb.append(" " + context.getChild(i).getText());
                }
            }
            sourceTableMapWith.put(context.getChild(0).getText(), sb.toString());
            sqlStr.replaceAll(context.getChild(0).getText(), sb.toString());
        }
        return ""; //这里就把with 别名 as （）子查询的写法直接删掉，
    }

    @Override
    public String visitTableName(DorisParser.TableNameContext ctx) {
        String curTableName = ctx.multipartIdentifier().getText();
        String replacedSubQueryTableName = null;
        if (sourceTableMapWith.containsKey(curTableName)) {
            replacedSubQueryTableName = sourceTableMapWith.get(curTableName);
        } else {
            replacedSubQueryTableName = curTableName;
        }
        return replacedSubQueryTableName;
    }

}
