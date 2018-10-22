package com.springbootorm.api.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/players")
    public void createPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
    }

    //Request: Read all
    @RequestMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    //Request: Read one by id
    @RequestMapping("/players/{id}")
    public Player readPlayer(@PathVariable int id){
        return playerService.getPlayer(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/players/{id}")
    public void updatePlayer(@RequestBody Player player, @PathVariable int id){
        playerService.updatePlayer(player,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/players/{id}")
    public void deletePlayer(@PathVariable int id){
        playerService.deletePlayer(id);
    }

}
