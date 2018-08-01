/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._03_00._05;

import org.junit.Test;

/**
 * 创建一个包含内部类的类,在另外一个类中创建内部类的实例;
 */
public class Exrcise5 {

    @Test
    public void test(){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.say();
    }
}
