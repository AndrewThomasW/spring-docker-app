package com.example.springdockerapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping
    public String getMessage(){
        return "Andrew Docker";
    }
}
