/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._04_00._01;


import org.junit.Test;

public class Exr01 {
    @Test
    public void test(){

        try {
            throw new Exception("hello exception!");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("run finally!");
        }
    }
}
