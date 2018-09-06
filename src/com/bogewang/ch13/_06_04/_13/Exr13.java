/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch13._06_04._13;

import strings.Groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class Exr13 {

    public static String input = Groups.POEM;


    private static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                print(regex);
                regexPrinted = true;
            }
            print(message);
        }

        static void examine(String s, String regex) {
            Display display = new Display(regex);
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(s);
            while (m.find()) {
                display.display("find() '" + m.group() + "' start= " + m.start() + " end= "
                        + m.end());
            }

                if (m.lookingAt()) {
                    display.display("lookingAt() start= " + m.start() + " end= " + m.end());
                }

                if (m.matches()) {
                    display.display("lookingAt() start= " + m.start() + " end= " + m.end());
                }
        }

        public static void main(String[] args) {
            for (String in : input.split("\n")) {
                print(" input: " + in);
                for (String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "The frumious Bandersnatch"}) {
                    examine(in, regex);
                    System.out.println("====================");
                }
            }
        }

    }

}