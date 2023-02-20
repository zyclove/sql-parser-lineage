package com.sql.parser.lineage.context;

import com.sql.parser.lineage.starRocks.ColumnContext;
import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;
import java.util.List;

@Data
public class PredicatedSqlContext extends SqlContext implements Serializable {

    private List<ColumnContext> predicateCols;

    public PredicatedSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
    }
}
