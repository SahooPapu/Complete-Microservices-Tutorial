package com.bip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Environment environment;
    @GetMapping("/first-api")
    public String testMsg(){
        String port = environment.getProperty("server.port");
        return "Hellow goodmorning port"+port;
    }
}
