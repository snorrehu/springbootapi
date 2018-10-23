package com.springbootorm.api.season;


import com.springbootorm.api.match.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    public void addSeason(Season season) {
        seasonRepository.save(season);
    }

    public List<Season> getAllSeasons() {
        List<Season> seasons = new ArrayList<>();
        seasonRepository.findAll().forEach(seasons::add);
        return seasons;
    }

    //Read one
    public ArrayList<Season> getSeason(Integer id){
        ArrayList<Season> seasonList = new ArrayList<>();
        seasonList.add(seasonRepository.findById(id).get());
        return seasonList;
    }

    //Update
    public void updateSeason(Season season, Integer id) {
        seasonRepository.save(season);
    }

    public void deleteSeason(Integer id) {
        seasonRepository.deleteById(id);
    }

    public List<Match> getMatchesInSeason(Integer seasonId){
        return seasonRepository.findBySeason_id(seasonId);
    }
}
