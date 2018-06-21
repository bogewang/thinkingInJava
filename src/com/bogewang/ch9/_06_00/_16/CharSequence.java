/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._06_00._16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 利用适配模式生成随机字符序列;
 */
public class CharSequence implements Readable{
    private int count;

    public CharSequence(int count) {
        this.count = count;
    }

    public CharSequence() {
    }

    private char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0){
            return -1;
        }
        String next = next();
        cb.append(next);
        return 10;
    }

    public String next(){
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<10; i++){
            stringBuffer.append(chars[random.nextInt(chars.length)]);
        }
        return stringBuffer+"  ";
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(new CharSequence(5));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
