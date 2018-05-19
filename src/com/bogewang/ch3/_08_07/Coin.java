package com.bogewang.ch3._08_07;

import java.util.Random;

public class Coin {

    public static final String  POSITIVE = "positive";
    public static final String NEGATIVE = "negative";
    private Random random = new Random();

    public String throwCoin(){
        boolean b = random.nextBoolean();
        return b ? POSITIVE : NEGATIVE;
    }

    public Coin() {
    }

}
