package com.sql.parser.lineage.schema;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataDictColumn {

    private String name;
    private String type;
    private Integer secureLevel;

    public DataDictColumn(String name, String type) {
        this.name = name;
        this.type = type;
    }
}