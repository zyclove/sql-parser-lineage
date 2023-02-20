package com.sql.parser.lineage.context;

import com.sql.parser.lineage.enums.StatementType;
import com.sql.parser.lineage.starRocks.SqlContext;
import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.Serializable;


@Data
public class DeleteSqlContext extends SqlContext implements Serializable {
    public DeleteSqlContext(ParserRuleContext currentContext) {
        super(currentContext);
        this.statementType = StatementType.DELETE;
    }

    private String deleteTable;
}
