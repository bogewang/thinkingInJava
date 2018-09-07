/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._03;

public abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}