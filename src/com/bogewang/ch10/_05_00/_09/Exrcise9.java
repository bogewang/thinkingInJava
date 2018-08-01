/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._05_00._09;

import org.junit.Test;

public class Exrcise9 {

    public Destintion getDestintion(){
        class PDestintion implements Destintion{
            @Override
            public void toWhere() {
                System.out.println("inner pdestintion");
            }
        }
        return new PDestintion();
    }

    @Test
    public void test(){
        Destintion destintion = getDestintion();
        destintion.toWhere();
    }
}
