package com.upgrad.greeting.services;

import java.time.LocalDateTime;

public class TimeService12HourFormat implements TimeService {
    @Override
    public int getCurrentTime() {
        int hour = LocalDateTime.now().getHour();
        return hour > 12 ? hour - 12 : hour;
    }
}
