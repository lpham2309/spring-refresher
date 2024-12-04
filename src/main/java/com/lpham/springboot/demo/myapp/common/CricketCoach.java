package com.lpham.springboot.demo.myapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @PostConstruct
    public void doRandomStuff() {
        System.out.println("Doing random stuffs: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doRandomCleanupStuff() {
        System.out.println("Doing random cleanup stuffs: " + getClass().getSimpleName());
    }
}
