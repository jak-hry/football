package com.example.football;

import com.example.football.GK.GkStatistics;
import com.example.football.GK.GoalKeeper;
import com.example.football.Player.Player;
import com.example.football.Player.Position;
import com.example.football.Statistics.*;

public class Application {

    public static void main(String[] args) {

        Player statsLewandowski = new Player("Robert", "Lewandowski", 34, Position.ST, (new PlayerStatistic(
                new Pace(76, 75),
                new Shooting(94, 94, 91, 84, 89, 90),
                new Passing(81, 71, 85, 84, 70, 79),
                new Dribbling(77, 82, 93, 89, 85, 88),
                new Defending(49, 91, 35, 42, 19),
                new Physicality(85, 76, 87, 81))));

        Player statsRashford = new Player("Marcus", "Rashford", 25, Position.LM, new PlayerStatistic(
                new Pace(86, 93),
                new Shooting(83, 83, 92, 81, 73, 84),
                new Passing(81, 80, 76, 80, 71, 83),
                new Dribbling(84, 75, 84, 84, 86, 86),
                new Defending(42, 68, 45, 38, 33),
                new Physicality(74, 86, 75, 73)));

        Player statsTestLewy = new Player("test", "test", 34, Position.ST, (new PlayerStatistic(
                new Pace(76, 75),
                new Shooting(94, 94, 91, 84, 89, 90),
                new Passing(81, 71, 85, 84, 70, 79),
                new Dribbling(77, 82, 93, 89, 85, 88),
                new Defending(49, 91, 35, 42, 19),
                new Physicality(85, 76, 87, 81))));

        GoalKeeper statsSzczesny = new GoalKeeper("Wojciech", "Szczesny", 32, Position.GK, new GkStatistics(
                86, 88, 82, 82, 73, 87));


        System.out.println(statsLewandowski.getOverall());
//        System.out.println(statsRashford);
//        System.out.println(statsSzczesny);

//        List<Club> list = new ArrayList<>();
//        list.add(barcelona);
//        list.add(juventus);
//
//        ClubRepository barca = new ClubRepository(barcelona);
//
//        barca.addPlayer(statsLewandowski);
//        barca.reserves.add(statsLewandowski);
//
//        clubRepository.makeRole(statsLewandowski, ClubRole.FIRST_SQUAD);
//        clubRepository.makeRole(statsRashford,  ClubRole.BENCH);
//        clubRepository.makeRole(statsTest, ClubRole.BENCH);
//
//        barca.getClubWithRole(list);
//
//        barca.playerForPlayerTransfer(statsLewandowski, statsRashford);
//
//        barca.getClubWithRole(list);
//
//        Club2 psg = new Club2("PSG");
//        psg.addToStartingLineup(statsLewandowski);
//        psg.addToStartingLineup(statsTest);
//
//        Club2 nicea = new Club2("Nicea");
//        nicea.addToBench(statsRashford);

//        psg.getSquad();
//        nicea.getSquad();
//        System.out.println("---------------------------------------------------------------");
//
//        nicea.transferPlayers(psg, statsRashford, statsLewandowski);
//
//        psg.getSquad();
//        nicea.getSquad();

//        List<Club2> list = new ArrayList<>();
//        list.add(psg);
//        list.add(nicea);
//
//        Club2 club2 = new Club2();
//        club2.getClubWithRole(list);

    }
}
