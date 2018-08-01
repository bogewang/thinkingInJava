package com.bogewang.ch3._11_11;

import org.junit.Test;

import java.util.Random;

public class BitManipulation {

    /**
     * 二进制最高位 0:正; 1:负数;
     */
    @Test
    public void test(){
        Random random = new Random(47);
        int i = random.nextInt();
        int j = random.nextInt();

        printBinaryInt("-1", -1);   //11111111111111111111111111111111
        printBinaryInt("+1", +1);   //1

        //最大的+int
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);   //1111111111111111111111111111111 比-1少一个1；

        //最小的-int
        int maxneg = -2147483648;
        int maxposplus1 = maxpos + 1;
        printBinaryInt("maxneg", maxneg);   //10000000000000000000000000000000
        printBinaryInt("maxposplus1", maxposplus1);   //10000000000000000000000000000000
        //上面两者相等； 最大的int +1 = 最小的int；

        System.out.println(i);         //1172028779
        printBinaryInt("i", i);     //10111010001001000100001010010101
        //printBinaryInt("-i", -i);   //1000101110110111011110101101011

        printBinaryInt("j", j);     //1100110010110110000010100010110

        //printBinaryInt("i&j", i&j);   //100010000000000000000000010100
        //printBinaryInt("i|j", i|j);   //11111110011111110100011110010111 ?为何会多出来两位;
        //printBinaryInt("i^j", i^j);    //11011100011111110100011110000011 异或运算: 相同为0,不同为1
        //printBinaryInt("i<<5", i<<5);    //1000100100010000101001010100000 左移 ,低位0补齐; =i*2^5

        printBinaryInt("~i", ~i);   //1000101110110111011110101101010 非运算符;
        printBinaryInt("(~i)>>5", (~i)>>5);     //10001011101101110111101011
        printBinaryInt("(~i)>>>5", (~i)>>>5);   //10001011101101110111101011

        printBinaryInt("i>>5", i>>5);   //右移 11111101110100010010001000010100 高位1补齐;
        printBinaryInt("i>>>5", i>>>5);     //101110100010010001000010100 不论正负数，高位都补0





    }

    private void printBinaryInt(String s, int i) {
        System.out.println(s + ":" + Integer.toBinaryString(i));
    }
}
