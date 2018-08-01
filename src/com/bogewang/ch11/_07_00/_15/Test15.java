/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._07_00._15;

import org.junit.Test;

public class Test15 {
    @Test
    public void test(){
        MyStack<String> stack = new MyStack<>();
        stack.push("U");
        stack.push("n");
        stack.push("c");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("e");
        stack.push("r");
        stack.push("t");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("a");
        stack.pop();
        stack.push("i");
        stack.pop();
        stack.push("n");
        stack.push("t");
        stack.push("y");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("-");
        stack.push("r");
        stack.push("u");
        stack.pop();
        stack.pop();
        stack.push("l");
        stack.push("e");
        stack.push("s");
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
