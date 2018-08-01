/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Wareform proecss(Wareform input){
        return input;
    }
}
