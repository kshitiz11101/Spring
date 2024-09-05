package com.example.kshitij.demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class baseballCoach implements Coach {
    public baseballCoach(){
        System.out.println("Baseball Constructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in batting practice";
    }
}
