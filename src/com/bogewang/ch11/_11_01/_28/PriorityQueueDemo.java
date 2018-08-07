/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._11_01._28;

import org.junit.Test;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {
    @Test
    public void test() {
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            doubles.offer(random.nextDouble());
        }

        while(doubles.size()>0){
            System.out.println(doubles.poll());
        }

    }
}
