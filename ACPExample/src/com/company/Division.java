package com.company;

import java.util.Scanner;

public class Division implements Handler {
    public void execute(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome the the division view!\n");

        System.out.println("Enter first number: ");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        float secondNumber = scanner.nextInt();
        float solution = firstNumber / secondNumber;
        System.out.println(firstNumber + "/" + secondNumber + "=" + solution);
    }
}
