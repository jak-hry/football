package com.example.football.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{id}")
    public String player(Model model, @PathVariable("id") int id){
        Optional<Player> player = playerService.getPlayerById(id);
        if (player.isPresent()) {
            Player playerDetail = player.get();
            model.addAttribute("player", playerDetail);
        } else {
            System.out.println("there is no player with this id");
        }
        return "playerDetail";
    }

    @GetMapping("/list")
    public String getPlayers(Model model) {
        Iterable<Player> players = playerService.getAllPlayers();
        model.addAttribute("players", players);
        model.addAttribute("newPlayer", new Player());
        return "playerList";
    }

    @PostMapping("/add-player")
    public String addPlayer(@ModelAttribute Player player) {
        playerService.addPlayer(player);
        return "redirect:/home";
    }
}
