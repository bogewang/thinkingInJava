/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

public class Apply {
    public static void proecss(Processor p, Object s){
        System.out.println("using process" + p.name());
        System.out.println(p.proecss(s));
    }
}
