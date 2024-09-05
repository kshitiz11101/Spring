package com.example.kshitij.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class trackCoach implements Coach {
    public trackCoach(){
        System.out.println("Track Constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run for 20 mins";
    }
}
