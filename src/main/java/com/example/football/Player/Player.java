package com.example.football.Player;

import com.example.football.Statistics.PlayerStatistic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    String name;
    String lastName;
    int age;
    Position position;
    PlayerStatistic playerStatistics;

    public String getPlayerInfo() {
        return "\nname: " + name + " " + lastName +
                "\nage: " + age + "\nposition: " + position +
                "\noverall: " + playerStatistics.calculateOverall(position) + "\n" + playerStatistics;
    }

    public String getOverall() {
        return "\nposition - " + position +
                "\noverall: " + playerStatistics.calculateOverall(position);
    }

    @Override
    public String toString() {
        return " " + name + " " + lastName + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

