package com.tardisgallifrey.startrekrpg.enums;

public enum FocusSecurity implements D20Enum{
    AMBUSH_TACTICS("Ambush tactics"),
    BLADE_WEAPONS("Blade weapons"),
    CAMOUFLAGE("camouflage"),
    CHEM_BIO_WEAPONS("Chemical & Bio Weapons"),
    COMBAT_MEDIC("Combat medic"),
    COMP_SECURITY_SYS("Computer security systems"),
    CRIMINAL_MINDS("Criminal minds"),
    CRIMINAL_ORGANIZATIONS("Criminal organizations"),
    CRISIS_MANAGEMENT("Crisis management"),
    DEADEYE_MARKSMAN("Deadeye marksman"),
    DEFLECTOR_OPS("Deflector operations"),
    DEMOLITIONS("Demolitions"),
    ESPIONAGE("Espionage"),
    EVAC_PROCEDURES("Evacuation Procedures"),
    FLEET_FORMATIONS("Fleet formations"),
    FORENSICS("Forensics"),
    HAND_PHASERS("Hand Phasers"),
    HAZARDOUS_ENVIRO("Hazardous environments"),
    HEAVY_COVER("Heavy cover"),
    INTERROGATION("Interrogation"),
    INTIMIDATION("Intimidation"),
    KLINGON_WEAPONS("Klingon weapons"),
    LAW_ENFORCEMENT("Law Enforcement"),
    LEAD_INVESTIGATOR("Lead investigator"),
    MARTIAL_ARTS("Martial arts"),
    MENTAL_RESISTANCE_TECHNIQUES("Mental resistance techniques"),
    ORGANIZATIONAL_PSYCH("Organizational psychology"),
    PATROL("Patrol"),
    PHASERS("Phasers"),
    PICKPOCKET("Pickpocketing"),
    PLANETARY_SURVEYS("Planetary surveys"),
    PRECISION_TARGETING("Precision targeting"),
    SECURITY_SYSTEMS("Security systems"),
    SHIP_ENGAGE_TACTICS("Ship engagement tactics"),
    SHIP_LOCKDOWN_PROCS("Ship lockdown tactics"),
    SMALL_UNIT_TACTICS("Small unit tactics"),
    STRATEGY("Strategy"),
    TARGETING_SYSTEMS("Targeting systems"),
    TORPEDOES("Torpedoes");

    public final String label;

    FocusSecurity(String label){
        this.label = label;
    }
    @Override
    public String getLabel() {
        return this.label;
    }
}
