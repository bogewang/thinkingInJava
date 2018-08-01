/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch7._02_01;

public class C extends A {
    public C(String string) {
        super(string);
        System.out.println("constructor C:" + string);
    }

    private B b = new B("1");
}
