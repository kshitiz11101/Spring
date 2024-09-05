package com.example.kshitij.demo.common;

import org.springframework.stereotype.Component;

@Component
public class footballCoach implements Coach {
    public footballCoach(){
        System.out.println("Football Constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return"Practice Dribbling for 30 mins";
    }
}
