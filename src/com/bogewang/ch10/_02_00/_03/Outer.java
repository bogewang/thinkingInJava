/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._02_00._03;

public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    class Inner{
        @Override
        public String toString() {
            return "Inner{} " +
                    "" +
                    "" +
                    "" + name;
        }
    }

    Inner getInner(){
        return new Inner();
    }
}
