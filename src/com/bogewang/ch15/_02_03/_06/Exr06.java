/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch15._02_03._06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class Exr06<T> {

    private ArrayList<T> stotage =  new ArrayList<T>();
    private Random random = new Random(47);
    public void add(T t){
        stotage.add(t);
    }

    public T select(){
        return stotage.get(random.nextInt(stotage.size()));
    }

    @Test
    public void test(){
        Exr06<Person> personExr06 = new Exr06<>();
        int i=0;
        while(i<100){
            Person person = new Person("person " + i);
            personExr06.add(person);
            ++i;
        }

        while(i<120){
            System.out.println(personExr06.select());
            ++i;
        }

    }

}
