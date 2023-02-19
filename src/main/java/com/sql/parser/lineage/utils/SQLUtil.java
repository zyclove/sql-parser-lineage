package com.sql.parser.lineage.utils;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SQLUtil {
    private static String selectPattern = "([\\s\\S]*[\\s]|^)(?i)select[\\s][\\s\\S]*";
    private static String setPattern = "^(?i)set[\\s][\\s\\S]*";
    private static String explainPattern = "^(?i)explain[\\s][\\s\\S]*";
    private static String usePattern = "^(?i)use[\\s][\\s\\S]*";
    private static String insertPattern = "([\\s\\S]*[\\s]|^)(?i)create[\\s][\\s\\S]*";
    private static String createPattern = "([\\s\\S]*[\\s]|^)(?i)insert[\\s][\\s\\S]*";

    public static boolean containsInsert(String sql) {
        return containsInsert(sql, true);
    }

    public static boolean containsInsert(String sql, boolean withComment) {
        if (withComment) {
            sql = removeComments(sql);
        }
        if (Pattern.matches(insertPattern, sql)) {
            return true;
        }
        return false;
    }

    public static boolean containsCreate(String sql) {
        return containsCreate(sql, true);
    }

    public static boolean containsCreate(String sql, boolean withComment) {
        if (withComment) {
            sql = removeComments(sql);
        }
        if (Pattern.matches(createPattern, sql)) {
            return true;
        }
        return false;
    }

    public static boolean containsSelect(String sql) {
        return containsSelect(sql, true);
    }

    public static boolean containsSelect(String sql, boolean withComment) {
        if (withComment) {
            sql = removeComments(sql);
        }
        if (Pattern.matches(selectPattern, sql)) {
            return true;
        }
        return false;
    }

    public static boolean startWithSet(String sql) {
        return startWithSet(sql, true);
    }

    public static boolean startWithSet(String sql, boolean withComment) {
        if (withComment) {
            sql = removeComments(sql);
        }
        if (Pattern.matches(setPattern, sql.trim())) {
            return true;
        }
        return false;
    }

    public static boolean startWithExplain(String sql) {
        return startWithExplain(sql, true);
    }

    public static boolean startWithExplain(String sql, boolean withComment) {
        if (withComment) {
            sql = removeComments(sql);
        }
        if (Pattern.matches(explainPattern, sql.trim())) {
            return true;
        }
        return false;
    }

    public static boolean startWithUse(String sql) {
        return startWithUse(sql, true);
    }

    public static boolean startWithUse(String sql, boolean withComment) {
        if (withComment) {
            sql = removeComments(sql);
        }
        if (Pattern.matches(usePattern, sql.trim())) {
            return true;
        }
        return false;
    }

    /**
     * 输入一段文本,切割成1个或多个SQL
     *
     * @param sqlOrigin
     * @return
     */
    public static List<String> splitSql(String sqlOrigin) {
        return splitSql(sqlOrigin, true);
    }

    /**
     * 按照分号进行分割
     * @param sqlOrigin
     * @param withComment
     * @return
     */
    public static List<String> splitSql(String sqlOrigin, boolean withComment) {
        if (withComment) {
            sqlOrigin = removeComments(sqlOrigin);
        }
        String sql = new String(sqlOrigin);
        int scIndex = sql.indexOf(";");
        List<String> sqlList = new ArrayList<String>();
        while (scIndex >= 0) {
            String tmp = sql.substring(scIndex + 1);
            if (StringUtils.isBlank(tmp)) {
                break;
            } else {
                if (StringUtils.isNotBlank(sql.substring(0, scIndex))) {
                    sqlList.add(sql.substring(0, scIndex));
                }
                sql = tmp;
                scIndex = sql.indexOf(";");
            }
        }
        if (StringUtils.isNotBlank(sql)) {
            sqlList.add(endWithSemicolon(sql));
        }
        return sqlList;
    }

    private static String endWithSemicolon(String sql) {
        sql = sql.trim();
        if (sql.endsWith(";")) {
            return sql.substring(0, sql.length() - 1);
        }
        return sql;
    }

    public static String removeComments(String sqlOrigin) {
        String commentsRegex = "(--.*)|(((/\\*)+?[\\w\\W]+?(\\*/)+))";
        return sqlOrigin.replaceAll(commentsRegex, "").replaceAll(" +", " ").trim();
    }

}
