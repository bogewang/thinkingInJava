/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch5._09_00;

import org.junit.Test;

public class Test21 {

    @Test
    public void test() {
        for (Exrcise21 exrcise21 : Exrcise21.values()) {
            System.out.println(exrcise21 + ",ordinal:" + exrcise21.ordinal());

            switch (exrcise21){
                case YIYUAN:
                    System.out.println("一元");break;
                case WUYUAN:
                    System.out.println("五元");break;
                case SHIYUAN:
                    System.out.println("十元");break;
                case ERSHIYUAN:
                    System.out.println("二十元");break;
                case WUSHIYUAN:
                    System.out.println("五十元");break;
                case YIBAIYUAN:
                    System.out.println("一百元");break;
            }
        }
    }


}
