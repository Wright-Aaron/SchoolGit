package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create a random number generator.
        Random rand = new Random();

        // Create two hash sets and fill them with random numbers. Unlike list there will be no duplicate accepted.
        Set<Integer> setOne = new HashSet();
        for (int i = 0; i <= 15; i++) {
            setOne.add(rand.nextInt(30));
        }
        Set<Integer> setTwo = new HashSet();
        for (int i = 0; i <= 15; i++) {
            setTwo.add(rand.nextInt(30));
        }

        // Display the sets that were created.
        System.out.println("List one: \n" + setOne);
        System.out.println("List two: \n" + setTwo);

        // Find union of the two sets and print
        Set<Integer> union = new HashSet(setOne);
        union.addAll(setTwo);
        System.out.println("Union of the two Set:");
        System.out.println(union);

        // Find intersection of the two sets and print.
        Set<Integer> intersection = new HashSet(setOne);
        intersection.retainAll(setTwo);
        System.out.println("Intersection of the two Set:");
        System.out.println(intersection);

        // Find the symmetric difference of the two sets and print.
        Set<Integer> difference = new HashSet(setOne);
        difference.removeAll(setTwo);
        System.out.println("Difference of the two Set:");
        System.out.println(difference);

        // Iterating over the union set.
        System.out.println("Iterating over list:");
        Iterator<Integer> i = union.iterator();
        while (i.hasNext())
            System.out.print("[ " + i.next() + " ]");
    }
}
