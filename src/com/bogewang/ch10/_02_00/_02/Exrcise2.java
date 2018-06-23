/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._02_00._02;

import org.junit.Test;

public class Exrcise2 {

    @Test
    public void test(){
        Sequence sequence = new Sequence(20);
        for (int i=0; i< 20; i++){
            sequence.add(new MyString(i+""));
        }

        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current() +"  ");
            selector.next();
        }
    }
}
