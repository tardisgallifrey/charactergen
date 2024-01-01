package com.tardisgallifrey.startrekrpg.enums;

public enum CareerLength {

    APPRENTICE("Novice"),
    JOURNEYMAN("Experience"),
    MASTER("Veteran");

    private final String label;

    CareerLength(String label) {
        this.label = label;
    }
}
