/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._09_00._18;

public class UniFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
