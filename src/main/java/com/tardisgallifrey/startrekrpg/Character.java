package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.Era;
import com.tardisgallifrey.startrekrpg.enums.Race;

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

    public void setEra(boolean generate) {

    }

    public Race getRace() {
        return race;
    }

    public void setRace(boolean generate) {

    }

}
