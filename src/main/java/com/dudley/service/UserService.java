package com.dudley.service;

import com.dudley.entity.AppUser;

/**
 * Created by Justin on 2/7/2016.
 */
public interface UserService {

    void saveUser(AppUser user);

    AppUser getUserByUsername(String username);

}
