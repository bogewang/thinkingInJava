package com.bogewang.ch4._08_00;

import org.junit.Test;

/**
 * 产生n个斐波拉契数
 */
public class FibonacciTest {

    public int getFibonacci(int i){
        if (i < 0){
            System.out.println("请输入正整数!");
            return -1;
        } else if (i == 1 || i == 2){
            return 1;
        } else {
            return getFibonacci(i-1) + getFibonacci(i-2);
        }
    }

    @Test
    public void test(){
        testNFib(6);
    }

    public void testNFib(int count){
        if (count < 0){
            System.out.println("请输入正整数!");
            return ;
        }
        for (int i=1; i<=count; i++){
            System.out.println(getFibonacci(i));
        }
    }
}
