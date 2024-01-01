package com.tardisgallifrey.startrekrpg.enums;

public enum Upbringing {

    STARFLEET("Starfleet"),
    BUSINESS("Business or Trade"),
    RURAL("Agriculture or Rural"),
    TECHNOLOGY("Science and Technology"),
    CREATIVE("Artistic and Creative"),
    POLITICS("Diplomacy and Politics");

    private final String label;

    Upbringing(String label) {
        this.label = label;
    }
}
