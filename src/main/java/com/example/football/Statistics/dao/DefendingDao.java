package com.example.football.Statistics.dao;

import com.example.football.Statistics.Defending;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefendingDao extends CrudRepository<Defending, Integer> {
}
