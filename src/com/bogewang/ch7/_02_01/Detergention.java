/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch7._02_01;

/**
 * 代理模式;
 */
public class Detergention {
    private Detergent detergent = new Detergent();

    public void f2(){
        detergent.f2();
    }

    public void f3() {
        detergent.f3();
    }
}
