package com.tardisgallifrey.startrekrpg.enums;

public enum Era {

    ENTERPRISE("Enterprise Era"),
    TOS("The Original Series"),
    TNG("The Next Generation"),
    ENT_TOS("Enterprise & TOS"),
    TOS_TNG("TOS & TNG"),
    ENT_TNG("Enterprise & TNG"),
    ALL("Race fits all Eras");

    public final String label;

    private Era(String label){
        this.label = label;

    }

}
