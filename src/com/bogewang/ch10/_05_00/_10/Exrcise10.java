/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._05_00._10;

import org.junit.Test;

public class Exrcise10 {

    public Destintion getDestintion(){

        if (true){
            class PDestintion implements Destintion {
                @Override
                public void toWhere() {
                    System.out.println("inner pdestintion");
                }
            }
            return new PDestintion();
        } else {
            return null;
        }

    }

    @Test
    public void test(){
        Destintion destintion = getDestintion();
        destintion.toWhere();
    }
}
