/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._04_00._06._02;

import com.bogewang.ch10._04_00._06._01.Contents;

public class Parcel4 {

    protected class PContents implements Contents{
        private int value = 10;
        @Override
        public int value() {
            return value;
        }
    }

    PContents getPcontens(){
        return new PContents();
    }
}
