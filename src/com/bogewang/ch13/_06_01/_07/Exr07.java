/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_01._07;


import org.junit.Test;

public class Exr07 {
    @Test
    public void test(){

        String s1 = "hello world!";
        String s2 = "Hello world。";
        String pattern = "[A-Z].*。";
        System.out.println(s1.matches(pattern));
        System.out.println(s2.matches(pattern));

    }
}
