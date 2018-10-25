package com.springbootorm.api.match_goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchGoalService {

    @Autowired
    private MatchGoalRepository matchGoalsRepository;

    //Create
    public void addMatchGoal(MatchGoal matchGoals) {
        matchGoalsRepository.save(matchGoals);
    }

    //Read all
    public List<MatchGoal> getAllMatchGoals(){
        List<MatchGoal> matchGoalses = new ArrayList<>();
        matchGoalsRepository.findAll().forEach(matchGoalses::add);
        return matchGoalses;
    }

    //Read one
    public ArrayList<MatchGoal> getMatchGoal(Integer id){
        ArrayList<MatchGoal> matchGoalsList = new ArrayList<>();
        matchGoalsList.add(matchGoalsRepository.findById(id).get());
        return matchGoalsList;
    }

    //Update
    public void updateMatchGoal(MatchGoal matchGoals, Integer id) {
        matchGoalsRepository.save(matchGoals);
    }

    //Delete
    public void deleteMatchGoal(Integer id) {
        MatchGoal matchGoalToDelete = matchGoalsRepository.findById(id).get();
        matchGoalToDelete.setActivity(false);
        updateMatchGoal(matchGoalToDelete,id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return matchGoalsRepository.existsById(id);
    }

}