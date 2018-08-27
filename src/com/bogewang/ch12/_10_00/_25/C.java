/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._25;

public class C extends B {
    @Override
    void f() throws MyException {
        throw new MyException();
    }
}
