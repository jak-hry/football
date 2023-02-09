package com.example.football.Team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Club {

    private String name;
    @Override
    public String toString() {
        return name + " ";
    }
}
