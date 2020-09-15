package com.upgrad.greeting;

import com.upgrad.greeting.factories.TimeServiceFactory;
import com.upgrad.greeting.services.GreetingService;
import com.upgrad.greeting.services.TimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.upgrad.greeting");
        GreetingService greetingService = (GreetingService)context.getBean("frenchGreetingService");

        greetingService.greet("John");

        TimeServiceFactory timeServiceFactory = new TimeServiceFactory();
        TimeService timeService = timeServiceFactory.getTimeService("24hour");
        System.out.println(timeService.getCurrentTime());
    }
}
