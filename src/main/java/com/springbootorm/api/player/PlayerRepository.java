package com.springbootorm.api.player;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player,Integer> {
    //public List<Player> findByTeamId(String teamid);
}
