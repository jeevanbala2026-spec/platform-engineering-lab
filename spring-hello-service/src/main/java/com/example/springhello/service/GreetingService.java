package com.example.springhello.service;

import org.springframework.stereotype.Service;

import com.example.springhello.web.GreetingResponse;

@Service
public class GreetingService {

    public GreetingResponse buildGreeting(String name) {
        String safeName = (name == null || name.isBlank()) ? "World" : name.trim();
        return new GreetingResponse("Hello, " + safeName + "!", "OK");
    }
}
