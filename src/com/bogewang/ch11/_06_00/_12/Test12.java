package com.bogewang.ch11._06_00._12;

import org.junit.Test;

import java.util.*;

public class Test12 {
    @Test
    public void test(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        for (int i=0; i<10; i++){
            list1.add(i);
        }

        ListIterator<Integer> integerListIterator = list1.listIterator();
        while (integerListIterator.hasNext()){
            integerListIterator.next();
        }

        while (integerListIterator.hasPrevious()){
            list2.add(integerListIterator.previous());
        }

        for (Integer integer : list2){
            System.out.println(integer);
        }


    }
}
