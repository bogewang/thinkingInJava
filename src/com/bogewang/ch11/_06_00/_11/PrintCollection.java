package com.bogewang.ch11._06_00._11;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class PrintCollection<T> {

    public void print(Collection<T> c){
        if (c != null){
            for(T t : c){
                System.out.println(t);
            }
        }
    }
}
