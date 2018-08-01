/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

public abstract class StringProcess implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String proecss(Object input);

}
