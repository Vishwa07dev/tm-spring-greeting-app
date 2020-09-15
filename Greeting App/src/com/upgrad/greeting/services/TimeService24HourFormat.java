package com.upgrad.greeting.services;

import java.time.LocalDateTime;

public class TimeService24HourFormat implements TimeService {
    @Override
    public int getCurrentTime() {
        return LocalDateTime.now().getHour();
    }
}
