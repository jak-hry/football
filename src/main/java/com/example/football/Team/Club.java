package com.example.football.Team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Club {

    private String name;

    //lista graczy w drużynie
    //listy graczy: 1. podstawowa 11, 2. ławce, 3. rezerwy
    //średnia wieku graczy wyjściowej 11, oraz całej drużyny

    //budżet transferowy
    //wartość: 1. podstawowa 11, 2. ławka, 3. rezerwy
    //średnia statystyk pierwszej jedenastki, ławki i rezerw


    @Override
    public String toString() {
        return name + " ";
    }
}
