/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_01._08;

import org.junit.Test;
import strings.Splitting;

import java.util.Arrays;

public class Exr08 {

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(Splitting.knights.split(regex)));
    }

    @Test
    public void test(){
        split("\\W+shrubbery,\\W+");
    }
}
