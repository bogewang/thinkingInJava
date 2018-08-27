/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._21;

public class FatherException extends Exception {

    @Override
    public String toString() {
        return "FatherException{}";
    }

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public FatherException() {
    }
}
