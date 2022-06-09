package com.revature.beats_ahoy.playlist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistDao extends CrudRepository<Playlist, Integer> {


}
