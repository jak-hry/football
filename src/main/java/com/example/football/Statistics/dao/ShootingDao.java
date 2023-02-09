package com.example.football.Statistics.dao;

import com.example.football.Statistics.Shooting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShootingDao extends CrudRepository<Shooting, Integer> {
}
