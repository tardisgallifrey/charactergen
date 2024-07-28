package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.*;
import com.tardisgallifrey.startrekrpg.util.Dice;
import com.tardisgallifrey.startrekrpg.util.Environment;
import com.tardisgallifrey.startrekrpg.util.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*This is the character class for the Star Trek Adventures
* solo role playing game.
*
* The character is instantiated at the beginning of the game
* and attributes and disciplines are defaulted in the constructor.
* */

public class Character {

    private Era era;
    private Species species;

    //Character Attributes
    int control;
    int daring;
    int fitness;
    int insight;
    int presence;
    int reason;

    //Character Disciplines
    int command;
    int conn;
    int engineering;
    int security;
    int science;
    int medicine;

    ArrayList<String> focusList = new ArrayList<>();


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

            HashMap<Integer, String> SpeciesList = getIntegerStringHashMap();

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

    //build hashmap for SpeciesList
    private HashMap<Integer, String> getIntegerStringHashMap() {
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
        return SpeciesList;
    }


    public void showCharacter(){
        //May look dumb, but using printf for each
        //line gives me more control, IMO
        System.out.println();
        System.out.println();
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
        System.out.println("Focus List: "+this.focusList.toString());


    }

    public void species_bonus(){

        Attr[] bonus_attributes = Species.Attributes(this.species);
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

    public void environment_bonus(){
        Environment enviro = new Environment();
        enviro.setSettings_Conditions();
        Conditions condition = enviro.getCondition();
        Settings setting = enviro.getSetting();

        //There are places where DRY fails.  This is one.
        //I can't get a method to alter the passed in
        //parameter.  Where is C when you need it.
        if( condition != null){

            //Set condition bonuses if it is set
            switch(condition){
                case COSMOPOLITAN -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.daring++;
                        case 2, 5 -> this.insight++;
                        case 3, 6 -> this.presence++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.command++;
                        case 2, 5 -> this.conn++;
                        case 3, 6 -> this.science++;
                    }
                }
                case OCCUPATION_WAR -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.daring++;
                        case 2, 5 -> this.presence++;
                        case 3, 6 -> this.fitness++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.command++;
                        case 2, 5 -> this.security++;
                        case 3, 6 -> this.medicine++;
                    }
                }
                case UTOPIAN_PARADISE -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.control++;
                        case 2, 5 -> this.reason++;
                        case 3, 6 -> this.presence++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1 -> this.command++;
                        case 2 -> this.conn++;
                        case 3 -> this.security++;
                        case 4 -> this.science++;
                        case 5 -> this.medicine++;
                        case 6 -> this.engineering++;
                    }
                }
                case STRUGGLE_HARDSHIP -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.control++;
                        case 2, 5 -> this.daring++;
                        case 3, 6 -> this.insight++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.conn++;
                        case 2, 5 -> this.engineering++;
                        case 3, 6 -> this.science++;
                    }
                }
                case RIGOROUS_DISCIPLINE -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.control++;
                        case 2, 5 -> this.fitness++;
                        case 3, 6 -> this.reason++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.command++;
                        case 2, 5 -> this.security++;
                        case 3, 6 -> this.medicine++;
                    }
                }
                case ASCETICISM_INTROSPECTION -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.control++;
                        case 2, 5 -> this.insight++;
                        case 3, 6 -> this.reason++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.science++;
                        case 2, 5 -> this.engineering++;
                        case 3, 6 -> this.medicine++;
                    }
                }
            }
        }

        //Set setting bonuses, if set
        if(setting != null){
            switch(setting){
                case HOMEWORLD -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1 -> this.control++;
                        case 2 -> this.daring++;
                        case 3 -> this.insight++;
                        case 4 -> this.presence++;
                        case 5 -> this.fitness++;
                        case 6 -> this.reason++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.command++;
                        case 2, 5 -> this.security++;
                        case 3, 6 -> this.science++;
                    }
                }
                case BUSY_COLONY -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1, 4 -> this.daring++;
                        case 2, 5 -> this.presence++;
                        case 3, 6 -> this.science++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.command++;
                        case 2, 5 -> this.security++;
                        case 3, 6 -> this.science++;
                    }
                }
                case ANOTHER_SPECIES -> {
                    //attributes
                    switch(Dice.D6()){
                        case 1 -> this.control++;
                        case 2 -> this.daring++;
                        case 3 -> this.fitness++;
                        case 4 -> this.presence++;
                        case 5 -> this.insight++;
                        case 6 -> this.reason++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1 -> this.command++;
                        case 2 -> this.conn++;
                        case 3 -> this.security++;
                        case 4 -> this.engineering++;
                        case 5 -> this.science++;
                        case 6 -> this.medicine++;
                    }
                }
                case FRONTIER_COLONY -> {
                    //attributes
                    int roll = Dice.D6();
                    if(roll < 4){
                        this.control++;
                    }else{
                        this.fitness++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.conn++;
                        case 2, 5 -> this.security++;
                        case 3, 6 -> this.medicine++;
                    }
                }
                case ISOLATED_COLONY -> {
                    //attributes
                    int roll = Dice.D6();
                    if(roll < 4){
                        this.reason++;
                    }else{
                        this.insight++;
                    }
                    //Disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.engineering++;
                        case 2, 5 -> this.science++;
                        case 3, 6 -> this.medicine++;
                    }
                }
                case STARSHIP_STARBASE -> {
                    //attributes
                    int roll = Dice.D6();
                    if(roll < 4){
                        this.control++;
                    }else{
                        this.insight++;
                    }
                    //disciplines
                    switch(Dice.D6()){
                        case 1, 4 -> this.command++;
                        case 2, 5 -> this.conn++;
                        case 3, 6 -> this.engineering++;
                    }
                }
            }
        }
    }

    private char acceptRebel(){
        System.out.println("Do you accept(Y) or rebel(N) this upbringing?");
        return Menu.yes_no();
    }

    public void upbringing(){
        //int roll = Dice.D20();
        int roll = 3;
        int choice = 1;
        int selection = 0;
        HashMap<Integer, String> listFocus = new HashMap<>();

        if(this.species == Species.KLINGON){
            if(roll < 4){
                System.out.println("You belong to the Warrior Caste");

                if(this.acceptRebel() == 'Y'){
                    this.daring += 2;
                    this.fitness++;
                }else{
                    this.reason += 2;
                    this.insight++;
                }

                Menu.disciplineMenu(new String[]{"Command", "Conn", "Security"});
                switch(Menu.choose(3)){
                    case 1:
                        this.command++;
                        System.out.println();
                        System.out.println("Choose a focus from these: ");

                        for(FocusCommand focus : FocusCommand.values()){
                            if(focus.getType() == 1){
                                listFocus.put(choice, focus.getLabel());
                                System.out.println(choice+". "+focus.getLabel());
                                choice++;
                            }
                        }

                        selection = Menu.choose(choice);

                        for(FocusCommand focus : FocusCommand.values()){
                            if(focus.getLabel().equals(listFocus.get(selection))){
                                System.out.println("You chose "+focus.getLabel());
                                this.focusList.add(focus.getLabel());
                            }
                        }
                        break;
                    case 2:
                        this.conn++;
                        System.out.println();
                        System.out.println("Choose a focus from these: ");

                        for(FocusConn focus : FocusConn.values()){
                            if(focus.getType() == 1){
                                listFocus.put(choice, focus.getLabel());
                                System.out.println(choice+". "+focus.getLabel());
                                choice++;
                            }
                        }

                        selection = Menu.choose(choice);

                        for(FocusConn focus : FocusConn.values()){
                            if(focus.getLabel().equals(listFocus.get(selection))){
                                System.out.println("You chose "+focus.getLabel());
                                this.focusList.add(focus.getLabel());
                            }
                        }
                        break;
                    case 3:
                        this.security++;

                }
                //TODO: use this for the rest of the focus menus


            } else if (roll < 8) {
                System.out.println("Merchant Caste");

                if(this.acceptRebel() == 'Y'){
                    this.fitness += 2;
                    this.daring ++;
                }else{
                    this.insight += 2;
                    this.reason ++;
                }

                Menu.disciplineMenu(new String[]{"Command", "Engineering", "Science"});
                switch(Menu.choose(3)){
                    case 1:
                        this.command++;
                        break;
                    case 2:
                        this.engineering++;
                        break;
                    case 3:
                        this.science++;

                }
                //TODO: add merchant type focus

            } else if (roll < 13) {
                System.out.println("Agriculture Caste");

                if(this.acceptRebel() == 'Y'){
                    this.fitness += 2;
                    this.control++;
                }else{
                    this.reason += 2;
                    this.presence++;
                }

                Menu.disciplineMenu(new String[]{"Conn", "Security", "Medicine"});
                switch(Menu.choose(3)){
                    case 1:
                        this.conn++;
                        break;
                    case 2:
                        this.security++;
                        break;
                    case 3:
                        this.medicine++;

                }
                //TODO: add science or ops type focus
            } else if (roll < 15) {
                System.out.println("Scientific Caste");

                if(this.acceptRebel() == 'Y'){
                    this.control += 2;
                    this.reason++;
                }else{
                    this.insight += 2;
                    this.daring++;
                }

                Menu.disciplineMenu(new String[]{"Engineering", "Science", "Medicine"});
                switch(Menu.choose(3)){
                    case 1:
                        this.engineering++;
                        break;
                    case 2:
                        this.science++;
                        break;
                    case 3:
                        this.medicine++;

                }
                //TODO: focus from types related to engineering or science
            } else if (roll < 18) {
                System.out.println("Artistic Caste");

                if(this.acceptRebel() == 'Y'){
                    this.presence += 2;
                    this.insight++;
                }else{
                    this.fitness += 2;
                    this.daring++;
                }

                Menu.disciplineMenu(new String[]{"Command", "Engineering", "Science"});
                switch(Menu.choose(3)){
                    case 1:
                        this.command++;
                        break;
                    case 2:
                        this.engineering++;
                        break;
                    case 3:
                        this.science++;

                }
                //TODO: focus from softer skills, sciences
            } else {
                System.out.println("Academic Caste");

                if(this.acceptRebel() == 'Y'){
                    this.reason += 2;
                    this.control++;
                }else{
                    this.insight += 2;
                    this.fitness++;
                }

                Menu.disciplineMenu(new String[]{"Command", "Security", "Science"});
                switch(Menu.choose(3)){
                    case 1:
                        this.command++;
                        break;
                    case 2:
                        this.security++;
                        break;
                    case 3:
                        this.science++;

                }
                //TODO: focus from sciences, government, political
            }

        }else{
            roll = Dice.D6();

            System.out.println("Your upbringing will go by upbringing");

            switch(roll){
                case 1:
                    System.out.println("Starfleet");

                    if(this.acceptRebel() == 'Y'){
                        this.control += 2;
                        this.fitness++;
                    }else{
                        this.daring += 2;
                        this.insight++;
                    }

                    Menu.disciplineMenu(new String[]{"Command", "Conn", "Engineering", "Security", "Science", "Medicine"});
                    switch(Menu.choose(6)){
                        case 1:
                            this.command++;
                            break;
                        case 2:
                            this.conn++;
                            break;
                        case 3:
                            this.engineering++;
                            break;
                        case 4:
                            this.security++;
                            break;
                        case 5:
                            this.science++;
                            break;
                        case 6:
                            this.medicine++;

                    //TODO: Focuses
                            //TODO: Astronav, Composure, EVA, Hand to hand,
                            //TODO: Hand phasers, history, Small craft,
                            //TODO: starfleet protocol, starship recognition
                    }
                case 2:
                    System.out.println("Business or Trade");

                    if(this.acceptRebel() == 'Y'){
                        this.presence += 2;
                        this.daring++;
                    }else{
                        this.insight += 2;
                        this.reason++;
                    }

                    Menu.disciplineMenu(new String[]{"Command", "Engineering", "Science"});
                    switch(Menu.choose(3)){
                        case 1:
                            this.command++;
                            break;
                        case 2:
                            this.engineering++;
                            break;
                        case 3:
                            this.science++;

                    }
                    //TODO: add focus from finance, geology, linguistics,
                    //TODO: manufacturing, metallurgy, negotiation, survey
                    break;
                case 3:

                    System.out.println("Agricultural or rural");

                    if(this.acceptRebel() == 'Y'){
                        this.fitness += 2;
                        this.control++;
                    }else{
                        this.reason += 2;
                        this.presence++;
                    }

                    Menu.disciplineMenu(new String[]{"Conn", "Security", "Medicine"});
                    switch(Menu.choose(3)){
                        case 1:
                            this.conn++;
                            break;
                        case 2:
                            this.security++;
                            break;
                        case 3:
                            this.medicine++;

                    }
                    break;
                //TODO: focus from  animal handling, athletics, emergency medicine
                //TODO: endurance, ground vehicles, infectious diseases, navigation
                //TODO: survival training, toxicology
                case 4:

                    System.out.println("Science or Technology");

                    if(this.acceptRebel() == 'Y'){
                        this.control += 2;
                        this.reason++;
                    }else{
                        this.insight += 2;
                        this.daring++;
                    }

                    Menu.disciplineMenu(new String[]{"Conn", "Engineering", "Science", "Medicine"});
                    switch(Menu.choose(4)){
                        case 1:
                            this.conn++;
                            break;
                        case 2:
                            this.engineering++;
                            break;
                        case 3:
                            this.science++;
                            break;
                        case 4:
                            this.medicine++;

                    }
                    break;
                    //TODO: focuses from astronavigation, astrophysics, computers,
                //TODO: cybernetics, genetics, physics, power systems, quantum mechanics
                //TODO: subspace comms, surgery, warp field dynamics, xenobiology
                case 5:

                    System.out.println("Artistic and Creative");

                    if(this.acceptRebel() == 'Y'){
                        this.presence += 2;
                        this.insight++;
                    }else{
                        this.daring++;
                        this.fitness++;
                    }

                    Menu.disciplineMenu(new String[]{"Command", "Engineering", "Science"});
                    switch(Menu.choose(3)){
                        case 1:
                            this.command++;
                            break;
                        case 2:
                            this.engineering++;
                            break;
                        case 3:
                            this.science++;

                    }
                    break;
                //TODO: focus from botany, cultural studies, holoprogramming
                //TODO: linguistics, music, observation, persuasion, psychology
                case 6:

                    System.out.println("Diplomacy and Politics");

                    if(this.acceptRebel() == 'Y'){
                        this.presence += 2;
                        this.control++;
                    }else{
                        this.reason += 2;
                        this.fitness++;
                    }

                    Menu.disciplineMenu(new String[]{"Command", "Conn", "Security"});
                    switch(Menu.choose(3)){
                        case 1:
                            this.command++;
                            break;
                        case 2:
                            this.conn++;
                            break;
                        case 3:
                            this.security++;

                    }
                    break;
                //TODO: composure, debate, diplomacy, espionage,
                //TODO: interrogation, law, philosophy, starfleet protocol

            }

        }
    }

    public void education(){
        int roll = Dice.D20();
        int track_roll = Dice.D20();

        if(roll < 6){
            System.out.println("Congrats, you are going to Starfleet Academy.");

            if(track_roll < 7){
                System.out.println("You chose Command Track");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: command or conn +2
                //TODO: two other disciplines get +1 each
                //TODO: cannot take any individual attribute over +4
                //TODO: focus, add three from
                //TODO: astronavigation, composure, diplomacy,
                //TODO: evasive action, EVAs, Helm Ops, Inspiration,
                //TODO: small craft, starfleet protocols,
                //TODO: starship recognition, team dynamics

            }else if(track_roll < 14){
                System.out.println("You chose Operations Track.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: security or engineering +2
                //TODO: two other disciplines get +1 each
                //TODO: cannot take any individual attribute over +4
                //TODO: focus, add three from
                //TODO: computers, cybernetics, electroplasma power,
                //TODO: espionage, hand phasers, h-to-h combat
                //TODO: infiltration, interrogation, survival,
                //TODO: shipboard tactical systems, transporter/replicator
                //TODO: warp field dynamics

            }else{
                System.out.println("You chose Science Track.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: science or medicine +2
                //TODO: two other disciplines get +1 each
                //TODO: cannot take any individual attribute over +4
                //TODO: focus, add three from
                //TODO: anthropology, astrophysics, botany,
                //TODO: computers, cybernetics, genetics, geology
                //TODO: infectious diseases, linguistics, physics
                //TODO: psychiatry, quantum mechanics, trauma surgery
                //TODO: virology, warp field dynamics, xenobiology

            }
        }else if(roll < 11){
            System.out.println("You received Allied military training.");

            if(track_roll < 6){
                System.out.println("You are a member of the military rank and file.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: must +1 fitness from the three
                //TODO: security +2
                //TODO: two other disciplines get +1 each
                //TODO: cannot take any individual attribute over +4
                //TODO: focus, add three from
                //TODO: composure, demolitions, disruptors, EVAs
                //TODO: h-to-h combat, hand phasers, infiltration
                //TODO: military protocol, small craft, survival

            }else if(track_roll < 11){
                System.out.println("You have received officer training.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: command and security, +2 for 1, +1 for the other
                //TODO: +1 to conn or engineering or science or medicine
                //TODO: focus, add three from
                //TODO: diplomacy, disruptors, h-to-h combat, history
                //TODO: inspiration, military protocol, politics
                //TODO: shipboard tactical systems, strategy & tactics

            }else if(track_roll < 16){
                System.out.println("You have received Intelligence training.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: must pick insight or reason for one attribute
                //TODO: increase one discipline by 2 and another by 1
                //TODO: one increase must be to security
                //TODO: focus, add three from
                //TODO: computers, espionage, infiltration, interrogation
                //TODO: linguistics, persuasion, threat analysis

            }else{
                System.out.println("You are a member of a militia or a guerrilla force.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: daring or fitness must be increased
                //TODO: security +2, two others by 1
                //TODO: focus, add three from
                //TODO: composure, demolition, disguise, disruptors
                //TODO: h-to-h combat, hand phasers, infiltration
                //TODO: inspiration, interrogation, psychological warfare

            }
            }else if(roll < 16){
                System.out.println("You become a diplomat.");

                if(track_roll < 11){
                    System.out.println("You are part of your diplomatic corps.");
                    //TODO: add a value
                    //TODO: add +3 to attributes, choose randomly or select?
                    //TODO: reason or insight must increase
                    //TODO: command +2, to others +1
                    //TODO: focus, add three from
                    //TODO: diplomacy, espionage, history, linguistics
                    //TODO: philosophy, politics, xenoanthropology

            }else{
                System.out.println("Your diplomatic status is honorary.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: command +2, two others +1
                //TODO: focus, add three from
                //TODO: diplomacy, espionage, history, leadership
                //TODO: philosophy, politics, strategy and tactics
                //TODO: xenoanthropology
            }
        }else{
            System.out.println("You are a civilian with a civilian education.");
            if(track_roll < 5){
                System.out.println("You are involved with freight and transport.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: conn or engineering +2, two others +1
                //TODO: decrease one discipline by 1 to add to another
                //TODO: focus, add three from
                //TODO: astronavigation, bureaucracy, emergency repairs
                //TODO: EVAs, helm ops, logistics, propulsion systems
                //TODO: small craft, spacecraft recognition,
                //TODO: transporters/replicators

            }else if(track_roll < 8){
                System.out.println("You are part of Law Enforcement.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: command or security +2, two others +1
                //TODO: may decrease one by 1 to add to another
                //TODO: focus, add three from
                //TODO: h-to-h combat, interrogation, intimidation
                //TODO: law, phasers, small craft

            }else if(track_roll < 11){
                System.out.println("You are a physician.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: medicine +2, two others +1
                //TODO: decrease one by 1 to add to another, if wished
                //TODO: focus, add three from
                //TODO: cybernetics, emergency medicine, genetics
                //TODO: psychiatry, surgery, virology, xenobiology


            }else if(track_roll < 15){
                System.out.println("You are involved in government as politician or bureaucrat.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: must increase insight or presence
                //TODO: command +2, two others +1
                //TODO: may decrease one by 1 to add to another
                //TODO: focus, add three from
                //TODO: bureaucracy, diplomacy, history, linguistics
                //TODO: philosophy, politics,
                //TODO: or something related to your role in public service.


            } else if (track_roll < 17) {
                System.out.println("You are a scientific or technical expert.");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: reason must be increased
                //TODO: science or engineering +2, two others +1
                //TODO: may decrease one by 1 to add to another
                //TODO: focus, add three from
                //TODO: astrophysics, botany, cybernetics, exotectonics
                //TODO: genetics, quantum mechanics, subspace mechanics
                //TODO: temporal mechanics, transporters/replicators
                //TODO: warp field dynamics

            } else {
                System.out.println("You are a trader or merchant");
                //TODO: add a value
                //TODO: add +3 to attributes, choose randomly or select?
                //TODO: must increase insight or presence
                //TODO: command +2, two others +1
                //TODO: may decrease one by 1 to add to another
                //TODO: focus, add three from
                //TODO: art, cooking, disruptors, economics,
                //TODO: logistics, persuasion, psychology, tailoring

            }
        }
    }

    public void career_length(){
        int roll = Dice.D20();
        if(roll < 7){
            System.out.println("You are a novice in your career.");
            //TODO: add a value
        } else if (roll < 14) {
            System.out.println("You are experienced in your career.");
            //TODO: add a value

        }else{
            System.out.println("You are a veteran or a master in your career.");
            //TODO: add a value
        }
        //TODO: choose a value from a selection
    }

    public void career_events(){
        int roll1;
        int roll2;
        String event1 = "";
        String event2 = "";

        while( (roll1 = Dice.D20()) != (roll2 = Dice.D20())) {
            event1 = event_selection(roll1);
            event2 = event_selection(roll2);
        }
        System.out.println(event1);
        System.out.println(event2);


    }

    //TODO: start here next time
    private String event_selection(int roll){
        return switch (roll) {
            case 1 -> "Ship Destroyed";
            case 2 -> "Death of a Friend";
            case 3 -> "Lauded by another culture";
            case 4 -> "Negotiated a Treaty";
            case 5 -> "Required to take Command";
            case 6 -> "Encounter with a truly alien being";
            case 7 -> "Serious Injury";
            case 8 -> "Conflict with a hostile culture";
            case 9 -> "Mentored";
            case 10 -> "Transporter accident";
            case 11 -> "Dealing with a Plague";
            case 12 -> "Betrayed ideals for a superior";
            case 13 -> "Called out a superior";
            case 14 -> "Developed a new battle strategy";
            case 15 -> "Learned a unique language";
            case 16 -> "Discovered an artifact";
            case 17 -> "Received a special commendation";
            case 18 -> "Solved an engineering crisis";
            case 19 -> "Found a breakthrough or an invention";
            case 20 -> "First Contact";
            default -> "All things mostly peaceful";
        };

        //TODO: each character gets two events
        //TODO: give attributes and discipline below
        //TODO: ship destroyed = daring +1, security +1
        //TODO: focus: EVAs, small craft, survival types
        //TODO: death of a friend = insight +1, medicine +1
        //TODO: lauded by other culture = presence +1, science +1
        //TODO: focus: focus important to culture X, what is X?
        //TODO: negotiate treaty = control +1, command +1
        //TODO: focus: diplomacy, politics, negotiation types
        //TODO: take command = daring +1, command +1
        //TODO: focus: composure, inspiration, lead by example
        //TODO: alien encounter = reason +1, science +1
        //TODO: focus: empathy, philosophy, xenobiology
        //TODO: serious injury = fitness +1, medicine +1
        //TODO: focus: art, athletics, philosophy
        //TODO: hostile conflict culture = fitness +1, security +1
        //TODO: focus: hand phasers, h-to-h combat, shipboard tac systems
        //TODO: mentored = attribute +1, conn +1
        //TODO: focus: composure, etiquette,
        //TODO: transporter accident = control +1, conn +1
        //TODO: focus: quantum mech, small craft, trans/replicators
        //TODO: plague = insight +1, medicine +1
        //TODO: focus: EM med, infectious dis, triage
        //TODO: betrayed own ideals for superior = presence +1, command +1
        //TODO: focus: investigation, inspiration, persuasion
        //TODO: called out a superior = reason +1, conn +1
        //TODO: focus: history, starfleet protocol, UCMJ
        //TODO: new battle strategy = daring +1, security +1
        //TODO: focus: combat tactics, hazard awareness, lead by example
        //TODO: learned unique language = insight +1, science +1
        //TODO: focus: linguistics related, culture related.
        //TODO: discovered artifact = reason +1, engineering +1
        //TODO: focus: ancient tech, computers, reverse engineering
        //TODO: special commendation = fitness +1, discipline +1
        //TODO: focus: athletics, EM med, survival
        //TODO: solved engineering crisis = control +1, engineering +1
        //TODO: focus: EPS systems, fusion reactors, warp engines
        //TODO: breakthrough/invention = attribute +1, engineering +1
        //TODO: focus: experimental tech, improvisation, invention
        //TODO: first contact = presence +1, discipline +1
        //TODO: focus: xenobiology, cultural studies, diplomacy

    }

    public void final_touches(){
        //TODO: add one more value
        //TODO: increase two attributes by 1 each (allow player choice)
        //TODO: increase 2 disciplines by 1 each (allow player choice)
        //TODO: check that disciplines are less than five.
        //TODO: check that only one discipline is five (allow player choice of which to keep at five)
        //TODO: for all disciplines reduced add to another that is less than five until it is less than 5
        //TODO: check all attributes summed is 56
        //TODO: check all disciplines summed is 16
        //TODO: player should have four values and six focuses, correct if not.
        System.out.println("Doing final touches....");
    }

    public void assignment(){
        //TODO: give player assignment from following list according to player settings
        //Commanding officer (must be experienced, command track, or allied officer)
        //Exec officer (must match above, but can be novice)
        //Operations manager (must be experienced, operations or engineering)
        //Flight controller or helmsman
        //Chief Engineer (must be veteran, operations, or engineering)
        //Chief of Security (must be experienced, operations)
        //Chief Medical Officer (must be veteran, physician, sciences)
        //Science Officer (must be sciences)
        //Ship's Counselor (must be experienced, sciences)
        //Comm officer
        //TODO: assign rank Captain, Commander, Lt Comm, Lt, LtJG, Ensign--set conditions
        System.out.println("You will now receive your character's rank and assignment.");
    }
}
