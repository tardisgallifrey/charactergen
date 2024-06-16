package com.tardisgallifrey.startrekrpg.enums;

public enum CareerEvents implements D20Enum{

    SHIP_DESTROYED("Ship destroyed"),
    DEATH_OF_FRIEND("Death of a friend"),
    LAUDED_BY_CULTURE("Lauded or praised by another culture"),
    NEGOTIATED_TREATY("Negotiated a treaty"),
    REQUIRED_TO_COMMAND("Required to command"),
    ENCOUNTER_ALIEN("Encounter with a truly alien being"),
    SERIOUS_INJURY("Serious Injury"),
    HOSTILE_CONFLICT("Conflict with a hostile culture"),
    MENTORED("Mentored"),
    TRANSPORTER_ACCIDENT("Transport Accident"),
    PLAGUE("Dealing with a plague"),
    BETRAYED_FOR_SUPERIOR("Betrayed own ideals for a superior"),
    ACCUSED_SUPERIOR("Called out a superior"),
    NEW_STRATEGY("Developed new battle strategy"),
    LEARNED_UNIQUE_LANGUAGE("Learned a unique language"),
    DISCOVERED_ARTIFACT("Discovered an artifact"),
    COMMENDATION("Received a special commendation"),
    ENGINEERING_SOLUTION("Solved an engineering crisis"),
    INVENTION("Developed breakthrough or create invention"),
    FIRST_CONTACT("First Contact");

    private final String label;

    CareerEvents(String label) {
        this.label = label;
    }


    @Override
    public String getLabel() {
        return this.label;
    }
}
