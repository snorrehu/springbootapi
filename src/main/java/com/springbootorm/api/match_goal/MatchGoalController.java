package com.springbootorm.api.match_goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class MatchGoalController {

    @Autowired
    private MatchGoalService matchGoalService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/matchGoals")
    public void createMatchGoal(@RequestBody MatchGoal matchGoal){
        int i = 0;
        System.out.println("checkIfExists: " + matchGoalService.checkIfExists(i));
        while(matchGoalService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(matchGoalService.checkIfExists(i));
        }
        matchGoal.setMatchGoal_id(i);
        matchGoalService.addMatchGoal(matchGoal);
    }

    //Request: Read all
    @RequestMapping("/matchGoals")
    public List<MatchGoal> getAllMatchGoals(){
        return matchGoalService.getAllMatchGoals();
    }

    //Request: Read one by id
    @RequestMapping("/matchGoals/{id}")
    public ArrayList<MatchGoal> readMatchGoal(@PathVariable Integer id){
        return matchGoalService.getMatchGoal(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/matchGoals/{id}")
    public void updateMatchGoal(@RequestBody MatchGoal matchGoal, @PathVariable Integer id){
        matchGoalService.updateMatchGoals(matchGoal,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/matchGoals/{id}")
    public void deleteMatchGoal(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d = null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
