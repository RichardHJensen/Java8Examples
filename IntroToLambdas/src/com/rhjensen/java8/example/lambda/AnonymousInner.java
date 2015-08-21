package com.rhjensen.java8.example.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Richard on 8/21/2015.
 */
public class AnonymousInner {
    public static void main(String[] args) {
        List<String> strings = ListGenerator.generateStrings();

        System.out.println("Intital:\n\t" + strings);

        // EVIL -- Mucks with the original list!!!
        Collections.sort(strings);
        System.out.println("After Collections.sort():\n\t" + strings);

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println("After Collections.sort() w/Comparator:\n\t" + strings);

        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("After List.sort(comparator):\n\t" + strings);

        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println("After List.sort(comparator)[ignoreCase]:\n\t" +
                                   strings);
    }
}
