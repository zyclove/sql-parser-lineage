package com.sql.parser.lineage.enums;

import lombok.Getter;

public enum StatementType {
    SELECT("SELECT"),
    EXPLAIN("EXPLAIN"),
    CREATE("CREATE"),
    CREATEAS("CREATEAS"),
    ALTER("ALTER"),
    INSERT("INSERT"),
    DROP("DROP"),
    DELETE("DELETE"),
    _ANY("_ANY");

    @Getter
    private String name;

    StatementType(String name) {
        this.name = name;
    }
}
