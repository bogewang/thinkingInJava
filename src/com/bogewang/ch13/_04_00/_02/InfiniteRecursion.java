/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._04_00._02;

import org.junit.Test;

import java.util.ArrayList;

public class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }

    @Test
    public void test(){
        ArrayList<InfiniteRecursion> infiniteRecursions = new ArrayList<>();
        for (int i=0; i<10; i++){
            infiniteRecursions.add(new InfiniteRecursion());
        }


        System.out.println(infiniteRecursions);
    }
}
