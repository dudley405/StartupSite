package com.dudley.service.impl;

import com.dudley.entity.AppUser;
import com.dudley.repository.UserRepository;
import com.dudley.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Justin on 2/7/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository repository;

    @Override
    public void saveUser(AppUser user) {
        repository.insert(user);
    }

    @Override
    public AppUser getUserByUsername(String username) {
        AppUser user = null;
        user = repository.findByUsername(username);
        return user;
    }
}
