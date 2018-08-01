/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._12;

public class Parcel12 {
    private int value;

    private void outerSay() {
        System.out.println("outervalue: " + value);
    }

    public Parcel12(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void userInnerMethod() {
        PContent pContent = getPContent();
        pContent.changeValue(300);
    }

    public PContent getPContent() {
        return new PContent(){
            private int innvalue = 5;

            public void changeValue(int value) {
                Parcel12.this.value = value;
                Parcel12.this.outerSay();
            }

            public Parcel12 getParcel7() {
                return Parcel12.this;
            }
        };
    }
}
