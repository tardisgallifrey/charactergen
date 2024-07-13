package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.util.Menu;

public class StarTrekCharacterGen {
    public static void main(String[] args) {

        //Create character from class,
        //Set defaults: all attributes to 7,
        //all disciplines to 1.
        // "Captain's Log", p 92 Modiphius
        Character player = new Character(7,
                                        7,
                                        7,
                                        7,
                                        7,
                                        7,
                                        1,
                                        1,
                                        1,
                                        1,
                                        1,
                                        1);


        //Print opening messages and first question
        //Life Path can choose race and era (simplest for myself)
        //Or player can choose race and era.
        System.out.println("Welcome to the Star Trek Captain's Log Character Generator.");
        System.out.println("We will now begin your LifePath.");
        System.out.println("Do you wish to allow the generator to");
        System.out.println("randomly pick Star Trek Era and Species?");


        int choice = Menu.yes_no();

        if(choice == 'Y'){
            player.setEra(true);
            player.setSpecies(true);
        }else{
            player.setEra(false);
            player.setSpecies(false);
        }

        player.species_bonus();
        player.environment_bonus();
        player.upbringing();
        player.education();
        player.career_length();
        player.career_events();
        player.final_touches();
        player.assignment();
        player.showCharacter();

            //        End of main function
    }

}