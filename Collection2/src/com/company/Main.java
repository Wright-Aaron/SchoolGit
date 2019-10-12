package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();
        Scanner Input = new Scanner(System.in);
        boolean cont = true;

        Map<String,String> Employees = new HashMap<>();

        while (cont) {
            System.out.println("Enter employee name: (Format: First Last)");
            System.out.println("Type quit when you are done.");
            String empName = Input.nextLine();
            if (empName == "quit") {
                cont = false;
            }
            else {
                String[] splitName = empName.split(" ");
                String initials = new StringBuilder().append(splitName[0].charAt(0)).append(splitName[1].charAt(0)).toString();
                Employees.put(empName, initials + rand.nextInt(1000));
                System.out.println();
            }
        }

        cont = true;
        while (cont) {
            System.out.println("Which employee's EID would you like?");
            String usrSrch = Input.nextLine();
            if (Employees.containsKey(usrSrch)) {
                System.out.println(Employees.get(usrSrch));
            }
            else {
                cont = false;
            }
        }
    }
}
