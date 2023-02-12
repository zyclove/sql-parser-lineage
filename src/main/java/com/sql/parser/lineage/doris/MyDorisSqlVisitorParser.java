package com.sql.parser.lineage.doris;


import com.sql.parser.lineage.SqlParserAbstract;
import com.sql.parser.lineage.model.lineage.FieldLineageModel;
import com.sql.parser.lineage.doris.DorisLexer;
import com.sql.parser.lineage.doris.DorisParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.codehaus.plexus.util.StringUtils;

import java.util.List;


public class MyDorisSqlVisitorParser extends SqlParserAbstract {

    private ParseTree getParseTree(String sql) {
        String trimSql = StringUtils.trim(sql);
        CodePointCharStream input = CharStreams.fromString(trimSql);
        UpperCaseCharStream upperCaseCharStream = new UpperCaseCharStream(CharStreams.fromString(trimSql));
        DorisLexer lexer = new DorisLexer(upperCaseCharStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DorisParser parser = new DorisParser(tokenStream);
        return parser.singleStatement();
    }


    @Override
    public List<FieldLineageModel> parseSqlFieldLineage(String sql) {
        DorisFieldLineageParser dorisFieldLineageParser = new DorisFieldLineageParser(sql);
        dorisFieldLineageParser.visit(getParseTree(sql));
        return dorisFieldLineageParser.getDorisFieldLineage();
    }
}
