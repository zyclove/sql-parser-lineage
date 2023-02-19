package com.sql.parser.lineage.context;

import com.sql.parser.lineage.starRocks.SqlContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;

public class SqlContextCopycat<T extends SqlContext> {

    public T copy(ParserRuleContext ctx, T sqlContext) {
        if (sqlContext == null) {
            return null;
        }
        T newObj = null;
        try {
            Class c = Class.forName(sqlContext.getClass().getName());
            Constructor<T> constructor = c.getConstructor(ParserRuleContext.class);
            newObj = constructor.newInstance(ctx);
            BeanUtils.copyProperties(sqlContext, newObj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return newObj;
    }
}
