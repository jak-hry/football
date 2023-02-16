package com.example.football.Statistics;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passing {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    int vision;
    @NotNull
    int crossing;
    @NotNull
    int freeKickAccuracy;
    @NotNull
    int shortPassing;
    @NotNull
    int longPassing;
    @NotNull
    int curve;

    public Passing(int vision, int crossing, int freeKickAccuracy, int shortPassing, int longPassing, int curve) {
        this.vision = vision;
        this.crossing = crossing;
        this.freeKickAccuracy = freeKickAccuracy;
        this.shortPassing = shortPassing;
        this.longPassing = longPassing;
        this.curve = curve;
    }

    public int calculatePassing() {
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
