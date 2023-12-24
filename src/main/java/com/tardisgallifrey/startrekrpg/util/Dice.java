package com.tardisgallifrey.startrekrpg.util;

import java.util.Random;

public class Dice {

    public static int D6(){
        Random roll = new Random();
        return roll.nextInt(6) + 1;
    }

    public static int D20(){
        Random roll = new Random();
        return roll.nextInt(20) + 1;
    }

    public static boolean Even_Odd(){
        int roll = D20();
        if( roll % 2 == 0){
            //Even
            return true;
        }else{
            //Odd
            return false;
        }
    }
}
