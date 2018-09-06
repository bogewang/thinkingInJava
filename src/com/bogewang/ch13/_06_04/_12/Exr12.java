/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_04._12;

import org.junit.Test;
import strings.Groups;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Exr12 {

    @Test
    public void test(){
        Matcher m = Pattern.compile("\\b[a-z][a-zA-Z]*\\b")
                .matcher(Groups.POEM);

        HashMap<String, Object> resultMap = new HashMap<>();
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++) {
                if (resultMap.get(m.group(j)) == null) {
                    resultMap.put(m.group(j), m.group(j));
                    printnb("[" + m.group(j) + "]");
                }
            }
            print();
        }

        System.out.println("总计:" + resultMap.size() + " 个");


    }
}
