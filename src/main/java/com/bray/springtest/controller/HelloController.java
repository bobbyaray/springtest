package com.bray.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Test!!";
    }

    @GetMapping("/first")
    public String first(){
        return "You were first. Congrats!!";
    }
}
