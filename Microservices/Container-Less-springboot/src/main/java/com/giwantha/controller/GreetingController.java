package com.giwantha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greeting(){

        return "<h1>Welcome to game changing Framework SpringBoot</h1>";

    }

}
