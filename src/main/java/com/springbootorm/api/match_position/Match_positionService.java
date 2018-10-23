package com.springbootorm.api.match_position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Match_positionService {

    @Autowired
    private Match_positionRepository match_positionRepository;

    //Create
    public void addMatch_position(Match_position match_position){
        match_positionRepository.save(match_position);
    }

    //Read all
    public List<Match_position> getAllMatch_positions(){
        List<Match_position> match_positions = new ArrayList<>();
        match_positionRepository.findAll().forEach(match_positions::add);
        return match_positions;
    }

    //Read one
    public ArrayList<Match_position> getMatch_position(Integer id){
        ArrayList<Match_position> match_positionList = new ArrayList<>();
        match_positionList.add(match_positionRepository.findById(id).get());
        return match_positionList;
    }

    //Update
    public void updateMatch_position(Match_position match_position, Integer id) {
        match_positionRepository.save(match_position);
    }

    //Delete
    public void deleteMatch_position(Integer id) {
        match_positionRepository.deleteById(id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return match_positionRepository.existsById(id);
    }
    
}
