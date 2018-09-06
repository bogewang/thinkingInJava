/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_05._14;

import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class Exr14 {

    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(input.split("!!")
        ));
        print(Arrays.toString(input.split("!!",3)
                ));
    }
}
