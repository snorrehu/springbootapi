package com.springbootorm.api.fav_team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fav_teamService {
    @Autowired
    private Fav_teamRepository fav_teamRepository;

    public void addFav_team(Fav_team fav_team) {
        fav_teamRepository.save(fav_team);
    }

    public List<Fav_team> getAllFav_teams() {
        List<Fav_team> fav_teams = new ArrayList<>();
        fav_teamRepository.findAll().forEach(fav_teams::add);
        return fav_teams;
    }

    //Read one
    public ArrayList<Fav_team> getFav_team(Integer id){
        ArrayList<Fav_team> fav_teamsList = new ArrayList<>();
        fav_teamsList.add(fav_teamRepository.findById(id).get());
        return fav_teamsList;
    }

    //Update
    public void updateFav_team(Fav_team fav_team, Integer id) {
        fav_teamRepository.save(fav_team);
    }

    public void deleteFav_team(Integer id) {
        Fav_team fav_teamToDelete = fav_teamRepository.findById(id).get();
        fav_teamToDelete.setActivity(false);
        updateFav_team(fav_teamToDelete,id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return fav_teamRepository.existsById(id);
    }

}
