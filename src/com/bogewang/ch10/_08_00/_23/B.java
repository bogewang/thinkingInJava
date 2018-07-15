/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._08_00._23;

public class B {
    private U[] uArr;
    private int size = 0;

    public B(int size) {
        uArr = new U[size];
    }

    /**
     * 添加数据;
     * @param u
     * @return
     */
    public boolean add(U u){
        if (size < uArr.length){
            uArr[size++] = u;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 清空数据
     */
    public void clear(int index){
        for (int i=0; i<uArr.length; i++){
            if (i == index) {
                uArr[i] = null;
            }
        }
    }

    public void sayMethods(){
        for (int i=0; i<uArr.length; i++){
            U u = uArr[i];
            if (u != null){
                u.m1();
                u.m2();
                u.m3();
            }
        }
    }

    public static void main(String[] args) {
        A[] aArr = new A[20];
        for (int i=0; i<aArr.length; i++){
            aArr[i] = new A(i);
        }

        B b = new B(20);

        for (int i=0; i<aArr.length; i++){
            b.add(aArr[i].getU());
        }

        b.sayMethods();
        System.out.println("=====================");

        /**
         * 清除某些元素;
         *
         *
         */
        b.clear(5);
        b.sayMethods();
    }
}
