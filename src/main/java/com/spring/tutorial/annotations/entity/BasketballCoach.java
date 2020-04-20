package com.spring.tutorial.annotations.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements ICoach {

    // Field injection
    @Qualifier(value = "sadFortuneService")
    @Autowired
    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your free throws";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
