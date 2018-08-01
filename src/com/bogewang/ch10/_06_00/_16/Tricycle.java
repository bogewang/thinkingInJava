/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._16;

public class Tricycle implements Cycle {
    @Override
    public void wheels() {
        System.out.println("three wheel");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}
