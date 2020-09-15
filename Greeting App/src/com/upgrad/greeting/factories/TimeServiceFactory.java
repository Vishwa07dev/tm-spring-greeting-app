package com.upgrad.greeting.factories;

import com.upgrad.greeting.services.TimeService;
import com.upgrad.greeting.services.TimeService12HourFormat;
import com.upgrad.greeting.services.TimeService24HourFormat;

public class TimeServiceFactory {
    public TimeService getTimeService(String format) {
        if (format.equals("12hour")) {
            return new TimeService12HourFormat();
        } else if (format.equals("24hour")) {
            return new TimeService24HourFormat();
        } else {
            throw new RuntimeException("No time Service exist for " + format + " format.");
        }
    }
}
