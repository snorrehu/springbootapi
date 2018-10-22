package com.springbootorm.api.season;

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

    public Season getSeason(Integer id) {
        return seasonRepository.findById(id).get();
    }

    //Update
    public void updateSeason(Season season, Integer id) {
        seasonRepository.save(season);
    }

    public void deleteSeason(Integer id) {
        seasonRepository.deleteById(id);
    }
}
