package com.bogewang.ch3._04_03;

import org.junit.Test;

/**
 * �����Ĳ����Ĵ���;
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
         * ����idea�Զ�����json��ʽ��
         */
        //language=JSON
        String jsonStr = "{\"name\":\"bogewang\",\"age\":\"18\"}";
    }
}
