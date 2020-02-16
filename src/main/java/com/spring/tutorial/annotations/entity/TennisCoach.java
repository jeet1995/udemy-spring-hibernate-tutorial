package com.spring.tutorial.annotations.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements ICoach {

    private IFortuneService fortuneService;

    @Autowired
    public TennisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    public String getFortune() {
        return null;
    }

}
