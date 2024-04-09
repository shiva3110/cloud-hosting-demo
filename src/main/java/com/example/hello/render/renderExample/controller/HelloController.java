package com.example.hello.render.renderExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jay")
public class HelloController {

    @GetMapping("/hello")
    public String sayHelloToJay(){
    return "Hello Jay";
    }

    @GetMapping("/bye")
    public String sayByeToJay(){
        return "Bye Jay";
    }
}
