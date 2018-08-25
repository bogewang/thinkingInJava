/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._04_00._04;

public class MyException extends Exception {

    private String message;
    public MyException(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(this.message);
    }
}
