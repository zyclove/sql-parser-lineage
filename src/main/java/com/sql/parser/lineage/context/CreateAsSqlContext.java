package com.sql.parser.lineage.context;

import com.sql.parser.lineage.enums.StatementType;
import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;

public class CreateAsSqlContext extends CreateSqlContext implements Serializable {
    public CreateAsSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
        this.statementType = StatementType.CREATEAS;
    }

    @Getter
    @Setter
    private SqlContext selectSqlContext;

}
