package com.sql.parser.lineage.utils;

/**
 * @author: guolixiang
 * @date: 2021-02-24 16:02:59
 * @description:
 */
public class SqlStringUtils {
    public static String unescapeIdentifier(String val) {
        if (val == null) {
            return null;
        }
        if (val.charAt(0) == '`' && val.charAt(val.length() - 1) == '`') {
            val = val.substring(1, val.length() - 1);
        }
        return val;
    }
}
