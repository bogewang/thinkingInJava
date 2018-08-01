/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._07_00._14;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test14 {
    @Test
    public void test(){
        List<Integer> integers = new LinkedList<>();
        for (int i=0; i<10; i++){
            insertListMiddle(integers, i);
        }

        for (Integer i : integers){
            System.out.println(i);
        }
    }

    /**
     * 将object插入list的中间;
     * @param list
     * @param object
     */
    public void insertListMiddle(List list, Object object){
        if (list != null){
            if (list.size() == 0){
                list.add(object);
            } else {
                int middleIndex = list.size()/2;
                ListIterator iterator = list.listIterator();
                while (iterator.hasNext()){
                    if (iterator.nextIndex() == middleIndex){
                        iterator.add(object);
                    } else {
                        iterator.next();
                    }
                }
            }
        }
    }
}
