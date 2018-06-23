/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._04_00._07;

public class Parcel7 {
    private int value;
    private void outerSay(){
        System.out.println("outervalue: "+ value);
    }

    public Parcel7(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void userInnerMethod(){
        PContent pContent = new PContent();
        pContent.changeValue(300);
    }

    class PContent{
        private int innvalue = 5;
        void changeValue(int value){
            Parcel7.this.value = value;
            Parcel7.this.outerSay();
        }

        public Parcel7 getParcel7(){
            return Parcel7.this;
        }
    }
}
