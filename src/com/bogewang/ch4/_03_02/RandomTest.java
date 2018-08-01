package com.bogewang.ch4._03_02;

import org.junit.Test;

import java.util.Random;

/**
 * 生成25个随机整数,并比较前后的大小;
 *
 *
 *
 */
public class RandomTest {

    @Test
    public void test(){
        Random random = new Random();
        int[] intArr = new int[25];
        for (int i=0; i<25; i++){
            intArr[i] = random.nextInt(100);
            if (i>0){
                if (intArr[i] > intArr[i-1]){
                    System.out.print("<");
                } else if (intArr[i] == intArr[i-1]){
                    System.out.print("=");
                } else {
                    System.out.print(">");
                }
            }
            System.out.print(intArr[i]);
        }
    }
}
