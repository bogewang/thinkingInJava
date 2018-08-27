/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._21;

import org.junit.Test;

public class Son extends Father {
    public Son() throws FatherException {
        super();
    }

    @Test
    public void test(){
        try {
            Son son = new Son();
        } catch (FatherException e) {
            e.printStackTrace();
        }
    }
}
