package com.sql.parser.lineage.schema;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
@AllArgsConstructor
public class TableSimpleSchema implements Cloneable {

    private String tableName;
    List<ColumnContext> cols;

    public TableSimpleSchema() {
    }

    public String tableFullName() {
        return tableName;
    }

    @Override
    public TableSimpleSchema clone() throws CloneNotSupportedException {
        TableSimpleSchema targetSchema = (TableSimpleSchema) super.clone();
        if (targetSchema.getCols() != null) {
            List<ColumnContext> newCols = Lists.newArrayList();
            for (ColumnContext columnContext : targetSchema.getCols()) {
                ColumnContext newCol = new ColumnContext();
                BeanUtils.copyProperties(columnContext, newCol);
                newCols.add(newCol);
            }
            targetSchema.setCols(newCols);
        }
        return targetSchema;
    }
}
