/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._07_01._21;

public interface Parcel21 {

    void hello(Parcel21 parcel21);

    static class InnerClass{
        static void sayHello(){
            //hello(this);
        }

    }
}
