package com.example.kshitij.demo.common;

import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Backhand technique for 30 mins";
    }
}
