/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._02_00._08;

public class Sandwich implements FasFood {
    @Override
    public void useTime() {
        System.out.println("10 minutes");
    }

    @Override
    public void price() {
        System.out.println("20 yuan");
    }

    @Override
    public void type() {
        System.out.println("solid");
    }
}
