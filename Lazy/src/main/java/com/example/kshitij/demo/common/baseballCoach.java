package com.example.kshitij.demo.common;

import org.springframework.stereotype.Component;

@Component
public class baseballCoach implements Coach {
    public baseballCoach(){
        System.out.println("Baseball Constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice";
    }
}
