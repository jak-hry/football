package com.example.football.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dribbling {

    int agility;
    int balance;
    int reactions;
    int ballControl;
    int dribbling;
    int composure;

    //do poprawy jeszcze
    public int calculateDribbling() {
        double result = agility * 0.2 + balance * 0.05 + reactions * 0.15 +
                ballControl * 0.25 + dribbling * 0.3 + composure * 0.05;
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
                "\ndribbling: " + dribbling +
                "\ncomposure: " + composure;
    }
}
