package com.tardisgallifrey.startrekrpg.enums;

public enum Castes {

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
}
