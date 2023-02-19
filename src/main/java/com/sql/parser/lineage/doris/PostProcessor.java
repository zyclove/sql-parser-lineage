package com.sql.parser.lineage.doris;


import doris.DorisParser;
import doris.DorisParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class PostProcessor extends DorisParserBaseListener {

    /**
     * Remove the back ticks from an Identifier.
     */
    @Override
    public void exitQuotedIdentifier(DorisParser.QuotedIdentifierContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token) ctx.getChild(0).getPayload();

        CommonToken commonToken = new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                DorisParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 1,
                token.getStopIndex() - 1);

        commonToken.setText(commonToken.getText().replace("``", "`"));
        parent.addChild(commonToken);
    }

    /**
     * Treat non-reserved keywords as Identifiers.
     */
    @Override
    public void exitNonReserved(DorisParser.NonReservedContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token) ctx.getChild(0).getPayload();

        parent.addChild(new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                DorisParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 0,
                token.getStopIndex() - 0));
    }
}