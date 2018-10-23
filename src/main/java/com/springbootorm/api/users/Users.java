package com.springbootorm.api.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    private Integer user_id;

    private String user_name;
    private String password;
    private boolean admin_flag;

    public Users(){}

    public Users(Integer user_id, String user_name, String password, boolean admin_flag) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.admin_flag = admin_flag;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin_flag() {
        return admin_flag;
    }

    public void setAdmin_flag(boolean admin_flag) {
        this.admin_flag = admin_flag;
    }
}
