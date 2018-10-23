package com.springbootorm.api.goal_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class GoalTypeController {

    @Autowired
    private GoalTypeService goalTypeService;

    //Request: Create
    @RequestMapping(method = RequestMethod.POST, value = "/goalTypes")
    public void createGoalType(@RequestBody GoalType goalType){
        int i = 0;
        System.out.println("checkIfExists: " + goalTypeService.checkIfExists(i));
        while(goalTypeService.checkIfExists(i)){
            i++;
            System.out.println(i);
            System.out.println(goalTypeService.checkIfExists(i));
        }
        goalType.setGoalType_id(i);
        goalTypeService.addGoalType(goalType);
    }

    //Request: Read all
    @RequestMapping("/goalTypes")
    public List<GoalType> getAllGoalTypes(){
        return goalTypeService.getAllGoalTypes();
    }

    //Request: Read one by id
    @RequestMapping("/goalTypes/{id}")
    public ArrayList<GoalType> readGoalType(@PathVariable Integer id){
        return goalTypeService.getGoalType(id);
    }

    //Request: Update
    @RequestMapping(method = RequestMethod.PUT, value = "/goalTypes/{id}")
    public void updateGoalType(@RequestBody GoalType goalType, @PathVariable Integer id){
        goalTypeService.updateGoalType(goalType,id);
    }

    //Request: Delete by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/goalTypes/{id}")
    public void deleteGoalType(@PathVariable Integer id){

        String sDate1="1111-11-11";
        Date d= null;

        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //GoalType p = new GoalType(id, null ,"Undefined", "Undefined", d);
        //goalTypeService.updateGoalType(p, id);
    }
}
