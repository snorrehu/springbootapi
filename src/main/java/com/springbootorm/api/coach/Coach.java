package com.springbootorm.api.coach;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coach {

    @Id
    private Integer coach_id;

    private Integer person_id;

    public Coach(){}

    public Coach(Integer coach_id, Integer person_id) {
        this.coach_id = coach_id;
        this.person_id = person_id;
    }

    public Integer getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(Integer coach_id) {
        this.coach_id = coach_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }
}
