package com.bogewang.ch2;

import org.junit.Test;

/**
 * 验证static修饰的成员变量只有一个实例;
 */
public class _02_08 {

    @Test
    public void test(){
        for (int i=0; i<10; i++){
            Person person = new Person();
            System.out.println(person.num++);
        }
    }
}
