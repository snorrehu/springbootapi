package com.springbootorm.api.fav_teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fav_teamsService {
    @Autowired
    private Fav_teamsRepository fav_teamsRepository;

    public void addFav_teams(Fav_teams fav_teams) {
        fav_teamsRepository.save(fav_teams);
    }

    public List<Fav_teams> getAllFav_teamss() {
        List<Fav_teams> fav_teamss = new ArrayList<>();
        fav_teamsRepository.findAll().forEach(fav_teamss::add);
        return fav_teamss;
    }

    //Read one
    public ArrayList<Fav_teams> getFav_teams(Integer id){
        ArrayList<Fav_teams> fav_teamsList = new ArrayList<>();
        fav_teamsList.add(fav_teamsRepository.findById(id).get());
        return fav_teamsList;
    }

    //Update
    public void updateFav_teams(Fav_teams fav_teams, Integer id) {
        fav_teamsRepository.save(fav_teams);
    }

    public void deleteFav_teams(Integer id) {
        fav_teamsRepository.deleteById(id);
    }

}
