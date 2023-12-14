package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.Era;
import com.tardisgallifrey.startrekrpg.enums.Race;

import java.util.Arrays;
import java.util.List;

public class StarTrekCharacterGen {
    public static void main(String[] args) {

        System.out.println("Welcome to the Star Trek Captain's Log Character Generator.");

        System.out.println("We will now begin your LifePath.");

        List<Race> races = List.of(Race.values());

        for(int i = 0; i < races.size(); i++){
            if(i % 4 != 0) {
                System.out.print( races.get(i) + "\t" );
            }else{
                System.out.println();
            }
        }
    }
}