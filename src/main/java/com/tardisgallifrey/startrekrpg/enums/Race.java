package com.tardisgallifrey.startrekrpg.enums;

import java.util.HashMap;
import java.util.Map;

public enum Race {

    AENAR("Aenar", Era.ENTERPRISE),
    ANDORIAN("Andorian", Era.ENT_TOS),
    ARBAZAN("Arbazan", Era.ENTERPRISE),
    DENOBULAN("Denobulan", Era.ENTERPRISE),
    FERENGI("Ferengi", Era.ENT_TNG),
    GORN("Gorn", Era.ENT_TOS),
    HUMAN("Human", Era.ALL),
    ILLYRIAN("Illyrian", Era.ENTERPRISE),
    KLINGON("Klingon", Era.ALL),
    ORION("Orion", Era.ALL),
    REMAN("Reman", Era.ENTERPRISE),
    RISLAN("Rislan", Era.ENTERPRISE),
    ROMULAN("Romulan", Era.ALL),
    SULIBAN("Suliban", Era.ENTERPRISE),
    TELLARITE("Tellarite", Era.ENTERPRISE),
    VULCAN("Vulcan", Era.ALL),
    XINDI_ARBOREAL("Xindi Arboreal", Era.ENTERPRISE),
    XINDI_INSECTOID("Xindi Insectoid", Era.ENTERPRISE),
    XINDI_PRIMATE("Xindi Primate", Era.ENTERPRISE),
    XINDI_REPTILIAN("Xindi Reptilian", Era.ENTERPRISE),
    ARDANAN("Ardanan", Era.TOS),
    AURELIAN("Aurelian", Era.TOS),
    BARZAN("Barzan", Era.TOS),
    BETAZOID("Betazoid", Era.TOS_TNG),
    BOLIAN("Bolian", Era.TOS),
    CAITIAN("Caitian", Era.TOS),
    CYBERNETICALLY_ENHANCED("Cybernetic", Era.TOS),
    DELTAN("Deltan", Era.TOS),
    EDOSIAN("Edosian", Era.TOS),
    EFROSIAN("Efrosian", Era.TOS),
    HORTA("Horta", Era.TOS),
    KELPIEN("Kelpien", Era.TOS),
    KZINTI("Kzinti", Era.TOS),
    OSNULLUS("Osnullus", Era.TOS),
    SAURIAN("Saurian", Era.TOS),
    THOLIAN("Tholian", Era.TOS),
    TRILL("Trill", Era.TOS_TNG),
    XAHEAN("Xahean", Era.TOS),
    ZARANITE("Zaranite", Era.TOS),
    BAJORAN("Bajoran", Era.TNG),
    BENZITE,
    BYNAR,
    CARDASSIAN,
    CHANGELING,
    DOOPLER,
    HOLOGRAM,
    JEM_HADAR,
    KAZON,
    LIBERATED_BORG,
    LURIAN,
    OCAMPA,
    PAKLED,
    PARADAN,
    SIKARIAN("Sikarian", Era.TNG),
    SOONG_ANDROID("Soong Type Android", Era.TNG),
    TALAXIAN("Talaxian", Era.TNG),
    TAMARIAN("Tamarian", Era.TNG),
    ZAKDORN("Zakdorn", Era.TNG);

    private static final Map<String, Race> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Race> BY_ERA = new HashMap<>();


    static {
        for (Race race : values()) {
            BY_LABEL.put(race.label, race);
            BY_ERA.put(race.era.ordinal(), race);
        }
    }

    public final String label;
    public final Era era;

    //constructor
    private Race(String label, Era era) {
        this.label = label;
        this.era = era;
    }

    public static Race valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static Race valueOfEra(Era era) {
        return BY_ERA.get(era);
    }



}
