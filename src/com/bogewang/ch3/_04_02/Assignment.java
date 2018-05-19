package com.bogewang.ch3._04_02;

import org.junit.Test;

import java.io.Serializable;

public class Assignment implements Serializable{

    @Test
    public void test(){
        City chongQing = new City();
        City chengDu = new City();

        chongQing.temperature = 25;
        chengDu.temperature = 33;

        System.out.println("重庆温度:" + chongQing.temperature);
        System.out.println("成都温度:" + chengDu.temperature);

        chengDu = chongQing;

        System.out.println("重庆温度:" + chongQing.temperature);
        System.out.println("成都温度:" + chengDu.temperature);

        chengDu.temperature = 28;

        System.out.println("成都升温了,重庆温度:" + chongQing.temperature);
        System.out.println("成都升温了,成都温度:" + chengDu.temperature);

    }
}
