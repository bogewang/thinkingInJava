/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._11_00._27;

public class Command {
    private String str;

    public void operation(){
        System.out.println(this.str);
    }

    public Command(String str) {
        this.str = str;
    }
}
