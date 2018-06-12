package com.bogewang.ch5._08_00;

import org.junit.Test;

/**
 * 测试可变数组;
 */
public class Exrcise20 {

    public static void main(String[] args) {
        System.out.println(1);

    }
    public void main(String[]... args){
        for(String[] arg :args){
            for(String str : arg){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void test(){
        main(new String[]{"1", "2"}, new String[]{"1","2","3"});
        main(new String[]{"2", "3", "4"}, new String[]{"4","5","6"}, new String[]{"7","8","9"});
    }

}
