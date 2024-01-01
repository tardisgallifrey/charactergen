package com.tardisgallifrey.startrekrpg.enums;

public enum Track {
    COMMAND("Command Track"),
    OPERATIONS("Operations Track"),
    SCIENCES("Sciences Track");

    private final String label;

    Track(String label) {
        this.label = label;
    }
}
