package com.revature.beats_ahoy.profile;



import com.revature.beats_ahoy.util.interfaces.Authable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class ProfileServlet {

    private final ProfileServices profileServices;

    @Autowired
    public ProfileServlet(ProfileServices profileServices){
        this.profileServices = profileServices;
    }


}
