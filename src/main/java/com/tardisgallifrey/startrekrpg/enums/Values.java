package com.tardisgallifrey.startrekrpg.enums;

public enum Values {

    MYSTERY("A good mystery is irrestible."),
    CONFIDENCE("Act with confidence, even if you don't feel it."),
    CREW_FIRST("Crew comes first."),
    DIPLOMACY("Diplomacy is the first and last solution to anything."),
    EXPLORATION("Exploration is the blood that fills my veins."),
    GOOD_LEADER("Good leaders get their hands dirty."),
    HANDY("I can make something from nothing."),
    DETERMINED("I finish what I start."),
    KNOWLEDGE("Information is power."),
    DILIGENT("Never leave a stone unturned"),
    FIGHTER("Push me too far and you'll see my ugly side."),
    RESOLUTE("Resistance is never futile."),
    LOOKING_INSIDE("Seeking to find myself far from home."),
    INTUITIVE("Sensors can't tell you everything."),
    RASH("Spoiling for a fight."),
    MISSION("The mission comes first."),
    PRAGMATIC("Trust, but verify."),
    CONNECTION("We are all connected despite being worlds apart."),
    SACRIFICIAL("Willing to sacrifice myself to save my crew."),
    HUMBLE("You must walk barefoot in the dirt to really understand a world.");

    private final String label;

    Values(String label) {

        this.label = label;
    }
}
