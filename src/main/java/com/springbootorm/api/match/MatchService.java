package com.springbootorm.api.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    //Create
    public void addMatch(Match match){
        matchRepository.save(match);
    }

    //Read all
    public List<Match> getAllMatchs(){
        List<Match> matches = new ArrayList<>();
        matchRepository.findAll().forEach(matches::add);
        return matches;
    }

    //Read one
    public ArrayList<Match> getMatch(Integer id){
        ArrayList<Match> matchList = new ArrayList<>();
        matchList.add(matchRepository.findById(id).get());
        return matchList;
    }

    //Update
    public void updateMatch(Match match, Integer id) {
        matchRepository.save(match);
    }

    //Delete
    public void deleteMatch(Integer id) {
        Match matchToDelete = matchRepository.findById(id).get();
        matchToDelete.setActivity(false);
        updateMatch(matchToDelete,id);
    }

    //Check if exists
    public boolean checkIfExists(Integer id){
        return matchRepository.existsById(id);
    }

}