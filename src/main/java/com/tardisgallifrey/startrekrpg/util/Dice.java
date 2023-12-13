package com.tardisgallifrey.startrekrpg.util;

import java.util.Random;

public class Dice {

    public static int D6(){
        int r = 0;
        Random roll = new Random();
        r = roll.nextInt(6) + 1;
        return r;
    }

    public static int D20(){
        int r = 0;
        Random roll = new Random();
        r = roll.nextInt(20) + 1;
        return r;
    }
}
