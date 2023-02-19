package com.sql.parser.lineage.starRocks;


import com.sql.parser.lineage.enums.StatementType;
import javafx.util.Pair;
import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class SqlContext implements Serializable {

    protected StatementType statementType = StatementType._ANY;
    private ParserRuleContext currentContext;
    private Map<String, Set<String>> tabAlias;
    private List<ColumnContext> outputCols;
    @Deprecated
    private List<SqlContext> joinCtx;

    private List<ColumnContext> inputCols;
    /*@Deprecated
    private String insertTable;*/
    List<Pair<ColumnContext, List<ColumnContext>>> joinCols;

    public SqlContext(ParserRuleContext currentContext) {
        this.currentContext = currentContext;
    }

    public SqlContext(ParserRuleContext currentContext, Map<String, Set<String>> tabAlias) {
        this.currentContext = currentContext;
        this.tabAlias = tabAlias;
    }
}
