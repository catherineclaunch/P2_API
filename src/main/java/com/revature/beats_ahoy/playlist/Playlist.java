package com.revature.beats_ahoy.playlist;


import com.revature.beats_ahoy.users.Users;

import javax.persistence.*;

@Entity
@Table(name = "playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String id;
    @ManyToOne
    private Users usernamePlaylist;
    private String url;
    private String fieldOne;
    private String fieldTwo;
    private String fieldThree;
    private String fieldFour;
    private String fieldFive;
    private String fieldSix;

    public Playlist(){

    }

    public Playlist(Users usernamePlaylist, String url, String fieldOne, String fieldTwo,String fieldThree,String fieldFour,String fieldFive,String fieldSix){
        this.usernamePlaylist = usernamePlaylist;
        this.url =url;
        this.fieldOne=fieldOne;
        this.fieldTwo=fieldTwo;
        this.fieldThree=fieldThree;
        this.fieldFour=fieldFour;
        this.fieldFive=fieldFive;
        this.fieldSix=fieldSix;
    }

    public Users getUsernamePlaylist() {
        return usernamePlaylist;
    }

    public String getFieldFive() {
        return fieldFive;
    }

    public String getFieldFour() {
        return fieldFour;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public String getFieldSix() {
        return fieldSix;
    }

    public String getFieldThree() {
        return fieldThree;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUsernamePlaylist(Users usernamePlaylist) {
        this.usernamePlaylist = usernamePlaylist;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFieldFive(String fieldFive) {
        this.fieldFive = fieldFive;
    }

    public void setFieldFour(String fieldFour) {
        this.fieldFour = fieldFour;
    }

    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public void setFieldSix(String fieldSix) {
        this.fieldSix = fieldSix;
    }

    public void setFieldThree(String fieldThree) {
        this.fieldThree = fieldThree;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
