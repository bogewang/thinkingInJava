package com.bogewang.ch5._03_00;

import org.junit.Test;

public class Dog {

    public void barking(int n, String word){
        for(int i=0; i<n; i++){
            System.out.println(word + " at second!");
        }
    }

    public void howling(String word, int n){
        for(int i=0; i<n; i++){
            System.out.println(word + " at first!");
        }
    }

    @Test
    public void test(){
        barking(5, "汪");
        howling("哦", 5);
    }
}
