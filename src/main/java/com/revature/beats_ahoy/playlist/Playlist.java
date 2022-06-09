package com.revature.beats_ahoy.playlist;


import javax.persistence.*;
import java.util.Objects;

    @Entity
    @Table(name = "playlist")
    public class Playlist {

        @Id
        //@Column(name = "pokemon_name")
        private int id;
        @ManyToOne(optional = false)
        @JoinColumn(name = "username", referencedColumnName = "username")
        private String username;

        private String url;

        @Column(name = "field_one")
        private String fieldOne;

        @Column(name = "field_two")
        private String fieldTwo;

        @Column(name = "field_three")
        private String fieldThree;

        @Column(name = "field_four")
        private String fieldFour;

        @Column(name = "field_five")
        private String fieldFive;

        @Column(name = "field_six")
        private String fieldSix;



        public Playlist() {
        }
    }

