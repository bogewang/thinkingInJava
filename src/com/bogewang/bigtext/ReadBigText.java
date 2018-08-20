/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.bigtext;


import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadBigText {

    @Test
    public void test(){
        try {
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream("resources\\big.txt"), 8192);
            int bytes = -1;
            do {
                byte[] temArray = new byte[8192];
                bytes = reader.read(temArray);
                if (bytes != -1){
                    System.out.println(new String(temArray));
                }
            } while(bytes > 0 );
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2(){
        try {
            FileInputStream fileIn = new FileInputStream("resources\\big.txt");
            ByteBuffer byteBuffer = ByteBuffer.allocate(65535);
            FileChannel fileInChannel = fileIn.getChannel();
            int bytes = -1;
            do {
                bytes = fileInChannel.read(byteBuffer);
                if (bytes != -1){
                    byte[] array = new byte[bytes];
                    byteBuffer.flip();
                    byteBuffer.get(array);
                    byteBuffer.clear();
                    System.out.println(new String(array));
                }
            } while (bytes >0);
            byteBuffer.clear();
            fileInChannel.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
