package com.sql.parser.lineage.context;

import com.sql.parser.lineage.enums.StatementType;
import com.sql.parser.lineage.starRocks.ColumnContext;
import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;
import java.util.List;


public class CreateSqlContext extends SqlContext implements Serializable {
    public CreateSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
        this.statementType = StatementType.CREATE;
    }

    @Getter
    @Setter
    private String createTable;
    @Getter
    @Setter
    private List<ColumnContext> createColumns;
}
