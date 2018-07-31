package com.bogewang.ch11._05_00._7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatListTest {
    @Test
    public void test(){
        Cat[] catsArray = {new Cat("helloKitty", "pink"), new Cat("tiger", "yellow"),
                new Cat("bosiCat", "black"), new Cat("buouCat", "white")};

        List<Cat> catArrayList = Arrays.asList(catsArray);

        printList(catArrayList);

        List<Cat> subList = catArrayList.subList(1, 3);
        printList(subList);

        /**
         * 由数组生成的LIst, 大小固定 ;底层是数据不能调整尺寸;
         */
        catArrayList.removeAll(subList);
        printList(catArrayList);
    }

    /**
     * list打印方法;
     * @param list
     */
    public void printList(List list){
        if (list != null && list.size()>0){
            for(Object object : list){
                System.out.println(object);
            }
            System.out.println("=====================");
        }
    }
}
