package com.tardisgallifrey.startrekrpg.enums;

public enum AlliedMilitary implements D20Enum {

    ENLISTED("Rank and File"),
    OFFICER("Officer Training"),
    INTELLIGENCE("Intelligence Training"),
    MILITIA_GUERRILLA("Militias and Guerrillas");

    private final String label;

    AlliedMilitary(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
