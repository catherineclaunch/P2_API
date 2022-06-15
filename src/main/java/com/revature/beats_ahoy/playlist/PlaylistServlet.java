package com.revature.beats_ahoy.playlist;


import com.revature.beats_ahoy.survey.Survey;
import com.revature.beats_ahoy.util.interfaces.Authable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
public class PlaylistServlet  implements Authable {

    private final PlaylistServices playlistServices;

    public PlaylistServlet(PlaylistServices playlistServices) {
        this.playlistServices = playlistServices;
    }

    @PostMapping("/setplaylist")
    public ResponseEntity<Playlist> saveUser(@RequestBody Playlist result) {
        Playlist playlist = playlistServices.create(result);
        return new ResponseEntity<>(playlist, HttpStatus.CREATED);
    }

    @GetMapping("/playlist/{id}")
    public ResponseEntity<Playlist> findUserById(@PathVariable String results) {
        Playlist foundResults = playlistServices.readById(results);
        return new ResponseEntity<>(foundResults, HttpStatus.OK);
    }

    @GetMapping("/playlists")
    public ResponseEntity<List> findAllUsers(){
        return new ResponseEntity<>(playlistServices.readAll(), HttpStatus.I_AM_A_TEAPOT);
    }
}
