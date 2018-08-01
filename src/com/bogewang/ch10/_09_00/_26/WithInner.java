/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._09_00._26;

public class WithInner {
    class Inner{
        public Inner(String str) {
            System.out.println("withInner.inner: "+ str);
        }
    }
}
