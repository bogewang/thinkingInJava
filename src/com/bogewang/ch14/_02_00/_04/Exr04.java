/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._04;

import com.bogewang.ch14._02_00._03.Circle;
import com.bogewang.ch14._02_00._03.Rhomboid;
import com.bogewang.ch14._02_00._03.Shape;
import org.junit.Test;

import static net.mindview.util.Print.print;

public class Exr04 {
    @Test
    public void test(){
        Shape shape = new Rhomboid();

        if (shape instanceof  Rhomboid){
            Rhomboid rhomboid = (Rhomboid) shape;
            print("转化Rhomboid成功!");
        } else {
            print("不能转化为Rhomboid");
        }

        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            print("转化Circle成功!");
        } else {
            print("不能转化为Circle");
        }

    }
}
