package com.spring.tutorial;

import com.spring.tutorial.entity.coach.CricketCoach;
import com.spring.tutorial.entity.coach.FootballCoach;
import com.spring.tutorial.entity.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext" +
                ".xml");

        ICoach basketBallCoach = applicationContext.getBean("basketBallCoach", ICoach.class);


        System.out.println(basketBallCoach.getDailyFortune());

        ICoach trackCoach = applicationContext.getBean("trackCoach", ICoach.class);


        System.out.println(trackCoach.getDailyWorkout());


        CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);


        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getTeamName());


        FootballCoach footballCoach = applicationContext.getBean("footballCoach", FootballCoach.class);

        System.out.println(footballCoach.getCoachEmail());
        System.out.println(footballCoach.getCoachName());
        System.out.println(footballCoach.getTeamName());

        applicationContext.close();
    }
}
