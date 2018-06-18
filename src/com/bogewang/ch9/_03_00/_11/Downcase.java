/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

public class Downcase extends StringProcess {
    @Override
    public String proecss(Object input) {
        return ((String)input).toLowerCase();
    }
}
