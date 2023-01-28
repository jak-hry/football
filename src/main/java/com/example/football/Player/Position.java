package com.example.football.Player;

public enum Position {

    GK("GK"),
    RWB("RWB"),
    RB("RB"),
    CB("CB"),
    LB("LB"),
    LWB("LWB"),
    CDM("CDM"),
    RM("RM"),
    CM("CM"),
    LM("LM"),
    CAM("CAM"),
    RF("RF"),
    CF("CF"),
    LF("LF"),
    RW("RW"),
    ST("ST"),
    LW("LW");

    private final String displayName;

    Position(final String displayName) {
        this.displayName=displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
