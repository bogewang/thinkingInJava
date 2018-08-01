/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._02_00._02;

public class MyString {

    private String name;

    @Override
    public String toString() {
        return "MyString{" +
                "name='" + name + '\'' +
                '}';
    }

    public MyString(String name) {
        this.name = name;
    }
}
