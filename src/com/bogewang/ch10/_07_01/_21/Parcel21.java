/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._07_01._21;

public interface Parcel21 {

    void hello(Parcel21 parcel21);

    class InnerClass implements Parcel21{
        static void sayHello(){
            //hello(this);
        }

        @Override
        public void hello(Parcel21 parcel21) {
            System.out.println("say Hello");
        }
    }
}
