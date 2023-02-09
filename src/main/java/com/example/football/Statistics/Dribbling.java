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
public class Dribbling {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    int agility;
    @NotNull
    int balance;
    @NotNull
    int reactions;
    @NotNull
    int ballControl;
    @NotNull
    int dribblings;
    @NotNull
    int composure;

    public Dribbling(int agility, int balance, int reactions, int ballControl, int dribblings, int composure) {
        this.agility = agility;
        this.balance = balance;
        this.reactions = reactions;
        this.ballControl = ballControl;
        this.dribblings = dribblings;
        this.composure = composure;
    }

    //do poprawy jeszcze
    public int calculateDribbling() {
        double result = agility * 0.2 + balance * 0.05 + reactions * 0.15 +
                ballControl * 0.25 + dribblings * 0.3 + composure * 0.05;
        return (result % 1 >= 0.5) ? (int) Math.ceil(result) :
                (int) Math.floor(result);
    }

    @Override
    public String toString() {
        return "Dribbling - " + calculateDribbling() +
                "\nagility: " + agility +
                "\nbalance: " + balance +
                "\nreactions: " + reactions +
                "\nballControl: " + ballControl +
                "\ndribbling: " + dribblings +
                "\ncomposure: " + composure;
    }
}
