package com.armor.www.controller;

import com.armor.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserService userServ;

    @RequestMapping( value = "/")
    public String index() {
        String hi = "Hello baby!";

        return hi;
    }
}
