/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._07;

import org.junit.Test;

import static net.mindview.util.Print.print;

class Candy {
    static { print("Loading Candy"); }
}

class Gum {
    static { print("Loading Gum"); }
}

class Cookie {
    static { print("Loading Cookie"); }
}

public class SweetShop {

    @Test
    public void test() {
        String[] clazzs = {
                "com.bogewang.ch14._02_00._07.Candy"
                , "com.bogewang.ch14._02_00._07.Gum"
                , "com.bogewang.ch14._02_00._07.Cookie"};
        for (String clazzName : clazzs){
            creatingClass(clazzName);

        }
    }

    public void creatingClass(String clazz){
        try {
            Class.forName(clazz);
        } catch(ClassNotFoundException e) {
            print("Couldn't find " + clazz);
        }
    }
}
