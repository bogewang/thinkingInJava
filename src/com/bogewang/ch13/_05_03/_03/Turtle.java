/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._05_03._03;

import org.junit.Test;

import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public Turtle() {
    }

    void remove(int x, int y){
        formatter.format("%s The turtle is ad (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        Turtle tommy = new Turtle("tommy", new Formatter(System.err));
        tommy.remove(1,2);
        tommy.remove(3,4);
        tommy.remove(5,6);
    }
}
