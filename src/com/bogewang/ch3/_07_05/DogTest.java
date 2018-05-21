package com.bogewang.ch3._07_05;

import org.junit.Test;

public class DogTest {

    @Test
    public void test(){
        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dog.setName("spot");
        dog.setSays("ruff");
        System.out.println(dog.getName() + ":" + dog.getSays());

        dog2.setName("scruff");
        dog2.setSays("wurf");
        System.out.println(dog2.getName() + ":" + dog2.getSays());

        System.out.println(dog.equals(dog2));   //false
        System.out.println(dog == dog2);        //地址比较; false

        dog2.setName("spot");
        dog2.setSays("ruff");
        System.out.println(dog.equals(dog2));   //true
        System.out.println(dog == dog2);        //false
    }
}
