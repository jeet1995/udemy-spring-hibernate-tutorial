package com.spring.tutorial.annotations.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements ICoach {

    // Field injection
    // Not recommended though
    @Qualifier(value = "happyFortuneService")
    @Autowired
    private IFortuneService fortuneService;

    /* @Autowired
    public TennisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    } */

    // Setter injection
    // Do not need a default constructor
/*    @Autowired
    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    // Works the same as setter injection
    /*@Autowired
    public void setFortuneServiceModified(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

}
