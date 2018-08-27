/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._25;

public class B extends A {
    @Override
    void f() throws FatherException {
        throw new FatherException();
    }
}
