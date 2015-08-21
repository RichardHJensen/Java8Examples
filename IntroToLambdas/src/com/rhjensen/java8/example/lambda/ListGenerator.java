package com.rhjensen.java8.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Richard on 8/21/2015.
 */
public class ListGenerator {
    static ArrayList<String> generateStrings() {
        return new ArrayList<>(Arrays.asList("First", "Second", "third",
                                             "fourth", "Fifth", "Sixth",
                                             "seventh", "eighth", "ninth"));
    }
}
