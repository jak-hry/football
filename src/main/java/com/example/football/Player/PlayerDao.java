package com.example.football.Player;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface PlayerDao extends CrudRepository<Player, Integer> {
}
