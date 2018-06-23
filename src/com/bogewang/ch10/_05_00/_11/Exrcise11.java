/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._05_00._11;

import org.junit.Test;

public class Exrcise11 {

    private class PDestintion implements Destintion{
        @Override
        public void toWhere() {

        }
    }

    public Destintion getDestintion(){
        return new PDestintion();
    }

    @Test
    public void test(){
//        PDestintion destintion = getDestintion(); 不能向下转型;
//        destintion.toWhere();
    }
}
