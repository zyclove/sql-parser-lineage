package com.sql.parser.lineage.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: guolixiang
 * @date: 2019-09-05 16:16:27
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableLineageDto {

    private String outTable;
    private List<String> inTables;

}


