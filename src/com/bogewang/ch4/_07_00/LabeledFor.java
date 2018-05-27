package com.bogewang.ch4._07_00;

import org.junit.Test;

/**
 * java标签的应用;
 */
public class LabeledFor {

    @Test
    public void test(){
        int i=0;
        outer:
        for(;true;){
            inner:
            for (; i<10; i++){
                System.out.println("i=" + i);
                if (i == 2){
                    System.out.println("continue");
                    continue ;
                }

                if (i == 3){
                    System.out.println("break");
                    i++;
                    break ;
                }

                if (i == 7){
                    System.out.println("continue outer");
                    i++;
                    continue  outer;
                }

                if (i == 8){
                    System.out.println("break outer");
                    break outer;
                }

                for (int k=0; k<5; k++){
                    if (k==3){
                        System.out.println("k continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
