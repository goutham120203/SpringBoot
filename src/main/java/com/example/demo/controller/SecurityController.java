package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController

public class SecurityController {
    
    @GetMapping("/greet")
    public String greet(HttpServletRequest request){
        return "session id " + request.getSession().getId();
    }
}
