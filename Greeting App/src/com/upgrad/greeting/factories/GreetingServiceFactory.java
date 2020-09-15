package com.upgrad.greeting.factories;

import com.upgrad.greeting.services.EnglishGreetingService;
import com.upgrad.greeting.services.FrenchGreetingService;
import com.upgrad.greeting.services.GreetingService;

public class GreetingServiceFactory {
    public GreetingService getGreetingService(String language) {
        if (language.equals("english")) {
            return new EnglishGreetingService();
        } else if (language.equals("french")) {
            return new FrenchGreetingService();
        } else {
            throw new RuntimeException("No greeting Service exist for " + language + " language.");
        }
    }
}
