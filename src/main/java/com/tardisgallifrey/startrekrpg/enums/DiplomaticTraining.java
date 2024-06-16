package com.tardisgallifrey.startrekrpg.enums;

public enum DiplomaticTraining implements D20Enum {
    DIPLOMATIC_CORPS("Diplomatic Corps"),
    HONORARY_STATUS("Honorary Status");

    private final String label;

    DiplomaticTraining(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
