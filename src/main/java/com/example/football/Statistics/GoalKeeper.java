package com.example.football.Statistics;

import com.example.football.Player.Position;
import com.example.football.Statistics.GkStatistics;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalKeeper {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate date;
    @NotNull
    private Position position;

    @OneToOne(cascade = CascadeType.ALL)
    private GkStatistics gk;

    public GoalKeeper(String name, String lastName, LocalDate date, Position position, GkStatistics gk) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.position = position;
        this.gk = gk;
    }

    @Override
    public String toString() {
        return "\nname: " + name + " " + lastName +
                "\nage: " + date + "\nposition: " + position +
                "\noverall: " + gk.calculateGkOverall() + "\n" + gk;
    }
}
