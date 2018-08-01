/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._08_00._23;

public class A {
    private int i;
    public A(int i) {
        this.i = i;
    }

    /**
     * 方法内生成匿名内部类;
     * @return
     */
    public U getU(){
        class AU implements U{

            @Override
            public void m1() {
                System.out.println("m1:" + i);
            }

            @Override
            public void m2() {
                System.out.println("m2:" + i);
            }

            @Override
            public void m3() {
                System.out.println("m3:" + i);
            }
        }

        return new AU();
    }
}
