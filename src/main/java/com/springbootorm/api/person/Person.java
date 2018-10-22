package com.springbootorm.api.person;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {

    @Id
    private Integer person_id;

    private String address_id;
    private String first_name;
    private String last_name;
    private Date date_of_birth;

    public Person(){};

    public Person(Integer person_id, String address_id, String first_name, String last_name, Date date_of_birth) {
        this.person_id = person_id;
        this.address_id = address_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
