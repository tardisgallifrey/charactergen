package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.Attr;
import com.tardisgallifrey.startrekrpg.enums.Era;
import com.tardisgallifrey.startrekrpg.enums.Species;
import com.tardisgallifrey.startrekrpg.util.Dice;
import com.tardisgallifrey.startrekrpg.util.Menu;

import java.util.HashMap;

/*This is the character class for the Star Trek Adventures
* solo role playing game.
*
* The character is instantiated at the beginning of the game
* and attributes and disciplines are defaulted in the constructor.
* */

public class Character {

    private Era era;
    private Species species;

    //Character Attr
    private int control;
    private int daring;
    private int fitness;
    private int insight;
    private int presence;
    private int reason;

    //Character Disciplines
    private int command;
    private int conn;
    private int engineering;
    private int security;
    private int science;
    private int medicine;


    public Character(int control,
                     int daring,
                     int fitness,
                     int insight,
                     int presence,
                     int reason,
                     int command,
                     int conn,
                     int engineering,
                     int security,
                     int science,
                     int medicine){

        this.control = control;
        this.daring = daring;
        this.fitness = fitness;
        this.insight = insight;
        this.presence = presence;
        this.reason = reason;

        this.command = command;
        this.conn = conn;
        this.engineering = engineering;
        this.security = security;
        this.science = science;
        this.medicine = medicine;

    }

    //Getters and Setters for Attr
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


    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public int getConn() {
        return conn;
    }

    public void setConn(int conn) {
        this.conn = conn;
    }

    public int getEngineering() {
        return engineering;
    }

    public void setEngineering(int engineering) {
        this.engineering = engineering;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }


    public Era getEra() {
        return era;
    }

    public Species getSpecies() {
        return species;
    }

    //Not your typical setter, but
    //for our needs, this is better

    //These two values will not change
    //throughout the Life Path process
    public void setEra(boolean generate) {

        //If player chose Yes in Main function.
        if(generate) {
            //In the spirit of DRY (Don't Repeat Yourself)
            //We will roll a D6 (twice three) to determine
            //Star Trek Era
            int choice = Dice.D6();

            switch(choice){
                case 1, 4 -> this.era = Era.ENTERPRISE;
                case 2, 5 -> this.era = Era.TOS;
                case 3, 6 -> this.era = Era.TNG;
            }

            System.out.println("You will be a character in Star Trek: " + this.era.getLabel());
        }

        //If player did not choose Yes in Main function.
        if(!generate){

            System.out.println("Choose the Star Trek Era from the following:");
            System.out.println("1. Star Trek Enterprise");
            System.out.println("2. Star Trek, The Original Series");
            System.out.println("3. Star Trek, The Next Generation");

            int menu_choice = Menu.choose(3);


            switch(menu_choice){
                case 1 ->
                    this.era = Era.ENTERPRISE;
                case 2 ->
                    this.era = Era.TOS;
                case 3 ->
                    this.era = Era.TNG;
                default ->
                    System.out.println("you didn't choose wisely.");
            }



            System.out.println("You have chosen Star Trek: " + this.era.getLabel());
        }

    }



    public void setSpecies(boolean generate) {

        //Player chose random generation of era and species
        if(generate) {

            HashMap<Integer, String> SpeciesList = new HashMap<>();
            int race_index = 0;

            //loop through races matching the era chosen
            //earlier and others that apply.
            for(Species species : Species.values()){
                //TODO get races chosen to match other era possibilities. i.e. TOS and TNG
                if(species.getEra().equals(this.era) ||
                        species.getEra().equals(Era.ALL))
                {
                    //TODO get species list to stop at 20 for dice roll
                    SpeciesList.put(race_index, species.getLabel());

                    race_index++;

                }
            }

            int result = Dice.D20();

            for( Integer index : SpeciesList.keySet()){
                if(result == index) {
                    String aRace = SpeciesList.get(index);
                    this.species = Species.valueOfLabel(aRace);
                }
            }

            //have to do this or Intellij complains
            assert this.species != null;
            System.out.println("You will be from the " + this.species.getLabel() + " species.");

        }

        //Player wants to choose era and species
        if(!generate){
            //This algorithm has taken forever, but it works.
            //It displays a list of allowable races based on
            //the Star Trek Era already chosen (which now
            //includes races across the eras, such as Klingons).
            //
            //It makes a 2 column display, with numbers so
            //that the player can choose the species.

            //Set column number 1
            int columns = 1;
            HashMap<Integer, String> SpeciesList = new HashMap<>();
            System.out.println();  //blank line
            System.out.println("Choose from the races below.");

            //loop through races matching the era chosen
            //earlier and others that apply.
            for(Species species : Species.values()){

                //TODO see note above in generate about species lists
                if(species.getEra().equals(this.era) ||
                    species.getEra().equals(Era.ALL))
                {
                    //add the columns number, which is
                    //how we get the number beside the
                    //Species label and, add the label name
                    //to a Hashmap so that we have an
                    //indexed set of key/value pairs
                    //to set the species below
                    SpeciesList.put(columns, species.getLabel());

                    //printf formats strings
                    //This makes sure that the label
                    //is printed in a 25 character field,
                    //always 25 characters wide, left justified.
                    System.out.printf("%d - %-25.25s", columns, species.getLabel());
                    columns++;  //increment columns

                    //If the column number is odd, add a
                    //print return
                    if(columns % 2 != 0){
                        System.out.println(); //blank println = '\n'
                    }
                }
            }

            //DRY make a static class
            int result = Menu.choose(columns);

            for( Integer index : SpeciesList.keySet()){
                if(result == index) {
                    String aRace = SpeciesList.get(index);
                    this.species = Species.valueOfLabel(aRace);
                }
            }

            //have to do this or Intellij complains
            assert this.species != null;
            System.out.println("You have chosen to be from the " + this.species.getLabel() + " species.");

        }


    }

    public void showCharacter(){
        //May look dumb, but using printf for each
        //line gives me more control, IMO
        System.out.println("Character stats.");
        System.out.printf("Your Star Trek Era: %s%n", this.era.getLabel());
        System.out.printf("Your species is: %s%n", this.species.getLabel());
        System.out.println();
        System.out.printf("%S%n", "attributes:");
        System.out.printf("%s  %s  %s%n", "Control", "Daring", "Fitness");
        System.out.printf("%4d  %6d  %7d %n", this.getControl(), this.getDaring(), this.getFitness());
        System.out.printf("%s  %s  %s%n", "Insight", "Presence", "Reason");
        System.out.printf("%4d  %6d  %7d%n", this.getInsight(), this.getPresence(), this.getReason());
        System.out.println();
        System.out.printf("%S%n", "Disciplines:");
        System.out.printf("%s      %s    %s%n", "Command", "Conn", "Security");
        System.out.printf("%6d  %8d  %7d%n", this.getCommand(), this.getConn(), this.getSecurity());
        System.out.printf("%s  %s  %s%n", "Engineering", "Science", "Medicine");
        System.out.printf("%6d  %8d  %7d%n", this.getEngineering(), this.getScience(), this.getMedicine());


    }

    public void species_bonus(Species character_species){

        assert character_species != null;
        Attr[] bonus_attributes = Species.Attributes(character_species);
        for(int i = 0; i < 3; i++) {
            switch (bonus_attributes[i]) {
                case DARING -> this.daring++;
                case REASON -> this.reason++;
                case CONTROL -> this.control++;
                case FITNESS -> this.fitness++;
                case INSIGHT -> this.insight++;
                case PRESENCE -> this.presence++;
            }
        }
    }






}
