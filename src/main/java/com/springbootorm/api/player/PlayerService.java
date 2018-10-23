package com.springbootorm.api.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    //Create
    public void addPlayer(Player player){
        playerRepository.save(player);
    }

    //Read all
    public List<Player> getAllPlayers(){
        List<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }

    //Read one
    public ArrayList<Player> getPlayer(Integer id){
        ArrayList<Player> playerList = new ArrayList<>();
        playerList.add(playerRepository.findById(id).get());
        return playerList;
    }

    //Update
    public void updatePlayer(Player player, Integer id) {
        playerRepository.save(player);
    }

    //Delete
    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return playerRepository.existsById(id);
    }

}
