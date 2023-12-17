package com.tardisgallifrey.startrekrpg.enums;

public enum Attr {
    CONTROL("Control", 1),
    DARING("Daring", 1),
    FITNESS("Fitness", 1),
    INSIGHT("Insight", 1),
    PRESENCE("Presence", 1),
    REASON("Reason", 1);

    public String getLabel() {
        return label;
    }

    private final String label;

    public int getAdder() {
        return adder;
    }

    private final int adder;

    Attr(String label, int i) {
        this.label = label;
        this.adder = i;
    }
}
