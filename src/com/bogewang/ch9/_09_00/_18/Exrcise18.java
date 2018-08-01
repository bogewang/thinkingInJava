/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._09_00._18;

import org.junit.Test;

public class Exrcise18 {
    @Test
    public void test(){
        wheels(new UniFactory());
        wheels(new BiFactory());
        wheels(new TriFactory());

    }

    public void wheels(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        cycle.wheels();
    }
}
