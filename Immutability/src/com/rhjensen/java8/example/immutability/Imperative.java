package com.rhjensen.java8.example.immutability;

/**
 * Created by Richard on 8/21/2015.
 */
public class Imperative {
    public static void main(String[] args) {
        int[] numbers ={ 3, 12, 17, 31, 43 };
        int result = 0;

        for (int val: numbers) {
            result += val * 2;
        }

        System.out.println(result);
    }
}
