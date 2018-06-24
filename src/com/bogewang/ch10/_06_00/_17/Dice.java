/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._17;

public class Dice implements Game {
    @Override
    public void paly() {
        System.out.println("dice");
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}
