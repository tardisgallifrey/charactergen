package com.tardisgallifrey.startrekrpg.enums;

public enum FocusMedicine implements D20Enum{

    ALT_MEDICINE("Alternative Medicine"),
    ANESTHESIA_PAIN("Anesthesia/Pain Management"),
    BEDSIDE_MANNER("Bedside Manner"),
    BIOCHEMISTRY("Biochemistry"),
    BIO_XENOBIOLOGY("Biology/Xenobiology"),
    BIOTECH("Biotechnology"),
    CHEMISTRY("Chemistry"),
    COUNSELING("Counseling"),
    CUTTING_EDGE("Cutting-Edge Medicine"),
    CYBERNETICS("Cybernetics"),
    DENTISTRY("Dentistry"),
    DIAGNOSTICS("Diagnostic Expertise"),
    EM_MEDICINE("Emergency Medicine"),
    ETHICS("Ethics"),
    FIELD_MEDIC("Field Medic"),
    FIRST_AID("First Aid"),
    GENETICS("Genetics"),
    GUIDED_THERAPY("Guided Therapy"),
    IMAGING("Imaging Systems"),
    IMMUNOLOGY("Immunology"),
    INTERNAL_MED("Internal Medicine"),
    KINESIOLOGY("Kinesiology"),
    MED_TOXICOLOGY("Medical Toxicology"),
    MICROBIOLOGY("Microbiology"),
    NEUROPSYCH_PSYCH("Neuropsychology/Psychiatry"),
    PATIENT_CARE("Patient Care"),
    PEDIATRICS("Pediatrics"),
    PHARMACOLOGY("Pharmacology"),
    POS_REINFORCEMENT("Positive Reinforcement"),
    RHEUMATOLOGY("Rheumatology"),
    STRESS_DISORDERS("Stress Disorders"),
    SURGERY("Surgery"),
    TRIAGE("Triage"),
    VET_MEDICINE("Veterinary Medicine"),
    VIROLOGY("Virology");


    private final String label;

    FocusMedicine(String label) {
        this.label = label;
    }


    @Override
    public String getLabel() {
        return this.label;
    }
}
