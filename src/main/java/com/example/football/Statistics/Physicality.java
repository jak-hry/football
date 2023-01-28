package com.example.football.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Physicality {

    int jumping;
    int stamina;
    int strength;
    int aggression;

    private int calculatePhysicality() {
        double result = jumping * 0.05 + stamina * 0.25 +
                strength * 0.5 + aggression * 0.2;
        return (result % 1 >= 0.5) ? (int) Math.ceil(result) :
                (int) Math.floor(result);
    }

    @Override
    public String toString() {
        return "Physicality - " + calculatePhysicality() +
                "\njumping: " + jumping +
                "\nstamina: " + stamina +
                "\nstrength: " + strength +
                "\naggression: " + aggression;
    }
}
