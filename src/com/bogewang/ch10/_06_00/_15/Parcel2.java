/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._15;

import org.junit.Test;

public class Parcel2 {

    Parcel1 getParcel1(int age){
        return new Parcel1(age){
            private int name;

            public int getName() {
                return name;
            }

            public void setName(int name) {
                this.name = name;
            }
        };
    }

    @Test
    public void test(){
        Parcel1 parcel1 = getParcel1(300);
    }
}
