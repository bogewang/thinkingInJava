/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._07_00._19;

/**
 * 创建一个包含内部类的类,而此内部类又包含有内部类;
 */
public class Parcel19 {     //Parcel19.class

    public class InnerClass1{      //Parcel19.class
        public class InnerClass2{      //Parcel19$InnerClass1$InnerClass2.class

        }
    }
}
