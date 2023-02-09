package com.example.football.Player;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValueCalculator {

    private Player player;

    public int calculateValue(Player player) {

        switch (player.getPosition()) {
            case GK:
                return 1;
            case CB:
                return 2;
            case LB, LWB, RB, RWB:
                return 3;
            case CDM:
                return 4;
            case CM:
                return 5;
            case CAM, RM, RW, RF, LM, LW, LF, CF:
                return 6;
            case ST:
                return 7;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "ValueCalculator" +
                "\nplayer: " + player.getName() + " " + player.getLastName() +
                "\nvalue: " + calculateValue(player);
    }
}
