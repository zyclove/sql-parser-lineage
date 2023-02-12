package com.sql.parser.lineage.starRocks;

import com.sql.parser.lineage.SqlParserAbstract;
import com.sql.parser.lineage.doris.*;
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
import starRcoks.StarRocksLexer;
import starRcoks.StarRocksParser;

import java.util.List;

public class MyStarRocksLintenerParse extends SqlParserAbstract {

    private ParseTree getParseTree(String sql) {
        String trimSql = StringUtils.trim(sql);
        UpperCaseCharStream upperCaseCharStream = new UpperCaseCharStream(CharStreams.fromString(trimSql));
        StarRocksLexer lexer = new StarRocksLexer(upperCaseCharStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParseErrorListener());
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        StarRocksParser parser = new StarRocksParser(tokenStream);
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
        // 新建一个标准的Antlr语法分析树遍历器
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        // 新建一个监听器，将其传递给遍历器
        StarRocksPostProcessor starRocksPostProcessor = new StarRocksPostProcessor();
        // 遍历语法分析树
        parseTreeWalker.walk(starRocksPostProcessor, getParseTree(sql));
        return starRocksPostProcessor.getDorisFieldLineage();
    }
}
