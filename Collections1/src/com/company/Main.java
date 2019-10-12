package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        Set<Integer> setOne = new HashSet();
        for (int i = 0; i <= 15; i++) {
            setOne.add(rand.nextInt(30));
        }
        Set<Integer> setTwo = new HashSet();
        for (int i = 0; i <= 15; i++) {
            setTwo.add(rand.nextInt(30));
        }

        System.out.println("List one: \n" + setOne);
        System.out.println("List two: \n" + setTwo);

        // To find union
        Set<Integer> union = new HashSet(setOne);
        union.addAll(setTwo);
        System.out.println("Union of the two Set:");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet(setOne);
        intersection.retainAll(setTwo);
        System.out.println("Intersection of the two Set:");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet(setOne);
        difference.removeAll(setTwo);
        System.out.println("Difference of the two Set:");
        System.out.println(difference);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<Integer> i = union.iterator();
        while (i.hasNext())
            System.out.print("[ " + i.next() + " ]");
    }
}
