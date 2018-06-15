/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch8._03_02._13;

public class ReferenceCounting {

    /**
     * 计算name的引用次数;
     */
    private static int count = 0;

    private String name;

    public String getName() {
        ++count;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] arr = {
          new Composing(shared),
          new Composing(shared),
          new Composing(shared),
          new Composing(shared),
          new Composing(shared),
          new Composing(shared),
        };
        for (Composing composing :
                arr) {
            composing.dispose();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
