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
public class PlayerStatistic {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private Pace pace;
    @OneToOne(cascade = CascadeType.ALL)
    private Shooting shooting;
    @OneToOne(cascade = CascadeType.ALL)
    private Passing passing;
    @OneToOne(cascade = CascadeType.ALL)
    private Dribbling dribblings;
    @OneToOne(cascade = CascadeType.ALL)
    private Defending defending;
    @OneToOne(cascade = CascadeType.ALL)
    private Physicality physicality;
    @OneToOne(cascade = CascadeType.ALL)
    private GkStatistics gkStatistics;

    public PlayerStatistic(Pace pace, Shooting shooting, Passing passing, Dribbling dribblings, Defending defending, Physicality physicality) {
        this.pace = pace;
        this.shooting = shooting;
        this.passing = passing;
        this.dribblings = dribblings;
        this.defending = defending;
        this.physicality = physicality;
    }

    public PlayerStatistic(GkStatistics gkStatistics) {
    }

    @Override
    public String toString() {
        return "\nstatistics:" + "\n" +
                "\n" + pace + "\n" +
                "\n" + shooting + "\n" +
                "\n" + passing + "\n" +
                "\n" + dribblings + "\n" +
                "\n" + defending + "\n" +
                "\n" + physicality;
    }
}
