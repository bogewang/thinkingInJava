/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._02_00._05;

public class ShoeFactory implements Factory {
    @Override
    public void produce() {
        System.out.println("生产鞋");
    }

    @Override
    public void payworkers() {
        System.out.println("付给员工工资");

    }

    @Override
    public void paytaxes() {
        System.out.println("交给国家赋税");

    }
}
