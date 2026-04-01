package com.example.springhello.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springhello.service.GreetingService;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public GreetingResponse hello(@RequestParam(required = false) String name) {
        return greetingService.buildGreeting(name);
    }

    @GetMapping("/health")
    public GreetingResponse health() {
        return new GreetingResponse("Service is running", "UP");
    }
}
