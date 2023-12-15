package com.tardisgallifrey.startrekrpg;

import java.util.Scanner;

public class StarTrekCharacterGen {
    public static void main(String[] args) {

        char choice = 'N';
        Character player = new Character(7, 7, 7, 7, 7, 7);

        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the Star Trek Captain's Log Character Generator.");
        System.out.println("We will now begin your LifePath.");
        System.out.println("Do you wish to allow the generator to");
        System.out.println("randomly pick Star Trek Era and Race?");
        System.out.print("Enter Y or N --> ");

        try {
            //Scanner reads lines
            //This is how to get a char by itself.
            choice = input.next().charAt(0);
            //Every path out of a try/catch needs a close()

        }catch(Exception e) {

            System.out.println("Something isn't right: " + e.toString());

        }

        switch(choice){
            case 'y':
            case 'Y':
                player.setEra(true);
                player.setRace(true);
                break;
            default:
                player.setEra(false);
                player.setRace(false);
        }



            //        End of main function
    }

}