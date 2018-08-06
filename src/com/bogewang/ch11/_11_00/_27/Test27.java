/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._11_00._27;

import org.junit.Test;

import java.util.Queue;

public class Test27 {
    @Test
    public void test(){
        QueueUtil commandUtil = new QueueUtil();
        int i=0;
        while(i<10){
            Command command = new Command("" + i);
            commandUtil.fillQueue(command);
            i++;
        }

        Queue<Command> queue = commandUtil.getQueue();
        while (commandUtil.outQueue() != null);
    }

}
