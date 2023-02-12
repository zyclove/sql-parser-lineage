package com.sql.parser.lineage.presto;

import com.sql.parser.lineage.SqlParserAbstract;
import com.sql.parser.lineage.enums.SqlTypeEnum;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import presto.PrestoSqlLexer;
import presto.PrestoSqlParser;

/**
 * @ClassName MyPresoSqlParser
 * @description:
 * @author: again
 * @Date: 2021/3/11 7:59 下午
 */
public class MyPresoSqlParser extends SqlParserAbstract {

    private ParseTree getParseTree(String sql) {
        sql = sql.toUpperCase();
        CharStream input = CharStreams.fromString(sql);
        PrestoSqlLexer mySqlLexer = new PrestoSqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(mySqlLexer);
        PrestoSqlParser parser = new PrestoSqlParser(tokens);
        return parser.statement();
    }

    @Override
    public SqlTypeEnum parseSqlType(String sql) {
        PrestoSqlTypeParser visitor = new PrestoSqlTypeParser();
        visitor.visit(getParseTree(sql));
        return visitor.getSqlType();
    }

}
