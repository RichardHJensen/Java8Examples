package com.rhjensen.java8.example.immutability;

import java.util.Arrays;

/**
 * Created by Richard on 8/21/2015.
 */
public class Declarative {
    public static void main(String[] args) {
        int[] numbers = {3, 12, 17, 31, 43};

        System.out.println(
                Arrays.stream(numbers)
                      .map(e -> e * 2)
                      .sum());
    }
}
