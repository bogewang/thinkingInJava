/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._13_00._31;

import polymorphism.shape.Circle;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

import java.util.Iterator;
import java.util.Random;

public class Exr31 implements Iterable{

    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
