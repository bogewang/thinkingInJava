package com.bogewang.ch5._03_00;

import org.junit.Test;

public class Exrcise3 {
    private String s;
    public Exrcise3() {
        System.out.println("我是无参构造器!");
    }

    public Exrcise3(String s) {
        this.s = s;
        System.out.println("我是一个有参的构造函数:" +s);
    }

}
