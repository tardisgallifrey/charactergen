package com.tardisgallifrey.startrekrpg.enums;

public enum FocusConn implements D20Enum{

    ASTRONAVIGATION("Astronavigation", 3),
    ASTROPHYSICS("Astrophysics", 3),
    ATMOSPHERIC_FLIGHT("Atmospheric Flight", 1),
    ATTACK_RUN("Attack Run", 1),
    BOAT_SUBMERSIBLES("Boat/Submersible Pilot", 1),
    CLIMBING("Climbing", 1),
    COMBAT_MANEUVERS("Combat Maneuvers", 1),
    COMM_SYSTEMS("Communication Systems", 1),
    COVERING_ADVANCE("Covering Advance", 1),
    EFFICIENT_EVASION("Efficient Evasion", 1),
    EVAC_PROCEDURES("Evacuation Procedures", 1),
    EVASIVE_ACTION("Evasive Action", 1),
    EVA("Extra Vehicular Activity", 1),
    FLIGHT_CONTROLLER("Flight Controller", 1),
    GLANCING_IMPACT("Glancing Impact", 1),
    GROUND_VEHICLES("Ground Vehicles", 1),
    GUIDANCE_SYSTEMS("Guidance Systems", 1),
    HELM_OPS("Helm Operations", 1),
    IMPULSE_ENGINES("Impulse Engines", 3),
    MULTITASKING("Multi-tasking", 2),
    PATHFINDER("Pathfinder", 3),
    POWER_MANAGEMENT("Power Management", 4),
    SHIP_DESIGN_BUILD("Ship Design & Build", 2),
    SHUTTLEBAY_MGT("Shuttle Bay Management", 2),
    SMALL_CRAFT("Small Craft", 2),
    STATION_OPS("Space Station Operations", 1),
    SPACEWALK("Spacewalk", 1),
    STARFLEET_PROTOCOLS("Starfleet Protocols", 1),
    STARSHIP_EXPERT("Starship Expert(Pick One)", 1),
    STARSHIP_RECOGNITION("Starship Recognition", 1),
    STELLAR_CARTOGRAPHY("Stellar Cartography", 4),
    STRAFING_RUN("Strafing Run", 1),
    SUBSPACE_THEORY("Subspace Theory", 4),
    SURVIVAL("Survival", 3),
    TRACKING("Tracking", 3),
    WARP_DRIVE("Warp Drive", 4),
    ZEROG_COMBAT("Zero-G Combat", 1);

    private final String label;
    private final int type;

    FocusConn(String label, int type) {
        this.label=label;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    public int getType(){
        return this.type;
    }
}
