/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._24;

public class FaillingConstructor {

    public FaillingConstructor() {
        int result = 1 / 0;
    }

    public void dispose(){
        System.out.println("dispose");
    }

}