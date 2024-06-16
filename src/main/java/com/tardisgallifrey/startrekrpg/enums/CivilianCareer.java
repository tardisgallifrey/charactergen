package com.tardisgallifrey.startrekrpg.enums;

public enum CivilianCareer implements D20Enum {
    TRANSPORTATION("Freight and Transport"),
    LAW_ENFORCEMENT("Law Enforcement"),
    PHYSICIAN("Physician"),
    POLITICIAN("Pollitician or Bureaucrat"),
    TECHNICAL("Scientific or Technical Expert"),
    MERCHANT("Trader or Merchant");

    private final String label;

    CivilianCareer(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
