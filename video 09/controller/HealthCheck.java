package com.dheeraj.Journal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Dhiraj";
    }
}
