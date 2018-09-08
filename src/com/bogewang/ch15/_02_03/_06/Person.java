/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch15._02_03._06;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
