package com.example.kshitij.demo.rest;

import com.example.kshitij.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency
    private Coach myCoach;
    private Coach theanotherCoach;
    // define a constructor for dependency injection
//    @Autowired
//    public void setCoach(Coach coach) {
//        myCoach = coach;
//    }

    @Autowired
    public DemoController(
            @Qualifier("baseballCoach")Coach anotherCoach,
            @Qualifier("baseballCoach")Coach coach) {

            System.out.println("DemoController Constructor"+getClass().getSimpleName());

        myCoach = coach;
       theanotherCoach = anotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach=theanotherCoach, "+ (myCoach==theanotherCoach);
    }
}
