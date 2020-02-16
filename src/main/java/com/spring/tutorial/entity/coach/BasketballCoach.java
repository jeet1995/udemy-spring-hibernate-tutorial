package com.spring.tutorial.entity.coach;

import com.spring.tutorial.entity.fortuneService.IFortuneService;

public class BasketballCoach implements ICoach {

    private IFortuneService fortuneService;

    public BasketballCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Do a baseball related workout!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
