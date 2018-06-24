/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._17;

import org.junit.Test;

public class Exrcise19 {

    @Test
    public void test(){
        palyGame(Dice.factory);
        palyGame(ThrowCoin.factory);

    }

    public void palyGame(GameFactory gameFactory){
        Game game = gameFactory.getGame();
        game.paly();
    }
}
