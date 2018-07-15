/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._07_01._20;

public interface Parcel20 {

    void hello();

    class InnerClass implements Parcel20{

        @Override
        public void hello() {
            System.out.println("inner hello");
        }

        public static void main(String[] args) {
            new InnerClass().hello();
        }
    }

}
