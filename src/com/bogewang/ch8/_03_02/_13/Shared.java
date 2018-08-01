/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch8._03_02._13;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("creating" + this);
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if (--refcount == 0){
            System.out.println("disposing" + this);
        }
    }

    public String toString(){
        return "shared" + id;
    }
}
