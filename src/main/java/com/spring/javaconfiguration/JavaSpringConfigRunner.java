package com.spring.javaconfiguration;

import com.spring.javaconfiguration.entity.SwimCoach;
import com.spring.tutorial.annotations.entity.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaSpringConfigRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        // Get the bean from the spring container
        ICoach coach = context.getBean("tennisCoach", ICoach.class);

        // Check if the bean has been obtained correctly
        System.out.println(coach.getDailyWorkout());

        // Check if the dependency injection has been correctly done
        System.out.println(coach.getFortune());

        // Getting a bean with a default bean-id
        ICoach cricketCoach = context.getBean("cricketCoach", ICoach.class);

        System.out.println(cricketCoach.getDailyWorkout());

        // Constructor injection of IFortuneService here
        System.out.println(cricketCoach.getFortune());

        ICoach basketballCoach = context.getBean("basketballCoach", ICoach.class);

        System.out.println(basketballCoach.getDailyWorkout());

        // Check field injection of IFortuneService here
        System.out.println(basketballCoach.getFortune());

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());

        System.out.println(swimCoach.getFortune());

        System.out.println("The name of the swim coach is : " + swimCoach.getName());

        System.out.println("The email of the swim coach is : " + swimCoach.getEmail());


        // Close the spring context
        context.close();
    }
}
