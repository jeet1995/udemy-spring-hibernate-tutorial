package com.spring.tutorial.entity.coach;

import com.spring.tutorial.entity.fortuneService.IFortuneService;

public class FootballCoach implements ICoach {

    private IFortuneService fortuneService;

    private String teamName;
    private String coachName;
    private String coachEmail;

    public FootballCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Do a football related workout!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setCoachEmail(String coachEmail) {
        this.coachEmail = coachEmail;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getCoachEmail() {
        return coachEmail;
    }

    private void initFootballCoach() {
        System.out.println("Going to initialize some football coach.");
    }

    private void destroyFootballCoach() {
        System.out.println("Destroying some football coach.");
    }
}
