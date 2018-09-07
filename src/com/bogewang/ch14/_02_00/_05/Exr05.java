/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._05;

import com.bogewang.ch14._02_00._03.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Exr05 {

    @Test
    public void test(){
        List<Shape> shapeList = Arrays.asList(new Circle(), new Rhomboid(), new Square(),new Triangle());

        for (Shape shape : shapeList) {
            rotate(shape);
        }
    }


    public void rotate(Shape shape){
        if (!(shape instanceof Circle)){

            System.out.println("rotating: " + shape.getClass().getSimpleName());
        }
    }
}
