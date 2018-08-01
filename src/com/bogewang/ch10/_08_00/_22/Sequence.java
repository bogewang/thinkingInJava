/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._08_00._22;

import com.bogewang.ch10._02_00._02.Selector;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x){
        if (next < items.length){
            items[next++] = x;
        }
    }

    public class reverseSelector implements Selector{
        private int i = items.length-1;
        @Override
        public boolean end() {
            return i <= -1;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i >= 0){
                i--;
            }
        }
    }

    public Selector reverseSelector(){
        return new reverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i=0; i<10; i++){
            sequence.add(i);
        }

        Selector selector = sequence.reverseSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
