package com.example.football;

import com.example.football.Player.Player;
import com.example.football.Player.PlayerDao;
import com.example.football.Player.Position;
import com.example.football.Statistics.*;
import com.example.football.Statistics.dao.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class FootballApplicationTests {

    @Autowired
    PlayerDao playerDao;
    @Autowired
    DribblingDao dribblingDao;
    @Autowired
    PaceDao paceDao;
    @Autowired
    PhysicalityDao physicalityDao;
    @Autowired
    ShootingDao shootingDao;
    @Autowired
    PassingDao passingDao;
    @Autowired
    DefendingDao defendingDao;
    @Autowired
    PlayerStatisticsDao playerStatisticsDao;
    @Autowired
    GkStatisticsDao gkStatisticsDao;
    @Autowired
    GoalKeeperDao goalKeeperDao;

    @Test
    void testAddPlayer() {

        //Given
        Pace pace = new Pace(76, 75);
        Shooting shooting = new Shooting(94, 94, 91, 84, 89, 90);
        Passing passing = new Passing(81, 71, 85, 84, 70, 79);
        Dribbling dribbling = new Dribbling(77, 82, 93, 89, 85, 88);
        Defending defending = new Defending(49, 91, 35, 42, 19);
        Physicality physicality = new Physicality(85, 76, 87, 81);

        PlayerStatistic pS = new PlayerStatistic(pace, shooting, passing, dribbling, defending, physicality);
        LocalDate localDate = LocalDate.of(1988, 8, 21);
        Player player = new Player("Robert", "Lewandowski", localDate, Position.ST, pS);

        //When
        playerDao.save(player);
        int playerId = player.getId();

        //Then
        try {
            assertNotEquals(0, playerId);
        } finally {
//            playerDao.deleteById(playerId);
        }

    }

    @Test
    void testGetList() {

        //Given
        Iterable<Player> playerList = playerDao.findAll();

        //When
        int counter = 0;
        for (Player list : playerList) {
            System.out.println(list);
            counter++;
        }
        int size = counter;

        //Then
        assertEquals(1, size);
    }

    @Test
    void testAddGK() {

        //Given
        GkStatistics gKS = new GkStatistics(70, 70, 70, 70, 70, 70);
        LocalDate localDate = LocalDate.of(1988, 8, 21);
        GoalKeeper goalKeeper = new GoalKeeper("name", "lastName", localDate, Position.GK, gKS);

        //When
        gkStatisticsDao.save(gKS);
        int gKSId = gKS.getId();
        goalKeeperDao.save(goalKeeper);
        int goalKeeperId = goalKeeper.getId();

        //Then
        try {
            assertNotEquals(0, goalKeeperId);
        } finally {
            goalKeeperDao.deleteById(goalKeeperId);
            gkStatisticsDao.deleteById(gKSId);
        }
    }

}
