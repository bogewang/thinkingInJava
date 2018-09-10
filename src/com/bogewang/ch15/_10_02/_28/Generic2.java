/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch15._10_02._28;

public class Generic2<T> {

    private T t;

    public Generic2(T t) {
        this.t = t;
    }

    public T get(){
        return t;
    }
}
