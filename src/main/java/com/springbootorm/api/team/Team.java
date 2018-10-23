package com.springbootorm.api.team;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Team {

    @Id
    private Integer team_id;
    private Integer association_id;
    private Integer coach_id;
    private Integer owner_id;
    private Integer location_id;

    public Team(){}

    public Team(Integer team_id, Integer association_id, Integer coach_id, Integer owener_id,Integer location_id){
        this.team_id = team_id;
        this.association_id = association_id;
        this.coach_id = coach_id;
        this.owner_id = owener_id;
        this.location_id = location_id;
    }


    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public Integer getAssociation_id() {
        return association_id;
    }

    public void setAssociation_id(Integer association_id) {
        this.association_id = association_id;
    }

    public Integer getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(Integer coach_id) {
        this.coach_id = coach_id;
    }

    public Integer geOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }
}
