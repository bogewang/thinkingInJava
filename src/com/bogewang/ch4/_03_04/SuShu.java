package com.bogewang.ch4._03_04;

import org.junit.Test;

/**
 * 获取0-100的素数;
 */
public class SuShu {

    @Test
    public void test(){

        for (int i=1; i<100; i++){
            boolean isSuShu = true;
            for (int j=2; j<i; j++){
                if (i%j == 0) {
                    isSuShu = false;
                } else {
                    continue;
                }
            }
            if (isSuShu){
                System.out.println(i);
            }
        }
    }
}
