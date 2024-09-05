package com.example.kshitij.demo.common;

import org.springframework.stereotype.Component;

@Component
public class baseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice";
    }
}
