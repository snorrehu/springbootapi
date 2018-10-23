package com.springbootorm.api.match_position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class Match_positionController {

    @Autowired
    private Match_positionService match_positionService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/match_positions")
    public void createMatch_position(@RequestBody Match_position match_position){
        int i = 0;
        System.out.println("checkIfExists: " + match_positionService.checkIfExists(i));
        while(match_positionService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(match_positionService.checkIfExists(i));
        }
        match_positionService.addMatch_position(match_position);
    }

    //Request: Read all
    @RequestMapping("/match_positions")
    public List<Match_position> getAllMatch_positions(){
        return match_positionService.getAllMatch_positions();
    }

    //Request: Read one by id
    @RequestMapping("/match_positions/{id}")
    public ArrayList<Match_position> readMatch_position(@PathVariable Integer id){
        return match_positionService.getMatch_position(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/match_positions/{id}")
    public void updateMatch_position(@RequestBody Match_position match_position, @PathVariable Integer id){
        match_positionService.updateMatch_position(match_position,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/match_positions/{id}")
    public void deleteMatch_position(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d= null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Match_position p = new Match_position(id, null ,"Undefined", "Undefined", d);
        //match_positionService.updateMatch_position(p, id);
    }
}
