package com.example.football.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shooting {

    int positioning;
    int finishing;
    int shotPower;
    int longShots;
    int volleys;
    int penalties;

    private int calculateShooting() {
        double result = positioning * 0.05 + finishing * 0.45 + shotPower * 0.2 +
                longShots * 0.2 + volleys * 0.05 + penalties * 0.05;
        return (result % 1 >= 0.5) ? (int) Math.ceil(result) :
                (int) Math.floor(result);
    }

    @Override
    public String toString() {
        return "Shooting - " + calculateShooting() +
                "\npositioning: " + positioning +
                "\nfinishing: " + finishing +
                "\nshotPower: " + shotPower +
                "\nlongShots; " + longShots +
                "\nvolleys: " + volleys +
                "\npenalties: " + penalties;
    }
}
