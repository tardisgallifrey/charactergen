package com.tardisgallifrey.startrekrpg.enums;

public enum Upbringing implements D20Enum{

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

    @Override
    public String getLabel() {
        return this.label;
    }
}
