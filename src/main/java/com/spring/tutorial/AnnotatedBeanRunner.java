package com.spring.tutorial;

import com.spring.tutorial.annotations.entity.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Annotated beans are accessed in this class
 * */
public class AnnotatedBeanRunner {

    public static void main(String[] args) {

        // Read the spring-config file
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        // Get the bean from the spring container
        ICoach coach = classPathXmlApplicationContext.getBean("tennisCoach", ICoach.class);

        // Check if the bean has been obtained correctly
        System.out.println(coach.getDailyWorkout());

        // Getting a bean with a default bean-id
        ICoach cricketCoach = classPathXmlApplicationContext.getBean("cricketCoach", ICoach.class);

        System.out.println(cricketCoach.getDailyWorkout());

        // Constructor injection of IFortuneService here
        System.out.println(cricketCoach.getFortune());

        // Close the spring context
        classPathXmlApplicationContext.close();
    }

}
