package com.dudley.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Justin on 2/2/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
