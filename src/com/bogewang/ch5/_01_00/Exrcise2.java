package com.bogewang.ch5._01_00;

import org.junit.Test;

/**
 * 一个全局变量:str1;
 * 一个局部变量:str2;
 */
public class Exrcise2 {
    private String str = "str1";

    public Exrcise2() {
        String str2 = "str2";
        System.out.println(str);
        System.out.println(str2);
    }


    @Test
    public void test(){
        new Exrcise2();
    }
}
