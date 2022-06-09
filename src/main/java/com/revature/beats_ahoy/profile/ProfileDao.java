package com.revature.beats_ahoy.profile;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDao extends CrudRepository<Profile, Integer> {

}
