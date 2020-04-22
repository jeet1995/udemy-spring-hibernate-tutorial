package com.spring.tutorial.annotations.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BasketballCoach implements ICoach {

    // Field injection
    @Qualifier(value = "sadFortuneService")
    @Autowired
    private IFortuneService fortuneService;

    // Method invoked only after the bean is created along with its injections
    @PostConstruct
    public void doSomethingPostConstruct() {
        System.out.println("This method runs after constructing the bean");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your free throws";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    // Method invoked only after the bean is destroyed
    @PreDestroy
    public void doSomethingPreDestroy() {
        System.out.println("This method runs after destruction of the bean");
    }
}
