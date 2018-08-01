/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch7._02_01._14;

import org.junit.Test;

public class Car {
    private Engine engine = new Engine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
