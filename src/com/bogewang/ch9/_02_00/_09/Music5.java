/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._02_00._09;

import org.junit.Test;

public class Music5 {
    static void tune(Palyable i){
        i.play(Note.MIDDLE_C);
    }

    @Test
    public void test(){
        Palyable[] palyables = {new Wind(), new Percussion(), new Stringed(),
        new Brass(), new Woodwind()};
        tuneAll(palyables);
    }

    public static void tuneAll(Palyable[] e){
        for(Palyable i :e){
            tune(i);
        }
    }
}
