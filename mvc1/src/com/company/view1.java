package com.company;

import java.awt.event.ActionListener;
import javax.swing.*;

public class view1 extends JFrame{

    private JTextField firstNumber  = new JTextField(5);
    private JLabel questionLabel = new JLabel("?");
    private JTextField secondNumber = new JTextField(5);
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JTextField calcSolution = new JTextField(10);

    view1(){
        JPanel calculatorPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 80);
        calculatorPanel.add(firstNumber);
        calculatorPanel.add(questionLabel);
        calculatorPanel.add(secondNumber);
        calculatorPanel.add(addButton);
        calculatorPanel.add(subtractButton);
        calculatorPanel.add(multiplyButton);
        calculatorPanel.add(divideButton);
        calculatorPanel.add(calcSolution);
        this.add(calculatorPanel);
    }

    // Getters and Setters.
    public float getFirstNumber(){
        return Float.parseFloat(firstNumber.getText());
    }

    public float getSecondNumber(){
        return Float.parseFloat(secondNumber.getText());
    }

    public float getCalcSolution(){
        return Float.parseFloat(calcSolution.getText());
    }

    public void setCalcSolution(float solution){
        calcSolution.setText(Float.toString(solution));
    }

    // This is where the listeners are created to the operations buttons
    void addAddListener(ActionListener listenForAddButton){
        addButton.addActionListener(listenForAddButton);
    }
    void addSubtractListener(ActionListener listenForSubtractButton){
        subtractButton.addActionListener(listenForSubtractButton);
    }
    void addMultiplyListener(ActionListener listenForMultiplyButton){
        multiplyButton.addActionListener(listenForMultiplyButton);
    }
    void addDivideListener(ActionListener listenForDivideButton){
        divideButton.addActionListener(listenForDivideButton);
    }
}
