/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._01_00._03;

public class Son extends Father {
    private int num = 3;

    @Override
    public void print() {
        System.out.println("son :" + num);
    }
}
