/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._01_00._03;

import org.junit.Test;

public class Exrcise3 {
    @Test
    public void test(){
        Father son = new Son();
        son.print();
//        son :0 首先调用父类构造器,此时子类的成员变量未初始化, 所以为0;
//        son :3
    }
}
