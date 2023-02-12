package com.sql.parser.lineage.doris;


import com.sql.parser.lineage.model.lineage.TableNameModel;

import java.util.HashSet;


public class DorisTableLineageParser extends DorisParserBaseVisitor {

    private TableNameModel outputTable;
    private final HashSet<TableNameModel> inputTables = new HashSet<>();

}
