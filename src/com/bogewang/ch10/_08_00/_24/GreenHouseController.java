/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._08_00._24;

public class GreenHouseController {

    public static void main(String[] args) {
        GreenhouseControllers gc = new GreenhouseControllers();
        Event[] events = {
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new FanOn(600),
                gc.new FanOff(800)
        };
        gc.addEvent(gc.new Restart(2000, events));
        gc.addEvent(new GreenhouseControllers.Terminate(5000));

        gc.run();

    }
}
