/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_01._10;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exr10 {
    @Test
    public void test(){
        String s = "Java now has regular expressions";
        String[] regexs = {"^Java" ,"\\Breg" ,"n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}"};
        for (int i=0; i<regexs.length; i++){
            matcher(s, regexs[i]);
            System.out.println("=========================");
        }

    }


    public void matcher(String src, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(src);
        while (matcher.find()){
            System.out.println("Match:\"" + matcher.group() + "\" at positions " + matcher.start() + "-" + (matcher.end() -1));
        }

    }
}
