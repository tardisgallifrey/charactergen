package com.tardisgallifrey.startrekrpg.enums;

public enum Track implements D20Enum{
    COMMAND("Command Track"),
    OPERATIONS("Operations Track"),
    SCIENCES("Sciences Track");

    private final String label;

    Track(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
