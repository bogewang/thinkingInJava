package com.bogewang.ch2;

import org.junit.Test;

/**
 * ��֤static���εĳ�Ա����ֻ��һ��ʵ��;
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
