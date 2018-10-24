package com.springbootorm.api.fav_teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class Fav_teamsController{

        @Autowired
        private Fav_teamsService fav_teamsService;

        //Request: Create
        @RequestMapping(method = RequestMethod.POST, value = "/fav_teamss")
        public void createFav_teams(@RequestBody Fav_teams fav_teams){
            fav_teamsService.addFav_teams(fav_teams);
        }

        //Request: Read all
        @RequestMapping("/fav_teamss")
        public List<Fav_teams> getAllFav_teamss(){
            return fav_teamsService.getAllFav_teamss();
        }


        //Request: Read one by id
        @RequestMapping("/fav_teamss/{id}")
        public ArrayList<Fav_teams> readFav_teams(@PathVariable Integer id){
            return fav_teamsService.getFav_teams(id);
        }

        //Request: Update
        @RequestMapping(method = RequestMethod.PUT, value = "/fav_teamss/{id}")
        public void updateFav_teams(@RequestBody Fav_teams fav_teams, @PathVariable Integer id){
            fav_teamsService.updateFav_teams(fav_teams,id);
        }

        //Request: Delete by id
        @RequestMapping(method = RequestMethod.DELETE, value = "/fav_teamss/{id}")
        public void deleteFav_teams(@PathVariable Integer id){
            fav_teamsService.deleteFav_teams(id);
        }

        //********************************CRUD LE'Special*******************************************************

    /*
    @RequestMapping(method = RequestMethod.GET, value = "/fav_teamss/{id}/matches")
    public void getMatchesInFav_teams(@PathVariable Integer id){
        fav_teamsService.getMatchesInFav_teams(id);
    }
    */
}
