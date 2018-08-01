/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

import org.junit.Test;

public class Exrcise11 extends Filter{
    @Override
    public Wareform proecss(Wareform input) {
        return super.proecss(input);
    }

    public String reverse(String str){
        char[] chars = str.toCharArray();
        int length = chars.length;
        for (int i=0; i<length/2 ;i++){
            char temp = chars[i];
            chars[i] = chars[length-i-1];
            chars[length-i-1] = temp;
        }
        return new String(chars);
    }

    @Test
    public void test(){
        String str = "hello world!";
        System.out.println(reverse(str));
    }
}
