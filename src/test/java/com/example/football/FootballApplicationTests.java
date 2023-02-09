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
        Pace pace = new Pace(80, 80);
        Shooting shooting = new Shooting(81, 81, 81, 81, 81, 81);
        Passing passing = new Passing(82, 82, 82, 82, 82, 82);
        Dribbling dribbling = new Dribbling(83, 83, 83, 83, 83, 83);
        Defending defending = new Defending(84, 84, 84, 84, 84, 84);
        Physicality physicality = new Physicality(85, 85, 85, 85);

        PlayerStatistic pS = new PlayerStatistic(pace, shooting, passing, dribbling, defending, physicality);
        LocalDate localDate = LocalDate.of(1988, 8, 21);
        Player player = new Player("newName", "newLastName", localDate, Position.ST, pS);

        //When
        playerDao.save(player);
//        paceDao.save(pace);
//        shootingDao.save(shooting);
//        passingDao.save(passing);
//        dribblingDao.save(dribbling);
//        defendingDao.save(defending);
//        physicalityDao.save(physicality);
//        playerStatisticsDao.save(pS);

        int playerId = player.getId();
//        int pSId = pS.getId();
//        int paceId = pace.getId();
//        int shootingId = shooting.getId();
//        int passingId = passing.getId();
//        int dribblingId = dribbling.getId();
//        int defendingId = defending.getId();
//        int physicalityId = physicality.getId();

        //Then
        try {
            assertNotEquals(0, playerId);
        } finally {
//            paceDao.deleteById(paceId);
//            shootingDao.deleteById(shootingId);
//            passingDao.deleteById(passingId);
//            dribblingDao.deleteById(dribblingId);
//            defendingDao.deleteById(defendingId);
//            physicalityDao.deleteById(physicalityId);
//            playerDao.deleteById(playerId);
//            playerStatisticsDao.deleteById(pSId);
        }

    }

    @Test
    void testAddGK() {

        //Given
        GkStatistics gKS = new GkStatistics(70, 70, 70, 70, 70, 70);
        LocalDate localDate = LocalDate.of(1988, 8, 21);
        GoalKeeper goalKeeper = new GoalKeeper("name", "lastName", localDate, Position.GK, gKS);

        //When
//        gkStatisticsDao.save(gKS);
//        int gKSId = gKS.getId();
        goalKeeperDao.save(goalKeeper);
        int goalKeeperId = goalKeeper.getId();

        //Then
        try {
            assertNotEquals(0, goalKeeperId);
        } finally {
//            goalKeeperDao.deleteById(goalKeeperId);
//            gkStatisticsDao.deleteById(gKSId);
        }
    }

}
