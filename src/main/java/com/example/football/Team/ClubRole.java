package com.example.football.Team;

public enum ClubRole {

    FIRST_SQUAD("FirstSquad"),
    BENCH("Bench"),
    RESERVES("Reserves");

    private final String displayName;

    ClubRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
