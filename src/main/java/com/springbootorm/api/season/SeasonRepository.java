package com.springbootorm.api.season;


import com.springbootorm.api.match.Match;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SeasonRepository extends CrudRepository<Season,Integer> {
    public List<Match> findBySeason_id(Integer seasonId);
}
