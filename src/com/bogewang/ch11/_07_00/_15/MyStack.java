/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._07_00._15;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T t){
        storage.addFirst(t);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        System.out.println(storage.getFirst());
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
