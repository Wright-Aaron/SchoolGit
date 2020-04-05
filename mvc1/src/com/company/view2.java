package com.company;

import java.util.Scanner;

public class view2 {
    private float firstNumber;
    private float secondNumber;
    private float calculateSolution;
    private String operatorSelected;

    // This is the actual view.
    view2() {
        Scanner input = new Scanner(System.in);
        Scanner StringInput = new Scanner(System.in);
        System.out.println("Calculator");
            System.out.println("Enter the numbers you would like to operate on in order.");
            System.out.print("Enter the first number: ");
            float first = StringInput.nextInt();
            System.out.print("which operation would you like to perform? ( Enter +, -, *, or / ) ");
            String operator = input.nextLine();
            System.out.print("Enter the second number: ");
            float second = input.nextInt();

            setFirstNumber(first);
            setOperator(operator);
            setSecondNumber(second);
            input.close();
    }

    // setters and getters for the controllers to use.
    public float getFirstNumber(){
        return firstNumber;
    }
    public void setFirstNumber(float first){
        firstNumber = first;
    }

    public String getOperator(){
        return operatorSelected;
    }
    public void setOperator(String operator){
        operatorSelected = operator;
    }

    public float getSecondNumber(){
        return secondNumber;
    }
    public void setSecondNumber(float second){
        secondNumber = second;
    }

    public void setCalcSolution(float solution){
        calculateSolution = solution;
        System.out.println("Here is the answer: " + solution);
    }
}
