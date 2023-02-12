package com.sql.parser.lineage.doris;


import com.sql.parser.lineage.SqlParserAbstract;
import com.sql.parser.lineage.model.lineage.FieldLineageModel;
import doris.DorisLexer;
import doris.DorisParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.codehaus.plexus.util.StringUtils;

import java.util.List;

public class MyDorisSqlListenerParser extends SqlParserAbstract {

    private ParseTree getParseTree(String sql) {
        String trimSql = StringUtils.trim(sql);
        UpperCaseCharStream upperCaseCharStream = new UpperCaseCharStream(CharStreams.fromString(trimSql));
        DorisLexer lexer = new DorisLexer(upperCaseCharStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DorisParser parser = new DorisParser(tokenStream);
        parser.addParseListener(new PostProcessor());
        parser.removeErrorListeners();
        parser.addErrorListener(new ParseErrorListener());
        try {
            // first, try parsing with potentially faster SLL mode
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        } catch (ParseCancellationException ex) {
            // if we fail, parse with LL mode
            tokenStream.seek(0); // rewind input stream
            parser.reset();
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
        }
        return parser.singleStatement();
    }


    @Override
    public List<FieldLineageModel> parseSqlFieldLineage(String sql) {
        String s = sqlRewrite(sql);
        // 新建一个标准的Antlr语法分析树遍历器
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        // 新建一个监听器，将其传递给遍历器
        DorisPostProcessor dorisPostProcessor = new DorisPostProcessor();
        // 遍历语法分析树
        parseTreeWalker.walk(dorisPostProcessor, getParseTree(sql));
        return dorisPostProcessor.getDorisFieldLineage();
    }

    public String sqlRewrite(String sql) {

        ANTLRInputStream input = new ANTLRInputStream(sql);
        DorisLexer lexer = new DorisLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DorisParser parser = new DorisParser(tokens);
        parser.setBuildParseTree(true);      // tell ANTLR to build a parse tree
        ParseTree tree = parser.singleStatement(); // parse
        // show tree in text form
        System.out.println(tree.toStringTree(parser));
        DorisSqlRewrite dorisSqlRewrite = new DorisSqlRewrite();
        String result = dorisSqlRewrite.visit(tree);
        // 新建一个标准的Antlr语法分析树遍历器
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        // 新建一个监听器，将其传递给遍历器
        DorisSqlListenerRewrite dorisSqlListenerRewrite = new DorisSqlListenerRewrite();
        // 遍历语法分析树
        parseTreeWalker.walk(dorisSqlListenerRewrite, getParseTree(sql));
        String sqlStr = dorisSqlRewrite.sqlStr;
        return result;

    }
}
