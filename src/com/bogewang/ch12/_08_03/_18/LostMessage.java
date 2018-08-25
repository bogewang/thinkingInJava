/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch12._08_03._18;

import org.junit.Test;

public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    @Test
    public void test(){

        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } catch (Exception e){
                System.out.println(e);
            }finally {
                lm.dispose();
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
