package com.rhjensen.java8.example.telldontask;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

/**
 * Created by Richard on 8/19/2015.
 */
public class TimeSlot {
    private java.time.LocalDate date;
    private java.time.LocalTime startTime;
    private Duration duration;
    private boolean available;

    public TimeSlot(LocalDateTime start, Duration duration) {
        date = start.toLocalDate();
        startTime = start.toLocalTime();
        this.duration = duration;
        available = true;
    }

    public TimeSlot() {
        this(LocalDateTime.now(), Duration.ofHours(1L));
    }

    public TimeSlot(LocalDateTime start) {
        this(start, Duration.ofHours(1L));
    }

    public boolean isAvailable() {
        return available;
    }

    public void schedule() {
        available = false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TimeSlot{");
        sb.append("date=").append(date);
        sb.append(", startTime=").append(startTime);
        sb.append(", duration=").append(duration);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }

    public static List<TimeSlot> generate(int numberOfSlots) {
        List<TimeSlot> timeSlots =  new Random()
                .longs(1, 365)
                .distinct()
                .limit(numberOfSlots)
                .sorted()
                .mapToObj(value -> LocalDateTime.now().plusDays(value))
                .map(TimeSlot::new)
                .collect(toList());
        return timeSlots;
    }
}
