package com.example.football.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pace {

    int acceleration;
    int sprintSpeed;

    private int calculatePace() {
        double result = acceleration * 0.45 + sprintSpeed * 0.55;
        return (result % 1 >= 0.5) ? (int) Math.ceil(result) :
                (int) Math.floor(result);
    }

    @Override
    public String toString() {
        return "Pace - " + calculatePace() +
                "\nacceleration: " + acceleration +
                "\nsprintSpeed: " + sprintSpeed;
    }
}
