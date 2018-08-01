/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

public class Wareform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Wareform{" +
                "id=" + id +
                '}';
    }
}
