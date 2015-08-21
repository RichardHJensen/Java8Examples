package com.rhjensen.java8.example.iterating;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Richard on 8/19/2015.
 */
public class Imperative {
    public static boolean function(int value) {
        boolean flag = false;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                flag = true;
                break;
            }
        }

        return value > 1 && !flag;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int value = 2;
        while(myList.size() <= 100) {
            if (function(value)) {
                myList.add(value * value);
            }
            value++;
        }
        System.out.println(myList.size());
        System.out.println(myList);
    }

}
