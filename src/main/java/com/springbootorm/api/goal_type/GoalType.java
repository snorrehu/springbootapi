package com.springbootorm.api.goal_type;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GoalType {

    @Id
    private Integer goal_type_id;
    private String type;
    private Boolean active_flag;

    public GoalType(){}

    public GoalType(Integer goal_type_id, String type, boolean active_flag) {
        this.goal_type_id = goal_type_id;
        this.type = type;
        this.active_flag = active_flag;
    }

    public Integer getGoalType_id() {
        return goal_type_id;
    }

    public void setGoalType_id(Integer goal_type_id) {
        this.goal_type_id = goal_type_id;
    }

    public boolean getActivity() {
        return active_flag;
    }

    public void setActivity(Boolean active_flag) {
        this.active_flag = active_flag;
    }

    public String getPerson_id() {
        return type;
    }

    public void setPerson_id(String type) {
        this.type = type;
    }
}
