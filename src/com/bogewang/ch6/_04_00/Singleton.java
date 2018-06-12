/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch6._04_00;

/**
 * 静态内部类单例模式;
 */
public class Singleton {

    private Singleton(){}

    public Singleton getInstance(){
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
}
