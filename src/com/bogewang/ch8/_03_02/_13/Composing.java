/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch8._03_02._13;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    public void dispose(){
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing() " +id;
    }
}
