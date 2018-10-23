package com.springbootorm.api.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/teams")
    public void createTeam(@RequestBody Team team){
        teamService.addTeam(team);
    }

    //Request: Read all
    @RequestMapping("/teams")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }
    

    //Request: Read one by id
    @RequestMapping("/teams/{id}")
    public ArrayList<Team> readTeam(@PathVariable Integer id){
        return teamService.getTeam(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/teams/{id}")
    public void updateTeam(@RequestBody Team team, @PathVariable Integer id){
        teamService.updateTeam(team,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/teams/{id}")
    public void deleteTeam(@PathVariable Integer id){
        teamService.deleteTeam(id);
    }

}
