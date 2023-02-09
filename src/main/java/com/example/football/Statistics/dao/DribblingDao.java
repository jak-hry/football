package com.example.football.Statistics.dao;

import com.example.football.Statistics.Dribbling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DribblingDao extends CrudRepository<Dribbling, Integer> {
}
