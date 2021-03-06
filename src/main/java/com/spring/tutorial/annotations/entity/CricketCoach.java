package com.spring.tutorial.annotations.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach {

    @Qualifier(value = "happyFortuneService")
    @Autowired
    private IFortuneService fortuneService;

    // @Qualifier cannot be used for constructor injection
    // @Qualifier("happyFortuneService")
/*    @Autowired
    public CricketCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public String getDailyWorkout() {
        return "Practice your front-foot defence!";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

}

