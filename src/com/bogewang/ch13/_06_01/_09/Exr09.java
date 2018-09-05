/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_01._09;

import org.junit.Test;
import strings.Splitting;
import sun.security.util.AuthResources_it;

public class Exr09 {

    @Test
    public void test(){
        String s = Splitting.knights;
        System.out.println(s.replaceAll("[aeiou]", "_"));
    }
}
