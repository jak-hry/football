package com.example.football.Statistics;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GkStatistics {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    private int diving;
    @NotNull
    private int reflexes;
    @NotNull
    private int handling;
    @NotNull
    private int reactions;
    @NotNull
    private int kicking;
    @NotNull
    private int positioning;

    public GkStatistics(int diving, int reflexes, int handling, int reactions, int kicking, int positioning) {
        this.diving = diving;
        this.reflexes = reflexes;
        this.handling = handling;
        this.reactions = reactions;
        this.kicking = kicking;
        this.positioning = positioning;
    }

    public int calculateGkOverall() {

        double result1 = diving * 0.24 + handling * 0.22 + positioning * 0.22 +
                reflexes * 0.22 + reactions * 0.06 + kicking * 0.04;
        return (result1 % 1 >= 0.5) ? (int) Math.ceil(result1) :
                (int) Math.floor(result1);
    }

    @Override
    public String toString() {
        return "\nGkStatistics - " + calculateGkOverall() + "\n" +
                "diving: " + diving + "\n" +
                "reflexes: " + reflexes + "\n" +
                "handling: " + handling + "\n" +
                "reactions: " + reactions + "\n" +
                "kicking: " + kicking + "\n" +
                "positioning: " + positioning + "\n";
    }
}
