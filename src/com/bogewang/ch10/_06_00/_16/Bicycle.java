/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._16;

public class Bicycle implements Cycle {


    @Override
    public void wheels() {
        System.out.println("two wheel");
    }

    public static CycleFactory factory = new CycleFactory(){

        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}
