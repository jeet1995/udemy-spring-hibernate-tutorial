package com.spring.tutorial.entity.coach;

import com.spring.tutorial.entity.fortuneService.IFortuneService;

public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;

    private String teamName;

    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDailyWorkout() {
        return "Do a cricket related workout!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeamName() {
        return teamName;
    }
}
