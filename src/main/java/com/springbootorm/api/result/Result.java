package com.springbootorm.api.result;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {

    @Id
    private Integer match_id;

    private Integer team_id;
    private String result;
    private Integer score;

    public Result(){}

    public Result(Integer match_id, Integer team_id, String result, Integer score) {
        this.match_id = match_id;
        this.team_id = team_id;
        this.result = result;
        this.score = score;
    }

    public Integer getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Integer match_id) {
        this.match_id = match_id;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer team_id) {
        this.team_id = team_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
