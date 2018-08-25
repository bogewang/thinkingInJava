/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._04_01._06;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException extends Exception {
    private static Logger logger = Logger.getLogger("MyException");

    public MyException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace+"");
    }


    @Test
    public void test(){
        try {
            throw new MyException();
        } catch (MyException e) {
            System.err.println("caught:" + e);
        }
    }
}
