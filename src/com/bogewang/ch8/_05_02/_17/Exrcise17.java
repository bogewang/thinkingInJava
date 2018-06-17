/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch8._05_02._17;

import org.junit.Test;

public class Exrcise17 {
    private Cycle unicycle = new Unicycle();
    private Cycle bicycle = new Bicycle();
    private Cycle tricycle = new Tricycle();

    @Test
    public void test(){
        Cycle[] cycles = {tricycle, unicycle, bicycle};
//        tricycle.balance(); 没有此方法不能调用;
//        unicycle.balance();
//        bicycle.balance();

//        ((Tricycle)tricycle).balance();
        ((Unicycle)unicycle).balance();
        ((Bicycle)bicycle).balance();

    }

}
