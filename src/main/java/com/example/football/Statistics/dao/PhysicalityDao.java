package com.example.football.Statistics.dao;

import com.example.football.Statistics.Physicality;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalityDao extends CrudRepository<Physicality, Integer> {
}
