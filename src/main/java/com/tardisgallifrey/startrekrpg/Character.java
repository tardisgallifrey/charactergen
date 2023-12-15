package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.Era;
import com.tardisgallifrey.startrekrpg.enums.Race;

import java.util.Scanner;

/*This is the character class for the Star Trek Adventures
* solo role playing game.
*
* The character is instantiated at the beginning of the game
* and attributes and disciplines are defaulted in the constructor.
* */

public class Character {


    private Era era;
    private Race race;

    //Character Attributes
    private int control;
    private int daring;
    private int fitness;
    private int insight;
    private int presence;
    private int reason;

    public Character(int control,
                     int daring,
                     int fitness,
                     int insight,
                     int presence,
                     int reason){

        this.control = control;
        this.daring = daring;
        this.fitness = fitness;
        this.insight = insight;
        this.presence = presence;
        this.reason = reason;

        //TODO add discipline defaults

    }

    //Getters and Setters for Attributes
    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public int getDaring() {
        return daring;
    }

    public void setDaring(int daring) {
        this.daring = daring;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public int getInsight() {
        return insight;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public int getPresence() {
        return presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }


    public Era getEra() {
        return era;
    }

    public Race getRace() {
        return race;
    }

    //Not your typical setter, but
    //for our needs, this is better

    //These two values will not change
    //throughout the Life Path process
    public void setEra(boolean generate) {

        //If player chose Yes in Main function.
        if(generate) {
            System.out.println("We will choose the Star Trek era for you.");
        }

        //If player did not choose Yes in Main function.
        if(!generate){



            System.out.println("Choose the Star Trek Era from the following:");
            System.out.println("1. Star Trek Enterprise");
            System.out.println("2. Star Trek, The Original Series");
            System.out.println("3. Star Trek, The Next Generation");
            System.out.print("Enter number here --> ");

            int era = 0;
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt()){
                era = input.nextInt();
            }else{
                System.out.println("Something went wrong.");
            }

            System.out.println("You chose era " + era);
        }
        //TODO create display and request
    }



    public void setRace(boolean generate) {

        if(generate) {
            System.out.println("We will choose the Star Trek Race for you.");
        }

        if(!generate){
            System.out.println("Choose from the races below.");
        }
        //TODO create display and request

    }

}
