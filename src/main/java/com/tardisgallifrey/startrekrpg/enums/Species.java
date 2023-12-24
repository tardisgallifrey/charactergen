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

    //gets Species enum when given the label
    public static Species valueOfLabel(String label) {
        for (Species e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }

    //returns character's Species label
    public String getLabel() {
        return label;
    }

    public final String label;

    //returns character's Era
    public Era getEra() {
        return era;
    }

    public final Era era;

    public static Attr[] Attributes(Species species){

        Attr[] attributes = new Attr[3];
        //Though a loop seems obvious,
        //the small size and differences
        //makes this reasonable
        attributes[0] = species.attr1;
        attributes[1] = species.attr2;
        attributes[2] = species.attr3;

        return attributes;
    }

    public final Attr attr1;
    public final Attr attr2;
    public final Attr attr3;

    //constructor, but cannot be instantiated.
    //Is required because of enum fields
   Species(String label, Era era, Attr attr1, Attr attr2, Attr attr3){
       this.label = label;
       this.era = era;
       this.attr1 = attr1;
       this.attr2 = attr2;
       this.attr3 = attr3;
   }



}
