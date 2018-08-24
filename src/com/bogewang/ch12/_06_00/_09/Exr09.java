/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._06_00._09;

import org.junit.Test;

public class Exr09 {
    @Test
    public void test(){

        try {
            this.throwExceptions();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwExceptions() throws MyException1,MyException2,MyException3{
        System.out.println("throw e1");
        System.out.println("throw e2");
        System.out.println("throw e3");
    }
}
