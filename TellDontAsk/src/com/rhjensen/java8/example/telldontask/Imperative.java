package com.rhjensen.java8.example.telldontask;

import java.util.List;

/**
 * Created by Richard on 8/19/2015.
 */
public class Imperative {

    public static void main(String[] args) {
        List<TimeSlot> timeSlots = TimeSlot.generate(10);
        TimeSlot firstAvailableTimeSlot = null;
        for (TimeSlot timeSlot : timeSlots) {
            if (timeSlot.isAvailable()) {
                timeSlot.schedule();
                firstAvailableTimeSlot = timeSlot;
                break;
            }
        }
        System.out.println(timeSlots);
        System.out.println("First Available: " + firstAvailableTimeSlot);
    }

}
