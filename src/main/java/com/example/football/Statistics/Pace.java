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
public class Pace {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    int acceleration;
    @NotNull
    int sprintSpeed;

    public Pace(int acceleration, int sprintSpeed) {
        this.acceleration = acceleration;
        this.sprintSpeed = sprintSpeed;
    }

    public int calculatePace() {
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
