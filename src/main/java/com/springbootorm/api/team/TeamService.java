package com.springbootorm.api.team;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public void addTeam(Team team) {
        teamRepository.save(team);
    }

    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        teamRepository.findAll().forEach(teams::add);
        return teams;
    }

    //Read one
    public ArrayList<Team> getTeam(Integer id){
        ArrayList<Team> teamList = new ArrayList<>();
        teamList.add(teamRepository.findById(id).get());
        return teamList;
    }

    //Update
    public void updateTeam(Team team, Integer id) {
        teamRepository.save(team);
    }

    public void deleteTeam(Integer id) {
        Team teamToDelete = teamRepository.findById(id).get();
        teamToDelete.setActivity(false);
        updateTeam(teamToDelete,id);    
    }
}
