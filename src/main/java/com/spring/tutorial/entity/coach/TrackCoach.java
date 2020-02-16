package com.spring.tutorial.entity.coach;

import com.spring.tutorial.entity.fortuneService.IFortuneService;

public class TrackCoach implements ICoach {

    private IFortuneService fortuneService;

    public TrackCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Do a track related work out!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
