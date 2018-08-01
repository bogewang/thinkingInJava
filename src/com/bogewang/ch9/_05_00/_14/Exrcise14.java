/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._05_00._14;

import org.junit.Test;

public class Exrcise14 {
    @Test
    public void test(){

        TianYuanDog tianYuanDog = new TianYuanDog();
        t(tianYuanDog);
        u(tianYuanDog);
        v(tianYuanDog);
        w(tianYuanDog);
    }

    public void t(Animal x){
        x.breath();
    }
    public void u(HaveHair x){
        x.hair();
    }
    public void v(HaveFourlegs x){
        x.fourlegs();
    }
    public void w(Dog x){
        x.wangwang();
    }

}
