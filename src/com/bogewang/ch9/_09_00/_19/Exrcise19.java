/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch9._09_00._19;

import org.junit.Test;

public class Exrcise19 {

    @Test
    public void test(){
        palyGame(new DiceFactory());
        palyGame(new CoinFactory());

    }

    public void palyGame(GameFactory gameFactory){
        Game game = gameFactory.getGame();
        game.paly();
    }
}
