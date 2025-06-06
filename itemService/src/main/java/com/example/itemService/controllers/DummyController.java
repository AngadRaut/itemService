package com.example.itemService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @GetMapping("/rushi")
    public String getDummy(){
        return "Hii";
    }
    @GetMapping("/say-hello")
    public String sayHello(){
        return "Hello";
    }
}
