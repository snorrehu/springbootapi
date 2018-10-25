package com.springbootorm.api.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/players")
    public void createPlayer(@RequestBody Player player){
        int i = 0;
        System.out.println("checkIfExists: " + playerService.checkIfExists(i));
        while(playerService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(playerService.checkIfExists(i));
        }
        player.setPlayer_id(i);
        playerService.addPlayer(player);
    }

    //Request: Read all
    @RequestMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    //Request: Read one by id
    @RequestMapping("/players/{id}")
    public ArrayList<Player> readPlayer(@PathVariable Integer id){
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
