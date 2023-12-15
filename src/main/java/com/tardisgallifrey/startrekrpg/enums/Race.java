package com.tardisgallifrey.startrekrpg.enums;

import java.util.HashMap;

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
    BENZITE("Benzite", Era.TNG),
    BYNAR("Bynar", Era.TNG),
    CARDASSIAN("Cardassian", Era.TNG),
    CHANGELING("Changeling", Era.TNG),
    DOOPLER("Doopler", Era.TNG),
    HOLOGRAM("Hologram", Era.TNG),
    JEM_HADAR("Jem'Hadar", Era.TNG),
    KAZON("Kazon", Era.TNG),
    LIBERATED_BORG("Liberated Borg", Era.TNG),
    LURIAN("Lurian", Era.TNG),
    OCAMPA("Ocampa", Era.TNG),
    PAKLED("Pakled", Era.TNG),
    PARADAN("Paradan", Era.TNG),
    SIKARIAN("Sikarian", Era.TNG),
    SOONG_ANDROID("Soong Type Android", Era.TNG),
    TALAXIAN("Talaxian", Era.TNG),
    TAMARIAN("Tamarian", Era.TNG),
    ZAKDORN("Zakdorn", Era.TNG);


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
   Race(String label, Era era){
       this.label = label;
       this.era = era;
   }



}
