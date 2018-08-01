/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._13;

import org.junit.Test;

public class Exrcise13 {

    public Destintion getDestintion(){
        return new Destintion() {
            @Override
            public void toWhere() {
                System.out.println("inner pdestintion");
            }
        };
    }

    @Test
    public void test(){
        Destintion destintion = getDestintion();
        destintion.toWhere();
    }
}
