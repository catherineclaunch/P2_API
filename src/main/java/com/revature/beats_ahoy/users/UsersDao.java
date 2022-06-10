package com.revature.beats_ahoy.users;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDao extends CrudRepository<Users, String> {

}
