package com.bogewang.ch3._04_03;

import org.junit.Test;

/**
 * 方法的参数的传递;
 */
public class CallMothed {

    public void f(Letter letter){
        letter.c = 100;
    }

    @Test
    public void test(){
        Letter letter = new Letter();
        letter.c = 50;
        System.out.println(letter.c);

        f(letter);
        System.out.println(letter.c);

        /**
         * 测试idea自动生成json格式串
         */
        //language=JSON
        String jsonStr = "{\"name\":\"bogewang\",\"age\":\"18\"}";
    }
}
