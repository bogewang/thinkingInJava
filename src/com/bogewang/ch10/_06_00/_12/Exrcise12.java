/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._12;

import org.junit.Test;

public class Exrcise12 {
    @Test
    public void test(){
        Parcel12 parcel7 = new Parcel12(100);
        PContent pContent = parcel7.getPContent();
        pContent.changeValue(200);
        System.out.println(parcel7.getValue());

        parcel7.userInnerMethod();
    }
}
