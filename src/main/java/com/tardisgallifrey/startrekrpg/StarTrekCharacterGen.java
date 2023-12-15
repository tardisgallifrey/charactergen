package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.Era;
import com.tardisgallifrey.startrekrpg.enums.Race;

import java.util.HashMap;
import java.util.Scanner;

public class StarTrekCharacterGen {
    public static void main(String[] args) {

        int era;
        char choice;
        Character player = new Character(7,7,7,7,7,7);

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Star Trek Captain's Log Character Generator.");
        System.out.println("We will now begin your LifePath.");
        System.out.println("Do you wish to allow the generator to");
        System.out.println("randomly pick Star Trek Era and Race?");
        System.out.print("Enter Y or N --> ");

        try{

            //Scanner reads lines
            //This is how to get a char by itself.
            choice = input.next().charAt(0);

            if(choice=='y' || choice=='Y'){
                System.out.println("We will choose the race and era for you.");
                input.nextLine();
                System.out.println();
                player.setEra(true);
                player.setRace(true);
                input.close();

            }else{
                System.out.println("Choose the Star Trek Era from the following:");
                System.out.println("1. Star Trek Enterprise");
                System.out.println("2. Star Trek, The Original Series");
                System.out.println("3. Star Trek, The Next Generation");
                System.out.print("Enter number here --> ");

                try {
                    era = input.nextInt();
                    System.out.println("You chose Era: " + era);
                    player.setEra(false);
                    player.setRace(false);
                    //at every exit path,
                    //I have to close the Scanner
                    //try/catches have two exit paths each
                    input.close();


                }catch(Exception e){
                    System.out.println("Exception: " + e.toString());
                    input.close();
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception: " + e.toString());
            input.close();
        }

    //        End of main function
    }


}