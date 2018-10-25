package com.springbootorm.api.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoachService {
    @Autowired
    private CoachRepository coachRepository;

    //Create
    public void addCoach(Coach coach){
        coachRepository.save(coach);
    }

    //Read all
    public List<Coach> getAllCoachs(){
        List<Coach> coachs = new ArrayList<>();
        coachRepository.findAll().forEach(coachs::add);
        return coachs;
    }

    //Read one
    public ArrayList<Coach> getCoach(Integer id){
        ArrayList<Coach> coachList = new ArrayList<>();
        coachList.add(coachRepository.findById(id).get());
        return coachList;
    }

    //Update
    public void updateCoach(Coach coach, Integer id) {
        coachRepository.save(coach);
    }

    //Delete
    public void deleteCoach(Integer id) {
        Coach coachToDelete = coachRepository.findById(id).get();
        coachToDelete.setActivity(false);
        updateCoach(coachToDelete,id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return coachRepository.existsById(id);
    }
}
