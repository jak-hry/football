package com.example.football.Statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Defending {

    int interceptions;
    int headingAccuracy;
    int marking;
    int standingTackle;
    int slidingTackle;

    private int calculateDefending() {
        double result = interceptions * 0.2 + headingAccuracy * 0.1 +
                marking * 0.3 + standingTackle * 0.3 + slidingTackle * 0.1;
        return (result % 1 >= 0.5) ? (int) Math.ceil(result) :
                (int) Math.floor(result);
    }

    @Override
    public String toString() {
        return "Defending - " + calculateDefending() +
                "\ninterceptions: " + interceptions +
                "\nheadingAccuracy: " + headingAccuracy +
                "\nmarking: " + marking +
                "\nstandingTackle: " + standingTackle +
                "\nslidingTackle: " + slidingTackle;
    }
}
