package com.springbootorm.api.match_position;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match_position {

    @Id
    private Integer player_id;

    private Integer match_id;
    private String position;

    public Match_position(){}

    public Match_position(Integer player_id, Integer match_id, String position) {
        this.player_id = player_id;
        this.match_id = match_id;
        this.position = position;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Integer match_id) {
        this.match_id = match_id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
