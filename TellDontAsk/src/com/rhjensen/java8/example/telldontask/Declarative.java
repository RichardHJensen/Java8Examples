package com.rhjensen.java8.example.telldontask;

import java.util.List;
import java.util.Optional;

/**
 * Created by Richard on 8/20/2015.
 */
public class Declarative {
    public static void main(String[] args) {
        List<TimeSlot> timeSlots = TimeSlot.generate(10);
        Optional<TimeSlot> firstAvailableTimeSlot =
                timeSlots.stream()
                         .filter(TimeSlot::isAvailable)
                         .findFirst();
        firstAvailableTimeSlot.ifPresent(TimeSlot::schedule);
        System.out.println(firstAvailableTimeSlot);
    }
}
