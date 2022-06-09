package com.revature.beats_ahoy.survey;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SurveyServlet {

    private final SurveyServices surveyServices;

    @Autowired
    public SurveyServlet(SurveyServices surveyServices) {
        this.surveyServices = surveyServices;
    }
}
