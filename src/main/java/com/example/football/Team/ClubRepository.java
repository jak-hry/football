package com.example.football.Team;

import com.example.football.Player.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ClubRepository {

    Club name;
     List<Player> players;

     public ArrayList<Player> firstSquad;
     public ArrayList<Player> bench;
     public ArrayList<Player> reserves;

    public ClubRepository(Club name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.firstSquad = new ArrayList<>();
        this.bench = new ArrayList<>();
        this.reserves = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void makeRole(Player player, ClubRole clubRole) {

        switch (clubRole) {
            case FIRST_SQUAD:
                firstSquad.add(player);
                System.out.println("player " + player.getName() + " " + player.getLastName() + " is added to " + clubRole);
                break;
            case BENCH:
                bench.add(player);
                System.out.println("player " + player.getName() + " " + player.getLastName() + " is added to " + clubRole);
                break;
            case RESERVES:
                reserves.add(player);
                System.out.println("player " + player.getName() + " " + player.getLastName() + " is added to " + clubRole);
                break;
            default:
                System.out.println("badly " + "player " + player.getName() + " " + player.getLastName() + " has not been added");
                break;
        }
    }

    public void playerForPlayerTransfer(Player player1, Player player2) {

//        //if (!(player1.getClub().equals(player2.getClub()))) {
//
//
//            if (firstSquad.contains(player1)) {
//                Player value = firstSquad.get(0);
//                firstSquad.remove(player1);
//
//                if (bench.contains(player2)) {
//                    Player value2 = bench.get(1);
//                    bench.remove(player2);
//
//                    if (player1.getPosition().equals(player2.getPosition())) {
//
//                    }
//
//                    bench.add(value2);
//                    bench.add(value);
//                }
//
//                System.out.println("transfer udany\n");
//            }
//        } else {
//            System.out.println("sa z tego samego klubu");
//        }
    }

    public void getClubWithRole(List<Club> club) {

        for (int i = 0; i < club.size(); i++) {

            System.out.println("Club: " + club.get(i) +
                    "\nFirstSquad: " + firstSquad//.get(i)
                    +"\nReserveBench: " + bench//.get(i) +
                    +"\nReserves: " + reserves//.get(i) +
                    +"\n");
        }
    }

    public String toString() {
        return "Club Repository " +
                "\nFirstSquad " +
                "\nReserveBench " + bench +
                "\nReserves " + reserves;
    }
}
