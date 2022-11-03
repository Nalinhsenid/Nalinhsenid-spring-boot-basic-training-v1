package com.spring.springmongodocker.service;

import org.springframework.stereotype.Service;

@Service
public class HelloSpringService {

    private String hello = "Hello Spring";

    public String getHello() {
        return hello;
    }
}
