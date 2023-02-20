package com.sql.parser.lineage.context;

import com.sql.parser.lineage.enums.StatementType;
import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;

public class AlterSqlContext extends SqlContext implements Serializable {

    public AlterSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
        this.statementType = StatementType.ALTER;
    }

    @Getter
    @Setter
    private String alterTable;

}
