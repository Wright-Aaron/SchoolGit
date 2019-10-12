package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Set global variables to check if user wants to continue.
        boolean cont = true;
        boolean cont2 = true;

        // Initiate list.
        List myList = new ArrayList();

        // Create scanner object.
        Scanner input = new Scanner(System.in);

        // Take first item input.
        System.out.println("Lets create a shopping list.");
        System.out.println("Enter an item: ");
        myList.add(input.nextLine());

        // Loop adds items until the user specifies that they are done.
        while (cont) {
            System.out.println("Would you like to continue?(enter yes or no) ");
            String str = input.nextLine();
            if (str.equalsIgnoreCase("no")) {
                cont = false;
            }
            else {
                System.out.println("Enter another item: ");
                myList.add(input.nextLine());
            }
        }

        // Set continue back to true.
        cont = true;

        /* This nested loop check to see if the user wants to remove any items. If that do the program finds the index of that item and removes it.
        If the user enters an item that is not on the list the program informs them of their mistake and prompts them to try again.
        If the user enters no both loops are exited.
         */
        while (cont) {

            while (cont2) {
                System.out.println("Would you like to remove any items from this list? (Type the item you would like to remove or type no) " + myList);
                String response = input.nextLine();

                boolean exist = myList.contains(response);
                if (response.equalsIgnoreCase("no")) {
                    cont = false;
                    cont2 = false;
                }
                else if (exist == false) {
                    System.out.println("This item does not exist in your list.");
                }
                else {
                    myList.remove(myList.indexOf(response));
                    System.out.println("Would you like to remove anything else? " + myList);
                    String response2 = input.nextLine();
                    if (response2.equalsIgnoreCase("no")) {
                        cont = false;
                        cont2 = false;
                        break;
                    }
                }
            }

        }
        // Final list is printed to the terminal.
        System.out.println("Here is your shopping list. " + myList);
    }
}
