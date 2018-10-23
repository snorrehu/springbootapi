package com.springbootorm.api.owner;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Owner {

    @Id
    private Integer owner_id;

    private Integer person_id;

    public Owner(){}

    public Owner(Integer owner_id, Integer person_id) {
        this.owner_id = owner_id;
        this.person_id = person_id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }
}
