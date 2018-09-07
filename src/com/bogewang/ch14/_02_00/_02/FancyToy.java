/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch14._02_00._02;

import com.bogewang.ch14._02_00._01.HasBatteries;
import com.bogewang.ch14._02_00._01.Shoots;
import com.bogewang.ch14._02_00._01.Toy;
import com.bogewang.ch14._02_00._01.Waterproof;

public class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Exr02{
    public FancyToy() {
        super(1);
    }
}
