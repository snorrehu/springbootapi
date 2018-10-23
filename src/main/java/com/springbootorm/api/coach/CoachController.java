package com.springbootorm.api.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class CoachController {
    @Autowired
    private CoachService coachService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/coachs")
    public void createCoach(@RequestBody Coach coach){
        int i = 0;
        System.out.println("checkIfExists: " + coachService.checkIfExists(i));
        while(coachService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(coachService.checkIfExists(i));
        }
        coach.setCoach_id(i);
        coachService.addCoach(coach);
    }

    //Request: Read all
    @RequestMapping("/coachs")
    public List<Coach> getAllCoachs(){
        return coachService.getAllCoachs();
    }

    //Request: Read one by id
    @RequestMapping("/coachs/{id}")
    public ArrayList<Coach> readCoach(@PathVariable Integer id){
        return coachService.getCoach(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/coachs/{id}")
    public void updateCoach(@RequestBody Coach coach, @PathVariable Integer id){
        coachService.updateCoach(coach,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/coachs/{id}")
    public void deleteCoach(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d= null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Coach p = new Coach(id, null ,"Undefined", "Undefined", d);
        //coachService.updateCoach(p, id);
    }
}
