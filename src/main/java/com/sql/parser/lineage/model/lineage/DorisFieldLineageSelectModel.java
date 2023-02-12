package com.sql.parser.lineage.model.lineage;

import lombok.Data;

import java.util.List;

@Data
//@Builder
//@AllArgsConstructor
public class DorisFieldLineageSelectModel {

    /**
     * index
     */
    String id = "";
    /*
     * 方式一：
     *  id + fieldTableAlias = selfKey
     * 方式二：
     *  id + fieldTableAlias + fieldName = selfKey 递归遍历的时候就可以直接拿来用
     * */
    String selfFieldNameKey = "";

    String selfComputedFieldKey = "";

    /*
     * 方式一：
     *  parentId + parentTableAlias = parentKey
     * 方式二：
     *  parentId + parentTableAlias + fieldName = parentKey 递归遍历的时候就可以直接拿来用
     * */
    String parentFieldNameKey = "";
    String parentSecondFieldNameKey = "";


    /**
     * 父id，第一层select为null
     * demo: t1_60 子查询_唯一id
     */
    String parentId = "";
    String parentTableAlias = "";
    String parentText;
    String selfText;

    /**
     * 来源表，来源子select则为null
     */

    TableNameModel fromTable;

    /**
     * 表别名,字段前面的前缀作为表的别名。
     * 没有的为空
     */
    String fieldTableAlias = "";

    /*
     * 当一个字段由多个字段计算得来，computedFieldName 就是多个
     * 生成多条数据
     * */
    String computedFieldName;
    String fieldName;
    /*
     * 存储多个字段加工出来一个字段的计算逻辑。
     * */
    String process;


    List<DorisFieldLineageSelectModel> children;

}
