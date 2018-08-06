/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch11._11_00._27;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtil {
    private Queue<Command> queue = new LinkedList<>();

    public Command fillQueue(Command command){
        if (queue.offer(command)){
            return command;
        } else {
            return null;
        }
    }

    public Command outQueue(){
        Command poll = queue.poll();
        if (poll != null){
            poll.operation();
            return poll;
        } else {
            return null;
        }

    }

    public QueueUtil(Queue<Command> queue) {
        this.queue = queue;
    }

    public QueueUtil() {
    }

    public Queue<Command> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Command> queue) {
        this.queue = queue;
    }
}
