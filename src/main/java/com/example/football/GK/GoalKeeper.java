package com.example.football.GK;

import com.example.football.Player.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoalKeeper {

    String name;
    String lastName;
    int age;
    Position position;
    GkStatistics gk;

    @Override
    public String toString() {
        return "\nname: " + name + " " + lastName +
                "\nage: " + age + "\nposition: " + position +
                "\noverall: " + gk.calculateGkOverall() + "\n" + gk;
    }
}
