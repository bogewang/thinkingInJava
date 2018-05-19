package com.bogewang.ch2;

import org.junit.Test;

public class AllTheColorsOfTheRainbow {

    int anIntegerRespresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRespresentingColors = newHue;
    }

    @Test
    public void test(){
        changeTheHueOfTheColor(1);
        System.out.println(anIntegerRespresentingColors);
    }
}
