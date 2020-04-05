package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    private view1 activeView; //<---<--- The view reference needs to be changed to reflect the desired view
    private model activeModel;
    float firstNumber;
    float secondNumber;

    public controller(view1 activeView, model activeModel) { //<---<--- The view reference needs to be changed to reflect the desired view
        this.activeView = activeView;
        this.activeModel = activeModel;

        //<---><---><---><---><---><---><---><This section must be commented out for view2><---><---><---><---><---><---><--->
        this.activeView.addAddListener(new AddListener());
        this.activeView.addSubtractListener(new SubtractListener());
        this.activeView.addMultiplyListener(new MultiplyListener());
        this.activeView.addDivideListener(new DivideListener());
        //<---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><--->


        /*//<---><---><---><---><---><---><---><This section must be commented out for view1><---><---><---><---><---><---><--->
        String operator;
        firstNumber = myView.getFirstNumber();
        operator = activeView.getOperator();
        secondNumber = myView.getSecondNumber();

        if (operator.equals("+")) {
            myModel.addNumbers(firstNumber, secondNumber);
            myView.setCalcSolution(myModel.getCalculation());
        } else if (operator.equals("-")) {
            myModel.subtractNumbers(firstNumber, secondNumber);
            myView.setCalcSolution(myModel.getCalculation());
        } else if (operator.equals("*")) {
            myModel.multiplyNumbers(firstNumber, secondNumber);
            myView.setCalcSolution(myModel.getCalculation());
        } else if (operator.equals("/")) {
            myModel.divideNumbers(firstNumber, secondNumber);
            myView.setCalcSolution(myModel.getCalculation());
        }
        *///<---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><--->
    }

    //<---><---><---><---><---><---><---><This section must be commented out for view2><---><---><---><---><---><---><---><--->
    class SubtractListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
                firstNumber = activeView.getFirstNumber();
                secondNumber = activeView.getSecondNumber();
                activeModel.subtractNumbers(firstNumber, secondNumber);
                activeView.setCalcSolution(activeModel.getCalculation());
        }
    }

    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
                firstNumber = activeView.getFirstNumber();
                secondNumber = activeView.getSecondNumber();
                activeModel.addNumbers(firstNumber, secondNumber);
                activeView.setCalcSolution(activeModel.getCalculation());

        }
    }

    class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
                firstNumber = activeView.getFirstNumber();
                secondNumber = activeView.getSecondNumber();
                activeModel.multiplyNumbers(firstNumber, secondNumber);
                activeView.setCalcSolution(activeModel.getCalculation());
        }
    }

    class DivideListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
                firstNumber = activeView.getFirstNumber();
                secondNumber = activeView.getSecondNumber();
                activeModel.divideNumbers(firstNumber, secondNumber);
                activeView.setCalcSolution(activeModel.getCalculation());

        }
    }
    //<---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><---><--->
}
