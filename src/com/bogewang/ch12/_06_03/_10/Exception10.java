/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._06_03._10;

public class Exception10 extends Exception {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public Exception10(String str) {
        System.err.println(str);
    }
}
