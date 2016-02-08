package com.dudley.repository;

import com.dudley.entity.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Justin on 2/7/2016.
 */
@Repository
public interface UserRepository extends MongoRepository<AppUser, String> {

    public AppUser findByUsername(String username);

}
