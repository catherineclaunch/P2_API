package com.revature.beats_ahoy.profile;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Table(name = "profile")
public class Profile {
    @Id
    private int id;

    private String favorite_genre;

    private String favorite_song;
    private String favorite_artist;
    private String favorite_album;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "username", referencedColumnName = "username")
    private String username;

    private String dob;



    public Trainer(String fname, String lname, String email, String password, String dob) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

    public Trainer(String password){
        this.password = password;
    }

    public Trainer() {

    }

    // Getters & Setters
    public String getFname() {
        return fname;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }


}

