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
        boolean IdGenerator = true;
        while(IdGenerator){
        int i = 0;
        try {
            player.setPerson_id(i);
            playerService.addPlayer(player);
            IdGenerator = false;
        } catch (Exception e) {
            i++;
        }
    }
    }

    //Request: Read all
    @RequestMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    //Request: Read one by id
    @RequestMapping("/players/{id}")
    public Player readPlayer(@PathVariable Integer id){
        return playerService.getPlayer(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/players/{id}")
    public void updatePlayer(@RequestBody Player player, @PathVariable Integer id){
        playerService.updatePlayer(player,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/players/{id}")
    public void deletePlayer(@PathVariable Integer id){
        playerService.deletePlayer(id);
    }

}
