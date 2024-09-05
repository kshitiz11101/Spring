package com.example.kshitij.demo.common;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class baseballCoach implements Coach {
    public baseballCoach(){
        System.out.println("Baseball Constructor"+getClass().getSimpleName());
    }
//    define our init method

    @PostConstruct
    public void doStuff(){
        System.out.println("Doing some stuff"+getClass().getSimpleName());
    }

    @PreDestroy
public void doSomething(){
        System.out.println("Doing something"+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice";
    }
}
