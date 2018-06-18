/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._02_00._09;

public abstract class Instr{
    public void play(Note n) {
        System.out.println(this + ".paly() " +n);
    }

    public void adjust() {
        System.out.println(this + ".adjust() ");
    }
}
