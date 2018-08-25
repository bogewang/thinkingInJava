/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._04_00._04;

import org.junit.Test;

public class Exr04 {

    @Test
    public void test(){

        try {
            MyException hello_myException = new MyException("hello myException");
            throw hello_myException;
        } catch (MyException e){
            e.printMessage();
        }
    }
}
