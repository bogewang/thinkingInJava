/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch8._03_01._11;

public class Sandwich extends PortableLunch {
    private Beard beard = new Beard();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle= new Pickle();

    public Sandwich() {
        System.out.println("sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
