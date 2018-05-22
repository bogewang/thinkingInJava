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

    public static void main(String[] args) {
        System.out.println(m_1());
    }
    public static int m_1(){
        int i = 10;
        try{
            System.out.println("start");
            return i += 10;
        }catch(Exception e){
            System.out.println("error:"+e);
        }finally{
            if(i>10){
                System.out.println(i);
            }
            System.out.println("finally");
            return 50;
        }
    }

}
