/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._06_03._10;

import org.junit.Test;

public class Exr10 {

    public void f() throws Exception {
        try {
            g();
        } catch (Exception10 exception10) {
            System.err.println("throw from f()");
            exception10.printStackTrace();
            throw (Exception)exception10.fillInStackTrace();
//            throw new Exception1002("throw from f()");
        }

    }

    public void g() throws Exception10 {
        throw new Exception10("throw from g()");
    }

    @Test
    public void test(){
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
