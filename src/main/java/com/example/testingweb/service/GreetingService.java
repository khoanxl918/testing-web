package com.example.testingweb.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting() {
        return "Greeting, World!";
    }
}
