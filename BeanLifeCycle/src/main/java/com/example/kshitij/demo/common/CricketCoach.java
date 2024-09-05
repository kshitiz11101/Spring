package com.example.kshitij.demo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("Cricket Constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() { return "Practice fast bowling for 20 mins!!!";

    }

}
