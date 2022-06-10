package com.revature.beats_ahoy.profile;



import com.revature.beats_ahoy.users.Users;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.*;



@Entity
@Table(name = "profile")
public class Profile {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @OneToOne(optional = false)
    @JoinColumn(name = "username_profile", referencedColumnName = "username")
    private Users usernameProfile;
    private String favoriteGenre;
    private String favoriteSong;
    private String favoriteArtist;
    private String favoriteAlbum;

    public Profile(){

    }
    public Profile(Users usernameProfile, String favoriteGenre, String favoriteAlbum, String favoriteArtist, String favoriteSong){
        this.usernameProfile = usernameProfile;
        this.favoriteAlbum = favoriteAlbum;
        this.favoriteArtist = favoriteArtist;
        this.favoriteGenre = favoriteGenre;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "id='" + id + '\'' +
                ", usernameProfile=" + usernameProfile +
                ", favoriteGenre=" + favoriteGenre +
                ", favoriteSong=" + favoriteSong +
                ", favoriteArtist=" + favoriteArtist +
                ", favoriteAlbum=" + favoriteAlbum +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFavoriteAlbum() {
        return favoriteAlbum;
    }

    public String getFavoriteArtist() {
        return favoriteArtist;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public Users getUsernameProfile() {
        return usernameProfile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFavoriteAlbum(String favoriteAlbum) {
        this.favoriteAlbum = favoriteAlbum;
    }

    public void setFavoriteArtist(String favoriteArtist) {
        this.favoriteArtist = favoriteArtist;
    }

    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public void setUsernameProfile(Users usernameProfile) {
        this.usernameProfile = usernameProfile;
    }
}

