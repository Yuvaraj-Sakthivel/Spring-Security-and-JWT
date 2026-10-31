package com.example.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @PreAuthorize("hasRole ('ADMIN')")
    @GetMapping("hello/admin")
    public String sayAdmin(){
        return "Hey Admin Welcome Back";
    }

    @PreAuthorize("hasRole ('USER')")
    @GetMapping("hello/user")
    public String sayUser(){
        return "Hey User Welcome Back";
    }
}
