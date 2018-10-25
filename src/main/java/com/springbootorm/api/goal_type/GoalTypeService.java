package com.springbootorm.api.goal_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoalTypeService {

    @Autowired
    private GoalTypeRepository goalTypeRepository;

    //Create
    public void addGoalType(GoalType goalType){
        goalTypeRepository.save(goalType);
    }

    //Read all
    public List<GoalType> getAllGoalTypes(){
        List<GoalType> goalTypes = new ArrayList<>();
        goalTypeRepository.findAll().forEach(goalTypes::add);
        return goalTypes;
    }

    //Read one
    public ArrayList<GoalType> getGoalType(Integer id){
        ArrayList<GoalType> goalTypeList = new ArrayList<>();
        goalTypeList.add(goalTypeRepository.findById(id).get());
        return goalTypeList;
    }

    //Update
    public void updateGoalType(GoalType goalType, Integer id) {
        goalTypeRepository.save(goalType);
    }

    //Delete
    public void deleteGoalType(Integer id) {
        GoalType goalTypeToDelete = goalTypeRepository.findById(id).get();
        goalTypeToDelete.setActivity(false);
        updateGoalType(goalTypeToDelete,id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return goalTypeRepository.existsById(id);
    }
    
}
