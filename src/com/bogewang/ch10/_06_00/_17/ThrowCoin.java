/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._17;

public class ThrowCoin implements Game {
    @Override
    public void paly() {
        System.out.println("thorw coin");
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new ThrowCoin();
        }
    };
}
