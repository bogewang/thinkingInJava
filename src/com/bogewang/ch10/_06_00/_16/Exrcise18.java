/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._16;

import org.junit.Test;

public class Exrcise18 {
    @Test
    public void test(){
        wheels(Unicycle.factory);
        wheels(Bicycle.factory);
        wheels(Tricycle.factory);

    }

    public void wheels(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        cycle.wheels();
    }
}
