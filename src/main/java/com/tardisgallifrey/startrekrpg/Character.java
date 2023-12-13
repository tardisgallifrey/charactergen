package com.tardisgallifrey.startrekrpg;

import com.tardisgallifrey.startrekrpg.enums.Era;

public class Character {

    private String era;
    private String race;

    //Character Attributes
    private int control;
    private int daring;
    private int fitness;
    private int insight;
    private int presence;
    private int reason;

    public Character(Era era, String race){

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
}
