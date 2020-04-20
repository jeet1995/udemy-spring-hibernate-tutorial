package com.spring.tutorial.annotations.entity;

import org.springframework.stereotype.Component;

@Component(value = "sadFortuneService")
public class SadFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day for you";
    }
}
