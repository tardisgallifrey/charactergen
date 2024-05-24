package com.tardisgallifrey.startrekrpg.enums;

public enum FocusCommand {

    ART("art"),
    BARGAIN("bargain"),
    CALL_ACTION("call to action"),
    COLD_READING("cold reading"),
    COMPOSURE("composure"),
    COORDINATED_EFFORTS("coordinated efforts"),
    COURTING_RITUALS("courting rituals"),
    CULTURAL_EXPERT("cultural expert"),
    DEBATE("debate"),
    DECEPTION("deception"),
    DECISIVE_LEADERSHIP("decisive leadership"),
    DIPLOMACY("diplomacy"),
    EMOTIONAL_INTEL("emotional intelligence"),
    ETIQUETTE("etiquette"),
    FLEET_COMMAND("fleet commander"),
    GAMBLING("gambling"),
    HISTORY("history"),
    INSPIRATION("inspiration"),
    INTIMIDATION("intimidation"),
    JOURNALISM("journalism"),
    LAW("law"),
    LEAD_EXAMPLE("lead by example"),
    LINGUISTICS("linguistics"),
    MENTAL_DISCIPLINE("mental discipline"),
    MULTI_DISCIPLINE("multi discipline"),
    NEGOTIATION("negotiation"),
    PERFORMER("performer"),
    PERSUASION("persuasion"),
    PHILOSOPHY("philosophy"),
    POLITICS("politics"),
    PRIME_DIRECTIVE("prime directive"),
    REPORTING_PROCED("reporting procedures"),
    RHETORIC("rhetoric"),
    STARFLEET_PROTO("starfleet protocol"),
    STATION_OPS("station operations"),
    STRATEGY("strategy and tactics"),
    TEACHING("teaching"),
    TEAMS("team dynamic"),
    TIME_MGMT("time management")
    ;

    private String label;

    FocusCommand(String label) {
        this.label = label;
    }
}
