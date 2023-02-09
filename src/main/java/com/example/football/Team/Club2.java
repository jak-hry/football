package com.example.football.Team;

import com.example.football.Player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Club2 {

    //CO DODAĆ:
    //średnia wieku graczy wyjściowej 11, oraz całej drużyny

    //budżet transferowy
    //wartość: 1. podstawowa 11, 2. ławka, 3. rezerwy
    //średnia statystyk pierwszej jedenastki, ławki i rezerw

    //lista graczy w drużynie
    //listy graczy: 1. podstawowa 11, 2. ławce, 3. rezerwy
    //średnia wieku graczy wyjściowej 11, oraz całej drużyny

    //budżet transferowy
    //wartość: 1. podstawowa 11, 2. ławka, 3. rezerwy
    //średnia statystyk pierwszej jedenastki, ławki i rezerw

    private String name;
    private List<Player> players;
    private List<Player> startingLineup;
    private List<Player> bench;
    private List<Player> reserves;

    public Club2(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.startingLineup = new ArrayList<>();
        this.bench = new ArrayList<>();
        this.reserves = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addToStartingLineup(Player player) {
        players.add(player);
        startingLineup.add(player);
    }

    public void addToBench(Player player) {
        players.add(player);
        bench.add(player);
    }

    public void addToReserves(Player player) {
        players.add(player);
        reserves.add(player);
    }

    public void transferPlayers(Club2 otherClub, Player player1, Player player2) {

        //sprawdzanie, czy obaj piłkarze są w posiadają kluby
        if (players.contains(player1) && otherClub.players.contains(player2)) {
            players.remove(player1);
            otherClub.players.remove(player2);
            players.add(player2);
            otherClub.players.add(player1);
            if (startingLineup.contains(player1)) {
                startingLineup.remove(player1);
                startingLineup.add(player2);
            } else if (bench.contains(player1)) {
                bench.remove(player1);
                bench.add(player2);
            } else if (reserves.contains(player1)) {
                reserves.remove(player1);
                reserves.add(player2);
            }
            if (otherClub.startingLineup.contains(player2)) {
                otherClub.startingLineup.remove(player2);
                otherClub.startingLineup.add(player1);
            } else if (otherClub.bench.contains(player2)) {
                otherClub.bench.remove(player2);
                otherClub.bench.add(player1);
            } else if (otherClub.reserves.contains(player2)) {
                otherClub.reserves.remove(player2);
                otherClub.reserves.add(player1);
            } else {
                System.out.println("transfer failed");
            }
        }
    }


    public void getClubWithRole(List<Club2> club) {

        for (int i = 0; i < club.size(); i++) {
            System.out.println("\n" + club.get(i) +
                    "\nFirstSquad: " + startingLineup +
                    "\nReserveBench: " + bench +
                    "\nReserves: " + reserves +
                    "\n");
        }
    }

    public void getSquad() {
        System.out.println(
                "\nClub - " + name +
                        "\nPlayers: " + players +
                        "\nstartingLineup: " + startingLineup +
                        "\nbench: " + bench +
                        "\nreserves: " + reserves);
    }

    @Override
    public String toString() {
        return "Club: " + name +
                "\nplayers: " + players;
    }
}
