package com.springbootorm.api.result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class ResultController {

    @Autowired
    private ResultService resultService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/results/match_id={match_id}/team1_id={team_id_1}/team2_id={team_id_2}/team1_score={team1_score}/team2_score={team2_score}")
    public void createResult(@PathVariable("team_id_1") Integer team_id_1, @PathVariable("team_id_2") Integer team_id_2, @PathVariable("team1_score") Integer team1_score,
                             @PathVariable("team2_score") Integer team2_score, @PathVariable("match_id") Integer match_id){
        Result teamResult1 = new Result();
        Result teamResult2 = new Result();

        teamResult1.setMatch_id(match_id);
        teamResult1.setTeam_id(team_id_1);
        teamResult1.setScore(team1_score);

        teamResult2.setMatch_id(match_id);
        teamResult2.setTeam_id(team_id_2);
        teamResult2.setScore(team2_score);

        if(team1_score>team2_score){
            teamResult1.setResult("WIN");
            teamResult2.setResult("LOOSE");
        }
        else if(team2_score>team1_score){
            teamResult1.setResult("LOOSE");
            teamResult2.setResult("WIN");
        }
        else{
            teamResult1.setResult("DRAW");
            teamResult2.setResult("DRAW");
        }

        List<Result> resultList = new ArrayList<>();
        resultList.add(teamResult1);
        resultList.add(teamResult2);
        System.out.println(resultList.toString());
        resultService.addResult(resultList);

    }

    //Request: Read all
    @RequestMapping("/results")
    public List<Result> getAllResults(){
        return resultService.getAllResults();
    }

    //Request: Read one by id
    @RequestMapping("/results/{id}")
    public ArrayList<Result> readResult(@PathVariable Integer id){
        return resultService.getResult(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/results/{id}")
    public void updateResult(@RequestBody Result result, @PathVariable Integer id){
        resultService.updateResult(result,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/results/{id}")
    public void deleteResult(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d= null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Result p = new Result(id, null ,"Undefined", "Undefined", d);
        //resultService.updateResult(p, id);
    }
    
}
