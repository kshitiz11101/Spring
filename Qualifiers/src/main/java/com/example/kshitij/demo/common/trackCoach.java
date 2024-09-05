package com.example.kshitij.demo.common;

import org.springframework.stereotype.Component;

@Component
public class trackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run for 20 mins";
    }
}
