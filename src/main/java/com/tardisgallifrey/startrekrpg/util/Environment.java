package com.tardisgallifrey.startrekrpg.util;

import com.tardisgallifrey.startrekrpg.enums.Conditions;
import com.tardisgallifrey.startrekrpg.enums.Settings;

public class Environment {

    boolean Settings_Conditions;

    Settings setting;
    Conditions condition;

    public Settings getSetting(){
        return setting;
    }

    public Conditions getCondition(){
        return condition;
    }

    public void setSettings_Conditions(){
        int roll = Dice.D20();
        if(roll % 2 == 0){
            Settings_Conditions = true;
            setSetting();
            condition = null;
        }else{
            Settings_Conditions = false;
            setCondition();
            setting = null;
        }
    }

    private void setSetting(){
        int roll = Dice.D6();
        switch(roll){
            case 1-> setting = Settings.HOMEWORLD;
            case 2-> setting = Settings.BUSY_COLONY;
            case 3-> setting = Settings.ISOLATED_COLONY;
            case 4-> setting = Settings.FRONTIER_COLONY;
            case 5-> setting = Settings.STARSHIP_STARBASE;
            case 6-> setting = Settings.ANOTHER_SPECIES;
        }
    }

    private void setCondition(){
        int roll = Dice.D6();
        switch(roll){
            case 1-> condition = Conditions.UTOPIAN_PARADISE;
            case 2-> condition = Conditions.COSMOPOLITAN;
            case 3-> condition = Conditions.RIGOROUS_DISCIPLINE;
            case 4-> condition = Conditions.ASCETICISM_INTROSPECTION;
            case 5-> condition = Conditions.STRUGGLE_HARDSHIP;
            case 6-> condition = Conditions.OCCUPATION_WAR;
        }
    }


}
