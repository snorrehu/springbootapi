package com.springbootorm.api.fav_teams;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fav_teams {

    @Id
    private Integer user_id;

    private Integer team_id;

    public Fav_teams(){}

    public Fav_teams(Integer user_id, Integer team_id) {
        this.user_id = user_id;
        this.team_id = team_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }
}
