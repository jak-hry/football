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

    public int calculateOverall(Player player) {

        switch (player.getPosition()) {
            case GK:
                return 0;
            case LB, RB:
//                double result2 = defending.slidingTackle * 0.13 + defending.standingTackle * 0.12 +
//                        defending.interceptions * 0.12 + defending.marking * 0.1 + physicality.stamina * 0.08 +
//                        dribblings.reactions * 0.08 + passing.crossing * 0.07 + defending.headingAccuracy * 0.07 +
//                        dribblings.ballControl * 0.07 + passing.shortPassing * 0.06 + pace.sprintSpeed * 0.05 +
//                        physicality.aggression * 0.05;
//                return (result2 % 1 >= 0.5) ? (int) Math.ceil(result2) :
//                        (int) Math.floor(result2);
//            case LWB, RWB:
//                double result3 = defending.standingTackle * 0.11 + defending.slidingTackle * 0.1 +
//                        passing.crossing * 0.1 + passing.shortPassing * 0.1 + dribblings.ballControl * 0.1 +
//                        defending.interceptions * 0.1 + defending.marking * 0.09 + physicality.stamina * 0.08 +
//                        dribblings.reactions * 0.08 + dribblings.dribbling * 0.07 + pace.sprintSpeed * 0.04 +
//                        dribblings.agility * 0.03;
//                return (result3 % 1 >= 0.5) ? (int) Math.ceil(result3) :
//                        (int) Math.floor(result3);
//            case CB:
//                double result4 = defending.marking * 0.15 + defending.standingTackle * 0.15 +
//                        defending.slidingTackle * 0.15 + defending.headingAccuracy * 0.1 + physicality.strength * 0.1 +
//                        physicality.aggression * 0.08 + defending.interceptions * 0.08 + passing.shortPassing * 0.05 +
//                        dribblings.ballControl * 0.05 + dribblings.reactions * 0.05 + physicality.jumping * 0.04;
//                return (result4 % 1 >= 0.5) ? (int) Math.ceil(result4) :
//                        (int) Math.floor(result4);
//            case CDM:
//                double result5 = passing.shortPassing * 0.13 + defending.interceptions * 0.13 +
//                        passing.longPassing * 0.11 + defending.marking * 0.1 + defending.standingTackle * 0.1 +
//                        dribblings.ballControl * 0.09 + dribblings.reactions * 0.09 + passing.vision * 0.08 +
//                        physicality.stamina * 0.06 + physicality.strength * 0.06 + physicality.aggression * 0.05;
//                return (result5 % 1 >= 0.5) ? (int) Math.ceil(result5) :
//                        (int) Math.floor(result5);
//            case CM:
//                double result6 = passing.shortPassing * 0.15 + passing.longPassing * 0.13 +
//                        passing.vision * 0.12 + dribblings.ballControl * 0.1 + dribblings.dribbling * 0.09 +
//                        dribblings.reactions * 0.08 + defending.interceptions * 0.08 +
//                        shooting.positioning * 0.08 + defending.standingTackle * 0.06 +
//                        physicality.stamina * 0.06 + shooting.longShots * 0.05;
//
//                return (result6 % 1 >= 0.5) ? (int) Math.ceil(result6) :
//                        (int) Math.floor(result6);
//            case LM, RM:
//                double result7 = passing.crossing * 0.14 + dribblings.dribbling * 0.14 + passing.shortPassing * 0.12 +
//                        dribblings.ballControl * 0.12 + passing.longPassing * 0.08 + passing.vision * 0.08 +
//                        dribblings.reactions * 0.07 + shooting.positioning * 0.07 + physicality.stamina * 0.05 +
//                        pace.acceleration * 0.05 + pace.sprintSpeed * 0.05 + dribblings.agility * 0.03;
//                return (result7 % 1 >= 0.5) ? (int) Math.ceil(result7) :
//                        (int) Math.floor(result7);
//            case CAM:
//                double result8 = passing.shortPassing * 0.16 + passing.vision * 0.16 + dribblings.ballControl * 0.13 +
//                        shooting.positioning * 0.12 + dribblings.dribbling * 0.11 + dribblings.reactions * 0.08 +
//                        shooting.longShots * 0.06 + shooting.finishing * 0.05 + shooting.shotPower * 0.05 +
//                        pace.acceleration * 0.04 + dribblings.agility * 0.04;
//                return (result8 % 1 >= 0.5) ? (int) Math.ceil(result8) :
//                        (int) Math.floor(result8);
//            case LF, CF, RF:
//                double result9 = shooting.finishing * 0.12 + shooting.positioning * 0.12 + dribblings.dribbling * 0.11 +
//                        dribblings.ballControl * 0.11 + shooting.shotPower * 0.1 + shooting.longShots * 0.1 +
//                        dribblings.reactions * 0.1 + passing.shortPassing * 0.06 + defending.headingAccuracy * 0.05 +
//                        passing.vision * 0.05 + pace.acceleration * 0.04 + pace.sprintSpeed * 0.04;
//                return (result9 % 1 >= 0.5) ? (int) Math.ceil(result9) :
//                        (int) Math.floor(result9);
//            case LW, RW:
//                double result10 = passing.crossing * 0.16 + dribblings.dribbling * 0.16 + dribblings.ballControl * 0.13 +
//                        passing.shortPassing * 0.1 + shooting.positioning * 0.09 + pace.acceleration * 0.06 +
//                        pace.sprintSpeed * 0.06 + dribblings.reactions * 0.06 + dribblings.agility * 0.05 +
//                        passing.vision * 0.05 + shooting.finishing * 0.04 + shooting.longShots * 0.04;
//                return (result10 % 1 >= 0.5) ? (int) Math.ceil(result10) :
//                        (int) Math.floor(result10);
//            case ST:
//                double result11 = shooting.finishing * 0.2 + shooting.positioning * 0.12 + physicality.jumping * 0.1 +
//                        shooting.shotPower * 0.1 + dribblings.reactions * 0.1 + dribblings.dribbling * 0.08 +
//                        dribblings.ballControl * 0.08 + shooting.volleys * 0.05 + shooting.longShots * 0.05 +
//                        pace.acceleration * 0.05 + pace.sprintSpeed * 0.04 + physicality.strength * 0.03;
//                return (result11 % 1 >= 0.5) ? (int) Math.ceil(result11) :
//                        (int) Math.floor(result11);

            case ST:
                double result11 = player.getPlayerStatistics().getShooting().getFinishing() * 0.2 +
                        player.getPlayerStatistics().getShooting().getPositioning() * 0.12 +
                        player.getPlayerStatistics().getPhysicality().getJumping() * 0.1 +
                        player.getPlayerStatistics().getShooting().getShotPower() * 0.1 +
                        player.getPlayerStatistics().getDribblings().getReactions() * 0.1 +
                        player.getPlayerStatistics().getDribblings().getDribblings() * 0.08 +
                        player.getPlayerStatistics().getDribblings().getBallControl() * 0.08 +
                        player.getPlayerStatistics().getShooting().getVolleys() * 0.05 +
                        player.getPlayerStatistics().getShooting().getLongShots() * 0.05 +
                        player.getPlayerStatistics().getPace().getAcceleration() * 0.05 +
                        player.getPlayerStatistics().getPace().getSprintSpeed() * 0.04 +
                        player.getPlayerStatistics().getPhysicality().getStrength() * 0.03;
                return (result11 % 1 >= 0.5) ? (int) Math.ceil(result11) :
                        (int) Math.floor(result11);
            default:
                return 0;
        }
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
        return "\nid: " + id +
                "\nname: " + name +
                "\nlastName: " + lastName +
                "\ndate: " + date +
                "\nposition: " + position +
                "\n" + playerStatistics;
    }
}

