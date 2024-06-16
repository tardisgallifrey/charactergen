package com.tardisgallifrey.startrekrpg.enums;

public enum Era implements D20Enum{

    ENTERPRISE("Enterprise Era"),
    TOS("The Original Series"),
    TNG("The Next Generation"),
    ENT_TOS("Enterprise & TOS"),
    TOS_TNG("TOS & TNG"),
    ENT_TNG("Enterprise & TNG"),
    ALL("Species fits all Eras");

    public String getLabel() {
        return label;
    }

    public final String label;

    private Era(String label){
        this.label = label;

    }

}
