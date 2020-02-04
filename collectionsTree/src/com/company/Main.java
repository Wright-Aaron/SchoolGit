package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        String empName;
        String enterGuard;
        String age;
        TreeMap<String, String> employeeList = new TreeMap<>(Collections.reverseOrder());
        boolean cont = true;
        Scanner input = new Scanner(System.in);

        while (cont) {
            System.out.println("Do you want to enter an employee? ");
            enterGuard = input.nextLine();
            if (enterGuard.equalsIgnoreCase("no")){
                cont = false;
            }
            else {
                System.out.println("Please enter name: ");
                empName = input.nextLine();
                System.out.println("Please enter age: ");
                age = input.nextLine();
                employeeList.put(age, empName);
            }
        }

        System.out.println(employeeList);
    }
}
