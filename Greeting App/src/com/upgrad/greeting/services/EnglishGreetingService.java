package com.upgrad.greeting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EnglishGreetingService implements GreetingService {
    private TimeService timeService;

    @Autowired
    public EnglishGreetingService(@Qualifier("timeService24HourFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    @Override
    public void greet(String name) {
        int time = timeService.getCurrentTime();
        String greetingMessage;
        if (time < 12) {
            greetingMessage = "Good Morning";
        } else if (time < 17) {
            greetingMessage = "Good Afternoon";
        } else {
            greetingMessage = "Good Evening";
        }
        System.out.println(greetingMessage + ", " + name);
    }
}
