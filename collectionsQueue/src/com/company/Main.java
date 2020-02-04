package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean cont = true;
        int ticketCount = 5;
        int priorityIndex = 1;
        String priorityValueArr[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"};
        String priorityValue;
        String guestInit;
        String guest;
        String str;
        String fastPass;
        String buy;

        // Create scanner object.
        Scanner input = new Scanner(System.in);

        Queue<String> ticketQueue = new PriorityQueue<>();

        while (cont) {
            System.out.println("Would you like to add a guest to the line?(Enter Yes or No): ");
            str = input.nextLine();
            if (str.equalsIgnoreCase("no")) {
                cont = false;
            }
            else {
                System.out.println("Do you have a fast pass?(Yes or No) ");
                fastPass = input.nextLine();
                if (fastPass.equalsIgnoreCase("yes")) {
                    priorityValue = "A" + priorityValueArr[priorityIndex];
                    priorityIndex++;
                }
                else {
                    priorityValue = "B" + priorityValueArr[priorityIndex];
                    priorityIndex++;
                }
                System.out.println("Enter guest name: ");
                guestInit = input.nextLine();
                guest = priorityValue + " " + guestInit;

                ticketQueue.add(guest);

            }
        }

        cont = true;
        while (cont) {
            System.out.println("Current queued guest count: " + ticketQueue.size() + "\n Currently serving: " + ticketQueue.peek());
            System.out.println("Would the customer like to buy a ticket?(Yes or No) ");
            buy = input.nextLine();
            if (ticketCount == 0) {
                cont = false;
            }
            if (buy.equalsIgnoreCase("yes")) {
                if (ticketCount > 0) {
                    ticketQueue.remove();
                    ticketCount--;
                }
                else {
                    cont = false;
                }
            }
            else {
                ticketQueue.remove();
            }
        }

        System.out.println("There are no tickets remaining. Sorry." +
                "\n" + ticketQueue.size() + " guest did not get tickets.");
    }
}
