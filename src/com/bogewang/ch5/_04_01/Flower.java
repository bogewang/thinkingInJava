package com.bogewang.ch5._04_01;

public class Flower {
    int count = 0;
    String s;

    public Flower() {
//        System.out.println(111); 构造器中调用this只能放在第一位;
        this(8);
//        this(""); 调用this只能调用一次;
    }

    public Flower(int count) {
        this.count = count;
    }

    public Flower(String s) {
        this.s = s;
    }

    public void test(){
//        this();   普通方法中不能使用this()调用构造器;
    }
}
