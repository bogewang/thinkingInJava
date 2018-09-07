/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._03;

import static net.mindview.util.Print.print;

public class Shapes {
    public static void main(String[] args) {
        Shape sh = new Rhomboid();
        print(sh.getClass());   //实际上市真实的子类;

        Rhomboid rhomboid = (Rhomboid) sh;
        print(rhomboid.getClass());

        //不能转换
//        Circle circle = (Circle) sh;
//        print(circle.getClass());

    }
}
