package com.springbootorm.api.season;

import org.springframework.data.repository.CrudRepository;

public interface SeasonRepository extends CrudRepository<Season,Integer> {
    //public List<Season> findByTeamId(String teamid);
}
