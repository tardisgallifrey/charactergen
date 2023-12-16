package com.tardisgallifrey.startrekrpg;

import java.util.Scanner;

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
        System.out.println("randomly pick Star Trek Era and Race?");
        System.out.print("Enter Y or N --> ");

        //Generally, I prefer all variables to be declared
        //at beginning of method/function/class
        //but for Scanners, I am deciding it's best
        //to keep things close to the action.
        Scanner input = new Scanner(System.in);
        char choice = 'N';

        //recommended method is to check
        //and see if Scanner has what you want(i.e. no malfunctions)
        //or to use try/catch.  I prefer this method.
        if(input.hasNext()) {
            choice = input.next().charAt(0);
        }else{
            System.out.println("Something went wrong.");
        }

        //The crux of the matter
        //Intellij says this would be better with in if/then,
        //but I disagree.
        //I only look for the yes answer.
        //Everything else goes to "too bad, choose for yourself"
        //because if you can't be bothered to press the right
        //buttons...
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