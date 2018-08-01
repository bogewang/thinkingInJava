/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._04_00._07;

import org.junit.Test;

public class Exrcise7 {
    @Test
    public void test(){
        Parcel7 parcel7 = new Parcel7(100);
        Parcel7.PContent pContent = parcel7.new PContent();
        pContent.changeValue(200);
        System.out.println(parcel7.getValue());

        parcel7.userInnerMethod();
    }
}
