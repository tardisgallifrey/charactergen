package com.tardisgallifrey.startrekrpg.enums;

public enum Education implements D20Enum {

    STARFLEET_ACADEMY("Starfleet Academy"),
    ALLIED_MILITARY("Allied Military Training"),
    DIPLOMATIC_TRAINING("Diplomatic Training"),
    CIVILIAN_TRAINING("Civilian Training");

    private final String label;

    Education(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
