/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._07_00._18;

/**
 * 创建一个包含嵌套类的类,在main中创建其内部类实例;
 */
public class Parcel18 {

    private static class InnerClass {
        public InnerClass() {
            System.out.println("inner class");
        }
    }

    public static InnerClass getInnerClass(){
        return new InnerClass();
    }

    public static void main(String[] args) {
        InnerClass innerClass = getInnerClass();
    }
}
