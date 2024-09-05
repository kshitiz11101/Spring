package com.example.kshitij.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("/workout")
    public String workout() {
    return "Run hard 5k! now";
    }
    @GetMapping("/fortune")
    public String fortune() {
        return "Today is your day!";
    }

}
