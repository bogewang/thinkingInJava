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

        System.out.println("�����¶�:" + chongQing.temperature);
        System.out.println("�ɶ��¶�:" + chengDu.temperature);

        chengDu = chongQing;

        System.out.println("�����¶�:" + chongQing.temperature);
        System.out.println("�ɶ��¶�:" + chengDu.temperature);

        chengDu.temperature = 28;

        System.out.println("�ɶ�������,�����¶�:" + chongQing.temperature);
        System.out.println("�ɶ�������,�ɶ��¶�:" + chengDu.temperature);

    }
}
