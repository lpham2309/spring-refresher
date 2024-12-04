package com.lpham.springboot.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice for 30 minutes";
    }
}
