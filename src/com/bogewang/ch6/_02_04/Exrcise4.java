/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch6._02_04;

import org.junit.Test;


/**
 * protected 含有包访问权限;
 */
public class Exrcise4 {

    @Test
    public void test(){
        Person person = new Person();
        person.age = 5;
        System.out.println(person.age);

    }
}
