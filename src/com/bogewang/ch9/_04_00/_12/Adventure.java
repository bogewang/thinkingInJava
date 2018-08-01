/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._04_00._12;

import org.junit.Test;

public class Adventure {
    @Test
    public void test(){
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }


    public void t(CanSwim x){
        x.swim();
    }

    public void u(CanFly x){
        x.fly();
    }

    public void v(CanFight x){
        x.fight();
    }

    public void w(CanClimb x){
        x.climb();
    }
}
