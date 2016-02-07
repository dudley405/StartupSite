package com.dudley.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Justin on 2/6/2016.
 */
@Controller
public class DashboardController {

    @RequestMapping(value="/default", method= RequestMethod.GET)
       String defaultPage() {
        return "partials/_default";
    }

    @RequestMapping(value="/Dashboard", method= RequestMethod.GET)
    String dashboard() {
        return "dashboard";
    }

    @RequestMapping(value="/shortcut", method= RequestMethod.GET)
    String shortcut() {
        return "partials/_shortcut";
    }

    @RequestMapping(value="/home", method= RequestMethod.GET)
    String home() {
        return "partials/_home";
    }

}
