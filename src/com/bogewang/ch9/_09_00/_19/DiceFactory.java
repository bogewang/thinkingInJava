/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._09_00._19;

public class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}
