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
public class Shooting {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    int positioning;
    @NotNull
    int finishing;
    @NotNull
    int shotPower;
    @NotNull
    int longShots;
    @NotNull
    int volleys;
    @NotNull
    int penalties;
    public Shooting(int positioning, int finishing, int shotPower, int longShots, int volleys, int penalties) {
        this.positioning = positioning;
        this.finishing = finishing;
        this.shotPower = shotPower;
        this.longShots = longShots;
        this.volleys = volleys;
        this.penalties = penalties;
    }

    public int calculateShooting() {
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
