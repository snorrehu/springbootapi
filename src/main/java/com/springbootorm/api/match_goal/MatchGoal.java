package com.springbootorm.api.match_goal;

import javax.persistence.*;

@Entity
public class MatchGoal {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goal_id;
    private Integer player_id;
    private Integer goal_type_id;
    private Integer match_id;
    private String description;

    public MatchGoal() {

    }
    public MatchGoal(Integer goal_id, Integer player_id, Integer goal_type_id, Integer match_id, String description) {
        this.goal_id = goal_id;
        this.player_id = player_id;
        this.goal_type_id = goal_type_id;
        this.match_id = match_id;
        this.description = description;
    }

    public Integer getMatchGoal_id() {
        return goal_id;
    }

    public void setMatchGoal_id(Integer goal_id) {
        this.goal_id = goal_id;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getGoal_type_id() {
        return goal_type_id;
    }

    public void setGoal_type_id(Integer goal_type_id) {
        this.goal_type_id = goal_type_id;
    }

    public Integer getMatch_Id() {
        return match_id;
    }

    public void setMatch_Id(Integer match_id) {
        this.match_id = match_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
