package com.spring.springmongodocker.controller;

import com.spring.springmongodocker.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    @Autowired
    private HelloSpringService helloSpringService;

    //http://localhost:8080/hello-spring
    @GetMapping("/hello-spring")
    public String helloSpring(){
        return helloSpringService.getHello();
    }
}
