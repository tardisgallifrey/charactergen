package com.tardisgallifrey.startrekrpg.enums;

public enum CareerLength implements D20Enum {

    APPRENTICE("Novice"),
    JOURNEYMAN("Experience"),
    MASTER("Veteran");

    private final String label;

    CareerLength(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
