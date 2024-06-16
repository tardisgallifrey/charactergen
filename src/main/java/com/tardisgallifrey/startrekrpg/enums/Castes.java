package com.tardisgallifrey.startrekrpg.enums;

public enum Castes implements D20Enum {

    WARRIOR("Warrior"),
    MERCHANT("Merchant"),
    AGRICULTURE("Agriculture"),
    SCIENTIFIC("Scientific"),
    ARTISTIC("Artistic"),
    ACADEMIC("Academic");

    private final String label;

    Castes(String label) {

        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
