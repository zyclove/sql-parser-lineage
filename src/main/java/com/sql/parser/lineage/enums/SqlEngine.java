package com.sql.parser.lineage.enums;

import java.util.Arrays;
import java.util.List;

/**
 * </pre>
 *
 * @author qunyan
 * <p>
 * sql engines
 */
public enum SqlEngine {
    HIVE("hive"),
    SPARK("spark", "sparksql"),
    PRESTO("presto");
    private final List<String> texts;

    /**
     * @param texts
     */
    SqlEngine(final String... texts) {
        this.texts = Arrays.asList(texts);
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return texts.get(0);
    }

    public static SqlEngine fromString(String text) {
        for (SqlEngine sqlEngine : SqlEngine.values()) {
            for (String val : sqlEngine.texts) {
                if (val.equalsIgnoreCase(text)) {
                    return sqlEngine;
                }
            }
        }
        return null;
    }
}
