package com.spring.tutorial.annotations.entity;

import org.springframework.stereotype.Component;

@Component("fortuneService")
public class HappyFortuneService implements IFortuneService {

    public String getFortune() {
        return "Today is your lucky day!";
    }

}
