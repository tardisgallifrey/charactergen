package com.tardisgallifrey.startrekrpg.enums;

public enum FocusCommand implements D20Enum{

    ART("art", 5),
    BARGAIN("bargain", 3),
    CALL_ACTION("call to action", 1),
    COLD_READING("cold reading", 5),
    COMPOSURE("composure", 6),
    COORDINATED_EFFORTS("coordinated efforts", 3),
    COURTING_RITUALS("courting rituals", 4),
    CULTURAL_EXPERT("cultural expert", 4),
    DEBATE("debate", 6),
    DECEPTION("deception", 1),
    DECISIVE_LEADERSHIP("decisive leadership", 1),
    DIPLOMACY("diplomacy", 6),
    EMOTIONAL_INTEL("emotional intelligence", 3),
    ETIQUETTE("etiquette", 6),
    FLEET_COMMAND("fleet commander", 1),
    GAMBLING("gambling", 2),
    HISTORY("history", 6),
    INSPIRATION("inspiration", 5),
    INTIMIDATION("intimidation", 1),
    JOURNALISM("journalism", 6),
    LAW("law", 6),
    LEAD_EXAMPLE("lead by example", 3),
    LINGUISTICS("linguistics", 4),
    MENTAL_DISCIPLINE("mental discipline", 1),
    MULTI_DISCIPLINE("multi discipline", 2),
    NEGOTIATION("negotiation", 6),
    PERFORMER("performer", 4),
    PERSUASION("persuasion", 6),
    PHILOSOPHY("philosophy", 4),
    POLITICS("politics", 6),
    PRIME_DIRECTIVE("prime directive", 4),
    REPORTING_PROCED("reporting procedures", 4),
    RHETORIC("rhetoric", 6),
    STARFLEET_PROTO("starfleet protocol", 1),
    STATION_OPS("station operations", 1),
    STRATEGY("strategy and tactics", 1),
    TEACHING("teaching", 3),
    TEAMS("team dynamic", 3),
    TIME_MGMT("time management", 3)
    ;

    private final String label;
    private final int type;

    public String getLabel(){
        return label;
    }

    public int getType(){
        return type;
    }

    FocusCommand(String label, int type) {
        this.label = label;
        this.type = type;
        // type 1 = Starfleet, Warrior
        // type 2 = Business_Trade, Merchant
        // type 3 = Ag_Rural, Agriculture
        // type 4 = Science_Tech, Scientific
        // type 5 = Art_Creative, Artistic
        // type 6 = Diplomacy_Pol, Academic
    }
}
