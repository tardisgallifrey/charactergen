package com.tardisgallifrey.startrekrpg.enums;

public enum AlliedMilitary {

    ENLISTED("Rank and File"),
    OFFICER("Officer Training"),
    INTELLIGENCE("Intelligence Training"),
    MILITIA_GUERRILLA("Militias and Guerrillas");

    private final String label;

    AlliedMilitary(String label) {
        this.label = label;
    }
}
