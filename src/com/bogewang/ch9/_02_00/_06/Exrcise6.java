/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._02_00._06;

import com.bogewang.ch9._02_00._05.Factory;
import com.bogewang.ch9._02_00._05.ShoeFactory;
import org.junit.Test;

/**
 * 证明接口内的所有的方法自动都是public;
 */
public class Exrcise6 {
    @Test
    public void test(){
        Factory factory = new ShoeFactory();
        factory.paytaxes();
    }
}
