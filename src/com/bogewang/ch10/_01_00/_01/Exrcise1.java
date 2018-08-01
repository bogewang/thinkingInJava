/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._01_00._01;

import org.junit.Test;

public class Exrcise1 {

    @Test
    public void test(){
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }
}
