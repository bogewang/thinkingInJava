/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._04_00._03;

import org.junit.Test;

public class Exr03 {

    @Test
    public void test(){
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bounds!");
        }
    }
}
