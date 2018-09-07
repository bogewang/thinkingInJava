/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._08;


import com.bogewang.ch14._02_00._03.Circle;
import org.junit.Test;

import static net.mindview.util.Print.print;

public class Exr08 {

    @Test
    public void test() {
        Circle circle = new Circle();
        getAllParentClass(circle.getClass());

    }

    public void getAllParentClass(Class clazz){
        if (clazz != null){
            Object o = new Object();
            print(clazz);
            if (clazz != o.getClass()){
                Class<?> superclass = clazz.getSuperclass();
                getAllParentClass(superclass);
            }
        }
    }
}
