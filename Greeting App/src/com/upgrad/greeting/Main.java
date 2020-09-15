package com.upgrad.greeting;

import com.upgrad.greeting.factories.GreetingServiceFactory;
import com.upgrad.greeting.factories.TimeServiceFactory;
import com.upgrad.greeting.services.GreetingService;
import com.upgrad.greeting.services.TimeService;

public class Main {

    public static void main(String[] args) {
        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory();
        GreetingService greetingService = greetingServiceFactory.getGreetingService("english");
        greetingService.greet("John");

        TimeServiceFactory timeServiceFactory = new TimeServiceFactory();
        TimeService timeService = timeServiceFactory.getTimeService("24hour");
        System.out.println(timeService.getCurrentTime());
    }
}
