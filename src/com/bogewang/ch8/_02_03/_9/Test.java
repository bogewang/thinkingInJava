/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch8._02_03._9;

public class Test {
    @org.junit.Test
    public void test(){
        Rodent[] rodents = {new Mouse() , new Hamster(), new Gerbil()};
        for (Rodent rodent:rodents) {
            rodent.f();
        }
    }
}
