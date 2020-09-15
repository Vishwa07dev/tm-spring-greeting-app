package com.upgrad.greeting;

import com.upgrad.greeting.factories.GreetingServiceFactory;
import com.upgrad.greeting.services.GreetingService;

public class Main {

    public static void main(String[] args) {
        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory();
        GreetingService greetingService = greetingServiceFactory.getGreetingService("english");
        greetingService.greet("John");
    }
}
