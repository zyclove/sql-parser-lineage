package com.sql.parser.lineage.utils;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.sql.parser.lineage.schema.TableSchemaFinder;
import com.sql.parser.lineage.schema.TableSimpleSchema;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by qunyan on 2019/2/20.
 */
@Getter
@Setter
public class VisitorHelper {
    private Map<String, Set<String>> withTabAlias = Maps.newHashMap();
    private Map<String, TableSimpleSchema> schema = Maps.newHashMap();
    private TableSchemaFinder schemaFinder;
    private long hugeTableRowCount = 1000000000;//default row count when table is tagged as HugeTable in meta

    public VisitorHelper(TableSchemaFinder schemaFinder) {
        this.schemaFinder = schemaFinder;
    }

    public boolean isEmptyList(List list) {
        return list == null || list.isEmpty();
    }

    public Map<String, Set<String>> mergeAlias(List<Map<String, Set<String>>> alias) {
        Map<String, Set<String>> result = Maps.newHashMap();
        for (Map<String, Set<String>> map : alias) {
            if (map != null) {
                result.putAll(map);
            }
        }
        return result;
    }

    public String unescapeIdentifier(ParserRuleContext ctx) {
        return SqlStringUtils.unescapeIdentifier(ctx.getText());
    }

    public Map<String, Set<String>> appendAlias(Map<String, Set<String>> old, String newAlias) {
        Map<String, Set<String>> result = Maps.newHashMap();
        Set<String> realTabs = Sets.newHashSet();
        if (old != null && !StringUtils.isEmpty(newAlias)) {
            for (Set<String> tabSet : old.values()) {
                tabSet.stream().forEach(tab -> realTabs.add(tab));
            }
            result.putAll(old);
            result.put(newAlias, realTabs);
        }
        return result;
    }


    public TableSimpleSchema getSchema(String fullTableName) throws Exception {
        /*if(!fullTableName.contains(".")){
            throw new RuntimeException(String.format("fullTableName %s not contain dbName", fullTableName));
        }*/
        TableSimpleSchema result = schema.get(fullTableName);
        if (result != null) {
            result = result.clone();
        } else {
            String[] dbAndTable = fullTableName.split("\\.");
            TableSimpleSchema targeSchema = schemaFinder.findSchema(dbAndTable[0], dbAndTable[1]);
            if (targeSchema != null) {
                schema.put(fullTableName, targeSchema);
                result = targeSchema.clone();
            }
        }
        return result;
    }

}
