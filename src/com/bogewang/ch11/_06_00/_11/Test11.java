package com.bogewang.ch11._06_00._11;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static jdk.nashorn.internal.objects.Global.print;

public class Test11 {
    @Test
    public void test(){

        PrintCollection<String> pc = new PrintCollection<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        pc.print(linkedList);
        pc.print(hashSet);
    }
}
