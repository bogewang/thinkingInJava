/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._25;

public class A extends Exception {
    void f() throws GrandFatherException{
        throw new GrandFatherException();
    }
}
