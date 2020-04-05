package com.company;

public class model {
    private float solution;

    public void addNumbers(float firstNumber, float secondNumber){
        solution = firstNumber + secondNumber;
    }

    public void subtractNumbers(float firstNumber, float secondNumber){
        solution = firstNumber - secondNumber;
    }

    public void multiplyNumbers(float firstNumber, float secondNumber){
        solution = firstNumber * secondNumber;
    }

    public void divideNumbers(float firstNumber, float secondNumber){
        solution = firstNumber / secondNumber;
    }

    public float getCalculation(){
        return solution;
    }

}
