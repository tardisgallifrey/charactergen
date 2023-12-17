package com.tardisgallifrey.startrekrpg.enums;

public enum Species {

    AENAR("Aenar", Era.ENTERPRISE, Attr.INSIGHT, Attr.CONTROL, Attr.PRESENCE),
    ANDORIAN("Andorian", Era.ENT_TOS, Attr.CONTROL, Attr.DARING, Attr.PRESENCE),
    ARBAZAN("Arbazan", Era.ENTERPRISE, Attr.CONTROL, Attr.INSIGHT, Attr.PRESENCE),
    DENOBULAN("Denobulan", Era.ENTERPRISE, Attr.FITNESS, Attr.INSIGHT, Attr.REASON),
    FERENGI("Ferengi", Era.ENT_TNG, Attr.CONTROL, Attr.INSIGHT, Attr.PRESENCE),
    GORN("Gorn", Era.ENT_TOS, Attr.DARING, Attr.FITNESS, Attr.REASON),
    HUMAN("Human", Era.ALL, Attr.CONTROL, Attr.DARING, Attr.INSIGHT),
    ILLYRIAN("Illyrian", Era.ENTERPRISE, Attr.DARING, Attr.FITNESS, Attr.REASON),
    KLINGON("Klingon", Era.ALL, Attr.DARING, Attr.FITNESS, Attr.PRESENCE),
    ORION("Orion", Era.ALL, Attr.DARING, Attr.FITNESS, Attr.PRESENCE),
    REMAN("Reman", Era.ENTERPRISE, Attr.DARING, Attr.FITNESS, Attr.PRESENCE),
    RISLAN("Rislan", Era.ENTERPRISE, Attr.CONTROL, Attr.INSIGHT, Attr.PRESENCE),
    ROMULAN("Romulan", Era.ALL, Attr.CONTROL, Attr.FITNESS, Attr.REASON),
    SULIBAN("Suliban", Era.ENTERPRISE, Attr.CONTROL, Attr.DARING, Attr.FITNESS),
    TELLARITE("Tellarite", Era.ENTERPRISE, Attr.CONTROL, Attr.FITNESS, Attr.INSIGHT),
    VULCAN("Vulcan", Era.ALL, Attr.CONTROL, Attr.FITNESS, Attr.REASON),
    ARDANAN("Ardanan", Era.TOS, Attr.FITNESS, Attr.PRESENCE, Attr.REASON),
    AURELIAN("Aurelian", Era.TOS, Attr.DARING, Attr.FITNESS, Attr.INSIGHT),
    BARZAN("Barzan", Era.TOS, Attr.DARING, Attr.FITNESS, Attr.PRESENCE),
    BETAZOID("Betazoid", Era.TOS_TNG, Attr.INSIGHT, Attr.PRESENCE, Attr.REASON),
    BOLIAN("Bolian", Era.TOS, Attr.CONTROL, Attr.INSIGHT, Attr.PRESENCE),
    CAITIAN("Caitian", Era.TOS, Attr.DARING, Attr.FITNESS, Attr.INSIGHT),
    CYBERNETICALLY_ENHANCED("Cybernetic", Era.TOS, Attr.CONTROL, Attr.FITNESS, Attr.REASON),
    DELTAN("Deltan", Era.TOS, Attr.CONTROL, Attr.INSIGHT, Attr.PRESENCE),
    EDOSIAN("Edosian", Era.TOS, Attr.FITNESS, Attr.INSIGHT, Attr.REASON),
    EFROSIAN("Efrosian", Era.TOS, Attr.FITNESS, Attr.PRESENCE, Attr.REASON),
    KELPIEN("Kelpien", Era.TOS, Attr.CONTROL, Attr.FITNESS, Attr.INSIGHT),
    KZINTI("Kzinti", Era.TOS, Attr.DARING, Attr.FITNESS, Attr.CONTROL),
    OSNULLUS("Osnullus", Era.TOS, Attr.DARING, Attr.FITNESS, Attr.REASON),
    SAURIAN("Saurian", Era.TOS, Attr.DARING, Attr.FITNESS, Attr.REASON),
    THOLIAN("Tholian", Era.TOS, Attr.CONTROL, Attr.DARING, Attr.FITNESS),
    TRILL("Trill", Era.TOS_TNG, Attr.CONTROL, Attr.PRESENCE, Attr.REASON),
    XAHEAN("Xahean", Era.TOS, Attr.CONTROL, Attr.INSIGHT, Attr.REASON),
    ZARANITE("Zaranite", Era.TOS, Attr.CONTROL, Attr.FITNESS, Attr.REASON),
    BAJORAN("Bajoran", Era.TNG, Attr.CONTROL, Attr.DARING, Attr.INSIGHT),
    BENZITE("Benzite", Era.TNG, Attr.CONTROL, Attr.INSIGHT, Attr.REASON),
    BYNAR("Bynar", Era.TNG, Attr.CONTROL, Attr.INSIGHT, Attr.REASON),
    CARDASSIAN("Cardassian", Era.TNG, Attr.CONTROL, Attr.PRESENCE, Attr.REASON),
    CHANGELING("Changeling", Era.TNG, Attr.CONTROL, Attr.FITNESS, Attr.PRESENCE),
    HOLOGRAM("Hologram", Era.TNG, Attr.CONTROL, Attr.REASON, Attr.INSIGHT),
    KAZON("Kazon", Era.TNG, Attr.DARING, Attr.FITNESS, Attr.PRESENCE),
    LIBERATED_BORG("Liberated Borg", Era.TNG, Attr.CONTROL, Attr.FITNESS, Attr.REASON),
    LURIAN("Lurian", Era.TNG, Attr.CONTROL, Attr.FITNESS, Attr.PRESENCE),
    OCAMPA("Ocampa", Era.TNG, Attr.CONTROL, Attr.INSIGHT, Attr.PRESENCE),
    PAKLED("Pakled", Era.TNG, Attr.DARING, Attr.FITNESS, Attr.INSIGHT),
    PARADAN("Paradan", Era.TNG, Attr.FITNESS, Attr.INSIGHT, Attr.PRESENCE),
    SIKARIAN("Sikarian", Era.TNG, Attr.CONTROL, Attr.REASON, Attr.PRESENCE),
    SOONG_ANDROID("Soong Type Android", Era.TNG, Attr.CONTROL, Attr.FITNESS, Attr.REASON),
    TALAXIAN("Talaxian", Era.TNG, Attr.CONTROL, Attr.PRESENCE, Attr.INSIGHT),
    TAMARIAN("Tamarian", Era.TNG, Attr.DARING, Attr.PRESENCE, Attr.REASON),
    ZAKDORN("Zakdorn", Era.TNG, Attr.CONTROL, Attr.INSIGHT, Attr.REASON);

    public static Species valueOfLabel(String label) {
        for (Species e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }


    public String getLabel() {
        return label;
    }

    public final String label;

    public Era getEra() {
        return era;
    }

    public final Era era;

    //constructor, but cannot be instantiated.
    //Is required because of enum fields
   Species(String label, Era era, Attr ignoredAttr1, Attr ignoredAttr2, Attr ignoredAttr3){
       this.label = label;
       this.era = era;
   }



}
