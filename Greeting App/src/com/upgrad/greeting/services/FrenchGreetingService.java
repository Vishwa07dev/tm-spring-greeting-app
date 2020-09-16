package com.upgrad.greeting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreetingService implements GreetingService {

    @Autowired
    @Qualifier("timeService24HourFormat")
    private TimeService timeService;

    @Override
    public void greet(String name) {
        int time = timeService.getCurrentTime();
        String greetingMessage;
        if (time < 17) {
            greetingMessage = "Bonjour";
        } else {
            greetingMessage = "Bonsoir";
        }
        System.out.println(greetingMessage + ", " + name);
    }
}
