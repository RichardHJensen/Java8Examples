package com.rhjensen.java8.example.iterating;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Richard on 8/19/2015.
 */
public class Declarative {
    private static boolean myPredicate(int value) {
        return value > 1 &&
                IntStream.range(2, value)
                         .noneMatch(i -> value % i == 0);
    }

    public static void main(String args[]) {
        List<Integer> myList =
                Stream.iterate(1, e -> e + 1)
                      .filter(Declarative::myPredicate)
                      .map(x -> x * x)
                        .limit(100)
                        .collect(toList());

        System.out.println(myList.size());
        System.out.println(myList);
    }
}
