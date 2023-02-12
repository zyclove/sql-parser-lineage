package antlr4demo.starter03;
/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
// import ANTLR's runtime libraries

import antlr4demo.starter03.ArrayInitLexer;
import antlr4demo.starter03.ArrayInitParser;
import com.sql.parser.lineage.doris.UpperCaseCharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.codehaus.plexus.util.StringUtils;

public class Test {
    public static void main(String[] args) throws Exception {
        // create a CharStream
        String arrayText = "{1,2,3}";
        String trimArrayText = StringUtils.trim(arrayText);
        CodePointCharStream input = CharStreams.fromString(trimArrayText);
        UpperCaseCharStream upperCaseCharStream = new UpperCaseCharStream(CharStreams.fromString(trimArrayText));

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
