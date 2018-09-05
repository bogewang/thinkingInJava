/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_01._11;

import com.bogewang.ch13._06_01._10.Exr10;
import org.junit.Test;

public class Exr11 {

    @Test
    public void test(){
        Exr10 exr10 = new Exr10();
        String s = "Arline ate eight apples and one orange while Anita hadn't any";
        exr10.matcher(s, "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        //(^[aeiou]) 已元音字母开头
        //(\s+[aeiou])) 非次字符开头,紧跟元音字母;
        //\w+?[aeiou] 单词+ 元音字母结尾;
    }
}
