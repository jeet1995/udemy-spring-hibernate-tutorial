package com.spring.tutorial.annotations.entity;

import org.springframework.stereotype.Component;

@Component(value = "happyFortuneService")
public class HappyFortuneService implements IFortuneService {

    public String getFortune() {
        return "Today is your lucky day!";
    }

}
