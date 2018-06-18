/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

import org.junit.Test;

public class FilterProcess {
    @Test
    public void test(){
        Wareform wareform = new Wareform();
        Apply.proecss(new FilterAdapter(new LowPass(1.0)), wareform);
        Apply.proecss(new FilterAdapter(new HighPass(2.0)), wareform);
        Apply.proecss(new FilterAdapter(new BandPass(3.0, 4.0)), wareform);
    }
}
