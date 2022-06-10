package com.revature.beats_ahoy.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    private String fname;
    private String lname;
    @Id
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public Users() {
    }

    public Users (String fname, String lname, String username, String password){
        super();
        this.fname=fname;
        this.lname=lname;
        this.username=username;
        this.password=password;
    }

    public Users(String password){
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
