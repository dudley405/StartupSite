package com.dudley.web.controller;

import com.dudley.entity.AppUser;
import com.dudley.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Justin on 2/2/2016.
 */
@Controller
public class IndexController {

    @Resource
    UserService service;

    @Resource
    PasswordEncoder passwordEncoder;

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/signup")
    String signup() {
        return "register";
    }

    @RequestMapping("/register")
    String register(@RequestParam String firstName, @RequestParam String lastName,
                @RequestParam String email, @RequestParam String password, @RequestParam String repeatPassword,
                    HttpServletResponse response){

        AppUser user = service.getUserByUsername(email);

        if(user == null) {

            String[] roles = {"USER"};

            AppUser appUser = new AppUser();
            user.setUsername(email);
            user.setPassword(passwordEncoder.encode(password));
            user.setRoles(roles);

            service.saveUser(user);

            return "/registrationSuccessful";
        } else {
            try {
                response.sendError(403);
            } catch (IOException e) {

            }

            return "/register";
        }
    }
}
