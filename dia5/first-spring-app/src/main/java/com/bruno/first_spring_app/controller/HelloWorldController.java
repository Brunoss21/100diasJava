package com.bruno.first_spring_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.first_spring_app.domain.User;
import com.bruno.first_spring_app.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }


    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Bruno");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id,@RequestBody User body){
        return "Hello World Post" + body.getName() + id;
    }

    

}
