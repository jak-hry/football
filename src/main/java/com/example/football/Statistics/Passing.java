package com.example.football.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passing {

    int vision;
    int crossing;
    int freeKickAccuracy;
    int shortPassing;
    int longPassing;
    int curve;

    private int calculatePassing() {
        double result = vision * 0.2 + crossing * 0.2 + freeKickAccuracy * 0.05 +
                shortPassing * 0.35 + longPassing * 0.15 + curve * 0.05;
        return (result % 1 >= 0.5) ? (int) Math.ceil(result) :
                (int) Math.floor(result);
    }

    @Override
    public String toString() {
        return "Passing - " + calculatePassing() +
                "\nvision:" + vision +
                "\ncrossing: " + crossing +
                "\nfreeKickAccuracy: " + freeKickAccuracy +
                "\nshortPassing: " + shortPassing +
                "\nlongPassing: " + longPassing +
                "\ncurve: " + curve;
    }
}
