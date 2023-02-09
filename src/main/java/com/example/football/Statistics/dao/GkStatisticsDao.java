package com.example.football.Statistics.dao;

import com.example.football.Statistics.GkStatistics;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface GkStatisticsDao extends CrudRepository<GkStatistics, Integer> {
}
