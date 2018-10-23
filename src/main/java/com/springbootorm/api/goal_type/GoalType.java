package com.springbootorm.api.goal_type;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GoalType {

    @Id
    private Integer goal_type_id;
    private String type;

    public GoalType(){}

    public GoalType(Integer goal_type_id, String type) {
        this.goal_type_id = goal_type_id;
        this.type = type;
    }

    public Integer getGoalType_id() {
        return goal_type_id;
    }

    public void setGoalType_id(Integer goal_type_id) {
        this.goal_type_id = goal_type_id;
    }

    public String getPerson_id() {
        return type;
    }

    public void setPerson_id(String type) {
        this.type = type;
    }
}
