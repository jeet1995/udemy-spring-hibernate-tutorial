package com.spring.javaconfiguration;

import com.spring.javaconfiguration.entity.SwimCoach;
import com.spring.tutorial.annotations.entity.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.spring.tutorial.annotations.entity"})
@PropertySource("classpath:coach.properties")
@Configuration
public class ApplicationContext {

    @Bean
    public SwimCoach swimCoach() {
        SwimCoach swimCoach = new SwimCoach();
        swimCoach.setFortuneService(new HappyFortuneService());

        return swimCoach;
    }

}
