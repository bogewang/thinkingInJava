package com.bogewang.ch3._08_07;

import org.junit.Test;

public class CoinTest {

    public static final double THROWTIME = 50000.00;

    @Test
    public void test(){
        Coin coin = new Coin();

        /**
         * 正面数统计;
         */
        int count = 0;
        for (int i=0; i<THROWTIME; i++){
            if (Coin.POSITIVE.equals(coin.throwCoin())){
                count ++;
            }
        }

        System.out.println(count);
        double result = count/THROWTIME;

        System.out.println("扔了" + THROWTIME +"次,正面朝上的概率为:" + result);
    }
}
