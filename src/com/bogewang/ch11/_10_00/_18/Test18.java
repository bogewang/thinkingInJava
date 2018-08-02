/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._10_00._18;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test18 {
    @Test
    public void test(){
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("Akey", "Avalue");
        hashMap.put("Ckey", "Cvalue");
        hashMap.put("Bkey", "Bvalue");
        hashMap.put("Dkey", "Dvalue");

        Iterator<String> iterator = hashMap.keySet().iterator();
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        String[] sortedKey = new String[hashMap.size()];

        int index = 0;
        while(iterator.hasNext()){
            sortedKey[index++] = iterator.next();
        }

        insertSort(sortedKey);

        for (String s : sortedKey){
            linkedHashMap.put(s, hashMap.get(s));
        }

        for (Map.Entry s: linkedHashMap.entrySet()){
            System.out.println(s);
        }
    }

    /**
     * 插入排序法;
     * @param arr
     */
    public void insertSort(String[] arr){
        int length = arr.length;
        for (int i=1; i<length; i++){
            for (int j=i-1; j>0 && (arr[j].compareTo(arr[j+1])>0); j--){
                swap(arr, j, j+1);
            }
        }
    }

    /**
     * 交换数组的两个下标;
     * @param arr
     * @param i
     * @param j
     */
    public void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
