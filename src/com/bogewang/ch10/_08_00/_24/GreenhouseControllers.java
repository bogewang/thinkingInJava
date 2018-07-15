/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._08_00._24;

public class GreenhouseControllers extends Controller {
    private boolean light = false;
    public class  LightOn extends Event{

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "light is on";
        }
    }

    public class LightOff extends Event{
        @Override
        public void action() {
            light = false;
        }

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "light is off";
        }
    }

    private boolean fan = false;
    public class FanOn extends Event{
        @Override
        public void action() {
            fan = true;
        }

        public FanOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "fan is on";
        }
    }

    public class FanOff extends Event{
        @Override
        public void action() {
            fan = false;
        }

        public FanOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "fan is off";
        }
    }

    public class Restart extends Event{
        private Event[] events;

        public Restart(long delayTime, Event[] events) {
            super(delayTime);
            this.events = events;
            for (Event e: events){
                e.start();
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e: events){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "restarting system";
        }
    }

    public static class Terminate extends Event{
        @Override
        public void action() {
            System.exit(0);
        }

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Terminateing";
        }
    }
}
