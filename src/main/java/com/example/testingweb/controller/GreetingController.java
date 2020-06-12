package com.example.testingweb.controller;

import com.example.testingweb.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @Autowired
    GreetingService service;

    @RequestMapping("/greeting")
    public @ResponseBody String hello() {
        return service.greeting();
    }
}
