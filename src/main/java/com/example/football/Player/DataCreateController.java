package com.example.football.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/football")
public class DataCreateController {

    @Autowired
    PlayerDao playerDao;

    @GetMapping("/list")
    public List<Player> getPlayers(){
        return (List<Player>) playerDao.findAll();
    }

    @PostMapping
    public void addPlayer(@RequestBody Player player) {
        playerDao.save(player);
    }
}
