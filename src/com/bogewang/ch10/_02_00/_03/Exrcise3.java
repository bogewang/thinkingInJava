/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._02_00._03;

import org.junit.Test;

public class Exrcise3 {

    @Test
    public void test(){
        Outer outer = new Outer("today is a rainning day");
        Outer.Inner inner = outer.getInner();
        System.out.println(inner.toString());
    }
}
