package com.bogewang.ch3._08_07;

import org.junit.Test;

public class CoinTest {

    public static final double THROWTIME = 50000.00;

    @Test
    public void test(){
        Coin coin = new Coin();

        /**
         * ������ͳ��;
         */
        int count = 0;
        for (int i=0; i<THROWTIME; i++){
            if (Coin.POSITIVE.equals(coin.throwCoin())){
                count ++;
            }
        }

        System.out.println(count);
        double result = count/THROWTIME;

        System.out.println("����" + THROWTIME +"��,���泯�ϵĸ���Ϊ:" + result);
    }
}
