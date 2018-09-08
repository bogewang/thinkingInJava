/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch15._04_00._09;

import org.junit.Test;

public class GenericMethods {

    public <A,B,C> void f(A a, B b , C c){
        System.out.println(a.getClass().getName() +"\n"
        + b.getClass().getName() +"\n"
        + c.getClass().getName());
    }

    @Test
    public void test(){
        f(1, "1", 1.1D);
    }
}
