package com.spring.javaconfiguration.entity;

import com.spring.tutorial.annotations.entity.ICoach;
import com.spring.tutorial.annotations.entity.IFortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

    private IFortuneService fortuneService;

    @Value("${swim.coach.name}")
    private String name;

    @Value("${swim.coach.email}")
    private String email;

    @Override
    public String getDailyWorkout() {
        return "Practice your freestyle!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
