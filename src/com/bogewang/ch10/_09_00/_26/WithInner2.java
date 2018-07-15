/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._09_00._26;

/**
 * 创建一个包含内部类的类,此内部类有一个非默认的构造器,创建另一个也包含内部类的类,此内部类继承自第一个内部类;
 */
public class WithInner2 {
    class Inner2 extends WithInner.Inner{
        public Inner2(WithInner wi) {
            wi.super("hello");
        }
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        WithInner2 withInner2 = new WithInner2();
        withInner2.new Inner2(withInner);
    }
}
