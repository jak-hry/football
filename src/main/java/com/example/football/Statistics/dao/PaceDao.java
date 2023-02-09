package com.example.football.Statistics.dao;

import com.example.football.Statistics.Pace;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaceDao extends CrudRepository<Pace, Integer> {
}
