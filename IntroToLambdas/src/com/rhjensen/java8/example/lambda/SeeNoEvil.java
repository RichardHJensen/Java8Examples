package com.rhjensen.java8.example.lambda;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by Richard on 8/21/2015.
 */
public class SeeNoEvil {
    public static void main(String[] args) {
        List<String> strings = ListGenerator.generateStrings();

        System.out.println("Intital:\n\t" + strings);

        System.out.println("sorted():\n\t"
                                   + strings.stream()
                                            .sorted()
                                            .collect(toList()));

        System.out.println("original after sorted():\n\t" + strings);

        System.out.println("sorted(comparator):\n\t"
                                   + strings.stream()
                                            .sorted(String::compareToIgnoreCase)
                                            .collect(toList()));

        System.out.println("original after sorted(comparator):\n\t" + strings);
    }
}
