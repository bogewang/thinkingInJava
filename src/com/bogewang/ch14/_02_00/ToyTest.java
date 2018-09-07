/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00;


import org.junit.Test;

import static net.mindview.util.Print.print;

public class ToyTest {

    static void printInfo(Class clazz){
        print("Class name:" + clazz.getName() +
        " is interface ?[ " + clazz.isInterface() + "]" );
        print("simpleNmae : "+ clazz.getSimpleName());
        print("Canonical Name: " + clazz.getCanonicalName());
    }

    @Test
    public void test(){
        Class c = null;
        try {
            c = Class.forName("com.bogewang.ch14._02_00.FancyToy");
        } catch (ClassNotFoundException e) {
            print("can't find FacyToy");
            System.exit(1);
        }

        printInfo(c);

        for (Class face: c.getInterfaces()){
            printInfo(face);
        }

        Class superclass = c.getSuperclass();

        Object obj = null;

        try {
            /**
             * 需要无参的构造函数;
             */
            obj = superclass.newInstance();
        } catch (InstantiationException e) {
            print("cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("cannot access");
            System.exit(1);
        }

        printInfo(obj.getClass());


    }
}
