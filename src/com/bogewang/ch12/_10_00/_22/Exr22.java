/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._10_00._22;

import org.junit.Test;

public class Exr22 {

    @Test
    public void test(){
        try {
            FaillingConstructor faillingConstructor = new FaillingConstructor();
        } catch (Exception e) {
            System.out.println("cause exception");

        }

    }
}
