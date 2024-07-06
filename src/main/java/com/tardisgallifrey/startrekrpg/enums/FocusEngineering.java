package com.tardisgallifrey.startrekrpg.enums;

public enum FocusEngineering implements D20Enum{
    ADVANCED_HOLOGRAMS("Advanced Holograms"),
    AI_SYSTEMS("Artificial Intelligence Systems"),
    CYBERNETICS("Cybernetics"),
    DEFLECTOR_SYSTEMS("Deflector Systems"),
    DIAGNOSTICS("Diagnostics"),
    EP_SYSTEMS("Electro-Plasma Systems"),
    EMERGENCY_REPAIRS("Emergency Repairs"),
    ENERGY_WEAPONS("Energy Weapons"),
    EVA_SUITS("EVA Suits"),
    EXPERIMENTAL_DEVICE("Experimental Device"),
    EXPLOIT_ENGINEERING_FLAW("Exploit Engineering Flaw"),
    FLIGHT_SYSTEMS("Flight Control Systems"),
    FORCE_FIELDS("Force Fields"),
    IMAGING_EQUIPMENT("Imaging Equipment"),
    IMPULSE_FUNDAMENTALS("Impulse Fundamentals"),
    JURY_RIGGING("Jury Rigging"),
    LOCKSMITH("Locksmith"),
    MAINTENANCE_SPECIALIST("Maintenance Specialist"),
    MANUFACTURING("Manufacturing"),
    METICULOUS("Meticulous"),
    MINING_OPS("Mining Operations"),
    MODELING_DESIGN("Modeling & Design"),
    PERCUSSIVE_MAINTENANCE("Percussive Maintenance"),
    PROCEDURAL_COMPLIANCE("Procedural Compliance"),
    PROPULSION("Propulsion"),
    REPAIR_TM_LEADER("Repair Team Leader"),
    REVERSE_ENGINEERING("Reverse Engineering"),
    SABOTEUR("Saboteur"),
    SALVAGE("Salvage"),
    SENSOR_CALIBRATION("Sensor Calibration"),
    SHUTTLECRAFT_MAINT("Shuttlecraft Maintenance"),
    SPACE_STATIONS("Space Stations"),
    STRUCTURAL_ENG("Structural Engineering"),
    SUBSPACE_MECHANICS("Subspace Mechanics"),
    SYSTEM_MAINT("System Maintenance"),
    TRANSPORTERS_REPLICATORS("Transporters/Replicators"),
    Troubleshooting("Troubleshooting"),
    WARPCORE_MECHANICS("Warp Core Mechanics"),
    WEAPONS_ENGINEERING("Weapons Engineering");

    public final String label;

    FocusEngineering(String label){
        this.label = label;
    }
    @Override
    public String getLabel() {
        return this.label;
    }
}
