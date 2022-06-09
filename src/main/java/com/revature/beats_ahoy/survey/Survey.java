package com.revature.beats_ahoy.survey;


import javax.persistence.*;
@Entity
@Table(name = "Survey")
public class Survey {

    @Id
    private int Id;

    private String question;


    public Survey() {
    }


}



