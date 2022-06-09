package com.revature.beats_ahoy.playlist;


import com.revature.beats_ahoy.util.interfaces.Serviceable;

import java.util.List;

public class PlaylistServices implements Serviceable<Playlist> {
    @Override
    public Playlist create(Playlist newObject) {
        return null;
    }

    @Override
    public List<Playlist> readAll() {
        return null;
    }

    @Override
    public Playlist readById(String id) {
        return null;
    }

    @Override
    public Playlist update(Playlist updatedObject) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean validateInput(Playlist object) {
        return false;
    }

}
