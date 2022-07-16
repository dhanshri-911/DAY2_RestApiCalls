package com.bridgelabz.helloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping("/get")
    public String hello(){
        return "Hello World !";
    }
    //UC1
    @GetMapping("/getBl")
    public String helloBl(){
        return "Hello Bridgelabz !";
    }
}
