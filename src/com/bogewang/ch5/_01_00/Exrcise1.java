package com.bogewang.ch5._01_00;

import org.junit.Test;

/**
 * 创建一个类,它包含一个未初始化的String引用,验证该引用被初始化为null;
 */
public class Exrcise1 {
    private String str;

    public Exrcise1() {
        System.out.println(str);
    }

    @Test
    public void test(){
        Exrcise1 exrcise1 = new Exrcise1();
    }
}
