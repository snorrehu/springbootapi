package com.springbootorm.api.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

    @Id
    private Integer contact_id;

    private Integer person_id;
    private String contact_type;
    private String contact_detail;

    public Contact(){}


    public Contact(Integer contact_id, Integer person_id, String contact_type, String contact_detail) {
        this.contact_id = contact_id;
        this.person_id = person_id;
        this.contact_type = contact_type;
        this.contact_detail = contact_detail;
    }

    public Integer getContact_id() {
        return contact_id;
    }

    public void setContact_id(Integer contact_id) {
        this.contact_id = contact_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getContact_type() {
        return contact_type;
    }

    public void setContact_type(String contact_type) {
        this.contact_type = contact_type;
    }

    public String getContact_detail() {
        return contact_detail;
    }

    public void setContact_detail(String contact_detail) {
        this.contact_detail = contact_detail;
    }
}
