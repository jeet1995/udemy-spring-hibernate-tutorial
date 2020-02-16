package com.spring.tutorial;

import com.spring.tutorial.entity.coach.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        FootballCoach footballCoach = applicationContext.getBean("footballCoach", FootballCoach.class);

        applicationContext.close();
    }

}
