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
public class Physicality {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    int jumping;
    @NotNull
    int stamina;
    @NotNull
    int strength;
    @NotNull
    int aggression;

    public Physicality(int jumping, int stamina, int strength, int aggression) {
        this.jumping = jumping;
        this.stamina = stamina;
        this.strength = strength;
        this.aggression = aggression;
    }

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
