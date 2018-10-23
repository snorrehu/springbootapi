package com.springbootorm.api.location;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    private Integer location_id;
    private Integer address_id;
    private String name;
    private String description;

    public Location(){}

    public Location(Integer location_id, Integer address_id, String name ,String description){
        this.location_id = location_id;
        this.address_id = address_id;
        this.name = name;
        this.description = description;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
