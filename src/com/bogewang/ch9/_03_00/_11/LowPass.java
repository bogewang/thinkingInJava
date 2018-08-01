/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._03_00._11;

public class LowPass extends Filter {
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    double cutoff;

    @Override
    public Wareform proecss(Wareform input) {
        return input;
    }
}
