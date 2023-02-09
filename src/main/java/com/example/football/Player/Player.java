package com.example.football.Player;

import com.example.football.Statistics.GkStatistics;
import com.example.football.Statistics.PlayerStatistic;
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
public class Player {

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
    private PlayerStatistic playerStatistics;
    @OneToOne(cascade = CascadeType.ALL)
    private GkStatistics gkStatistics;

    public Player(String name, String lastName, LocalDate date, Position position, PlayerStatistic playerStatistics) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.position = position;
        this.playerStatistics = playerStatistics;
    }

    public Player(String name, String lastName, LocalDate date, Position position, GkStatistics gkStatistics) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.position = position;
        this.gkStatistics = gkStatistics;
    }

//    public String getPlayerInfo() {
//
//        if (position != Position.GK) {
//            return "\nname: " + name + " " + lastName +
//                    "\nage: " + age + "\nposition: " + position +
//                    "\noverall: " + playerStatistics.calculateOverall(position) + "\n" + playerStatistics;
//        } else if (gkStatistics != null) {
//            return "\nname: " + name + " " + lastName +
//                    "\nage: " + age + "\nposition: " + position +
//                    "\noverall: " + gkStatistics.calculateGkOverall()
//                    + "\n" + gkStatistics;
//        } else {
//            return "\n" + name + " " + lastName + " currently cannot be a goalkeeper";
//        }
//    }
//
//
//    public String getOverall() {
//
//        if (position != Position.GK) {
//            return "\nname: " + name + " " + lastName +
//                    "\nage: " + age + "\nposition: " + position +
//                    "\noverall: " + playerStatistics.calculateOverall(position);
//        } else if (gkStatistics != null) {
//            return "\nname: " + name + " " + lastName +
//                    "\nage: " + age + "\nposition: " + position +
//                    "\noverall: " + gkStatistics.calculateGkOverall();
//        } else {
//            return "\n" + name + " " + lastName + " currently cannot be a goalkeeper";
//        }
//    }

    @Override
    public String toString() {
        return "\n" + name + " " + lastName;
    }
}

