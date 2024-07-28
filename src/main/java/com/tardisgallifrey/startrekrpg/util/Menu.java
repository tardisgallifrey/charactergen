package com.tardisgallifrey.startrekrpg.util;

import java.util.Scanner;

public class Menu {

    public static int choose(int max_choice) {

        Scanner input = new Scanner(System.in);
        int menu_choice = 0;

        System.out.print("Enter a number from above --> ");
        while (input.hasNext()) {

            if (input.hasNextInt()) {
                menu_choice = input.nextInt();

                //I have an aversion to less than or equal to
                //would rather use less than and add 1 or something
                if (menu_choice > 0 && menu_choice < max_choice + 1) {
                    break;
                } else {
                    System.out.println("Wrong selection.");
                    System.out.print("Enter a number from above --> ");
                }
            }

        }

        return menu_choice;
    }


    public static char yes_no() {
        System.out.print("Enter Y or N --> ");

        Scanner input = new Scanner(System.in);
        char choice = ' ';

        //recommended method is to check
        //and see if Scanner has what you want(i.e. no malfunctions)
        //or to use try/catch.  I prefer this method.
        if (input.hasNext()) {
            choice = input.next().charAt(0);
        }
        return choice;
    }

    public static void D20Listing(Enum[] d20list) {
        int columns = 1;

        for (Enum item : d20list) {
            System.out.printf("%d - %-25.25s", columns, item);
            columns++;  //increment columns

            //If the column number is odd, add a
            //print return
            if (columns % 2 != 0) {
                System.out.println(); //blank println = '\n'
            }

        }
        System.out.println();
    }

    public static void disciplineMenu(String[] disciplines) {
        System.out.print("Choose discipline from the following:\n");
        System.out.printf("1. %s\n", disciplines[0]);
        System.out.printf("2. %s\n", disciplines[1]);
        System.out.printf("3. %s\n", disciplines[2]);
        if (disciplines.length > 3) {
            System.out.printf("4. %s\n", disciplines[3]);
        }
    }
}
