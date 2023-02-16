package com.example.football;

import com.example.football.Player.Player;
import com.example.football.Player.PlayerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ControllerTests {

    @Autowired
    private PlayerService playerService;

    @Test
    void getPlayerByIdTes(){

        //Given
        Optional<Player> data = playerService.getPlayerById(2);

        //When
        if (data.isPresent()) {
            System.out.println(data);
        } else {
            System.out.println("nie ma piłkarza z takim id");
        }

        //Then
    }
}
