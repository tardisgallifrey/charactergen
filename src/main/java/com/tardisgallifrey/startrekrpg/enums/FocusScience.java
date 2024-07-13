package com.tardisgallifrey.startrekrpg.enums;

public enum FocusScience implements D20Enum{
    ANIMAL_BEHAVIOR("Animal Behavior"),
    ANTHROPOLOGY("Anthropology"),
    ARCHAEOLOGY("Archaeology"),
    ASTROMETRICS("Astrometrics"),
    BIOCHEMISTRY("Biochemistry"),
    BIO_XENOBIOLOGY("Biology/Xenobiology"),
    BOT_XENOBOTANY("Botany/Xenobotany"),
    CATASTROPHISM("Catastrophism"),
    CHEMISTRY("Chemistry"),
    COMP_SCI("Computer Science"),
    DEFLECTOR_OPS("Deflector Operations"),
    ECOLOGY("Ecology"),
    EXPEDITION_EXPERT("Expedition Expert"),
    GALACTIC_HISTORY("Galactic History"),
    GEOLOGY("Geology"),
    LAB_MAINTENANCE("Laboratory Maintenance"),
    MARINE_BIO("Marine Biology"),
    MATTER_ANTIMATTER("Matter/Antimatter"),
    Meteorology("Meteorology"),
    MICROBIOLOGY("Microbiology"),
    PHOTONIC_APPLICATIONS("Photonic_applications"),
    PHYSICS("Physics"),
    PROTOTYPING("Prototyping"),
    QUANTUM_CONSCIOUS("Quantum Consciousness"),
    QUANTUM_MECHANICS("Quantum Mechanics"),
    RAPID_ANALYSIS("Rapid Analysis"),
    RESEARCH("Research"),
    SENSOR_OPS("Sensor Operations"),
    SOCIOLOGY("Sociology"),
    SPECIFIC_TIME_PERIOD("Specific Historical Time Period"),
    STARFLEET_PROGRAM("Starfleet Programming"),
    SUBSPACE_THEORY("Subspace Theory"),
    TEMPORAL_MECH("Temporal Mechanics"),
    TERRAFORM("Terraforming"),
    UNCON_THINKING("Unconventional Thinking"),
    UNIFIED_FIELD("Unified Field Theory"),
    UNORTHODOX_MATH("Unorthodox Mathematics"),
    WALKING_ENCYCLOPEDIA("Walking Encyclopedia"),
    WARP_THEORY("Warp Theory");



    private final String label;

    FocusScience(String label){
        this.label = label;
    }
    @Override
    public String getLabel() {
        return this.label;
    }
}
