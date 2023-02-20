package com.sql.parser.lineage.context;

import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

@Data
public class BooleanExpressionSqlContext extends SqlContext {

    List<PredicatedSqlContext> subContext;

    public BooleanExpressionSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
    }

    public BooleanExpressionSqlContext(PredicatedSqlContext predicatedSqlContext, ParserRuleContext currentContext){
        super(currentContext);
        this.setTabAlias(predicatedSqlContext.getTabAlias());
        this.setInputCols(predicatedSqlContext.getInputCols());
        this.setOutputCols(predicatedSqlContext.getOutputCols());
        this.setJoinCols(predicatedSqlContext.getJoinCols());
    }
}
