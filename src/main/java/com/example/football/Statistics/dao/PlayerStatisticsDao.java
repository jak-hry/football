package com.example.football.Statistics.dao;

import com.example.football.Statistics.PlayerStatistic;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface PlayerStatisticsDao extends CrudRepository<PlayerStatistic, Integer> {
}
