package com.upgrad.greeting;

import com.upgrad.greeting.services.GreetingService;

public class Main {

    public static void main(String[] args) {
        GreetingService greetingService = new GreetingService();
        greetingService.greet("John");
    }
}
