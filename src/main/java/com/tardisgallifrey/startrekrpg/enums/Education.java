package com.tardisgallifrey.startrekrpg.enums;

public enum Education {

    STARFLEET_ACADEMY("Starfleet Academy"),
    ALLIED_MILITARY("Allied Military Training"),
    DIPLOMATIC_TRAINING("Diplomatic Training"),
    CIVILIAN_TRAINING("Civiliam Training");

    private final String label;

    Education(String label) {
        this.label = label;
    }
}
