package com.sql.parser.lineage.doris;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.misc.Interval;

/*
 * 大写字符流，不是在 Antlr4 做的转换。Antlr做转换太麻烦了。
 * SparkSQL 的转换不仅会把关键字转换大写，也会把非关键字也做大写转换
 * */
public class UpperCaseCharStream implements CharStream {

    private CodePointCharStream wrapped;

    public UpperCaseCharStream(CodePointCharStream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void consume() {
        wrapped.consume();
    }

    @Override
    public int LA(int i) {
        int la = wrapped.LA(i);
        if (la == 0 || la == IntStream.EOF) {
            return la;
        } else {
            return Character.toUpperCase(la);
        }
    }

    @Override
    public String getText(Interval interval) {
        if (size() > 0 && (interval.b - interval.a >= 0)) {
            return wrapped.getText(interval);
        } else {
            return "";
        }
    }

    @Override
    public int mark() {
        return wrapped.mark();
    }

    @Override
    public void release(int i) {
        wrapped.release(i);
    }

    @Override
    public int index() {
        return wrapped.index();
    }

    @Override
    public void seek(int i) {
        wrapped.seek(i);
    }

    @Override
    public int size() {
        return wrapped.size();
    }

    @Override
    public String getSourceName() {
        return wrapped.getSourceName();
    }


}
