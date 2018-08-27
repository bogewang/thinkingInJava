/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._25;

import org.junit.Test;

public class Exr25 {
    @Test
    public void test(){
         A a = new C();
        try {
            a.f();
        } catch (GrandFatherException e) {
            e.printStackTrace();
        }

    }
}
