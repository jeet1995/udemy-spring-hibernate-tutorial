package com.spring.tutorial;

import com.spring.tutorial.entity.coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        ICoach footballCoach1 = applicationContext.getBean("footballCoach", ICoach.class);
        ICoach footballCoach2 = applicationContext.getBean("footballCoach", ICoach.class);


        System.out.println("Are footballCoach1 and footballCoach2 the same? : " + (footballCoach1 == footballCoach2));
    }

}
