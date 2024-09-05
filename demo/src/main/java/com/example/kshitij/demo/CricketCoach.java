package com.example.kshitij.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() { return "Practice fast bowling for 20 mins!!!";

    }

}
