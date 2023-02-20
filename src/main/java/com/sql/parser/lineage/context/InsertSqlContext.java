package com.sql.parser.lineage.context;

import com.sql.parser.lineage.enums.StatementType;
import com.sql.parser.lineage.starRocks.ColumnContext;
import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;
import java.util.List;

@Data
public class InsertSqlContext extends SqlContext implements Serializable {
    public InsertSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
        this.statementType = StatementType.INSERT;
    }

    private String insertTable;
    private List<ColumnContext> insertCols;
    private  SqlContext queryContext;
}
