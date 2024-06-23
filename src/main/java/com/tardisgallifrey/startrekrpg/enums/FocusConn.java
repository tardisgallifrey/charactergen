package com.tardisgallifrey.startrekrpg.enums;

public enum FocusConn implements D20Enum{

    ASTRONAVIGATION("Astronavigation"),
    ASTROPHYSICS("Astrophysics"),
    ATMOSPHERIC_FLIGHT("Atmospheric Flight"),
    ATTACK_RUN("Attack Run"),
    BOAT_SUBMERSIBLES("Boat/Submersible Pilot"),
    CLIMBING("Climbing"),
    COMBAT_MANEUVERS("Combat Maneuvers"),
    COMM_SYSTEMS("Communication Systems"),
    COVERING_ADVANCE("Covering Advance"),
    EFFICIENT_EVASION("Efficient Evasion"),
    EVAC_PROCEDURES("Evacuation Procedures"),
    EVASIVE_ACTION("Evasive Action"),
    EVA("Extra Vehicular Activity"),
    FLIGHT_CONTROLLER("Flight Controller"),
    GLANCING_IMPACT("Glancing Impact"),
    GROUND_VEHICLES("Ground Vehicles"),
    GUIDANCE_SYSTEMS("Guidance Systems"),
    HELM_OPS("Helm Operations"),
    IMPULSE_ENGINES("Impulse Engines"),
    MULTITASKING("Multi-tasking"),
    PATHFINDER("Pathfinder"),
    POWER_MANAGEMENT("Power Management"),
    SHIP_DESIGN_BUILD("Ship Design & Build"),
    SHUTTLEBAY_MGT("Shuttle Bay Management"),
    SMALL_CRAFT("Small Craft"),
    STATION_OPS("Space Station Operations"),
    SPACEWALK("Spacewalk"),
    STARFLEET_PROTOCOLS("Starfleet Protocols"),
    STARSHIP_EXPERT("Starship Expert(Pick One)"),
    STARSHIP_RECOGNITION("Starship Recognition"),
    STELLAR_CARTOGRAPHY("Stellar Cartography"),
    STRAFING_RUN("Strafing Run"),
    SUBSPACE_THEORY("Subspace Theory"),
    SURVIVAL("Survival"),
    TRACKING("Tracking"),
    WARP_DRIVE("Warp Drive"),
    ZEROG_COMBAT("Zero-G Combat");

    private final String label;

    FocusConn(String label) {
        this.label=label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
}
