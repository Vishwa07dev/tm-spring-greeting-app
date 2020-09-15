package com.upgrad.greeting.services;

public class FrenchGreetingService implements GreetingService {
    @Override
    public void greet(String name) {
        System.out.println("Bonjour, " + name);
    }
}
