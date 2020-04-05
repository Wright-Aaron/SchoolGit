package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

        public static void main(String[] args) {
            Controller calculate = new Controller();

                class view extends JFrame {
                        private JLabel operatorLabel = new JLabel("Enter operator ( +, -, *, / ):");
                        private JTextField operator = new JTextField(2);
                        private JButton submitButton = new JButton("Submit");

                        view() {
                                JPanel calculatorPanel = new JPanel();
                                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                this.setSize(300, 80);
                                calculatorPanel.add(operatorLabel);
                                calculatorPanel.add(operator);
                                calculatorPanel.add(submitButton);
                                this.add(calculatorPanel);
                        }

                        public String getOperator(){
                                return operator.getText();
                        }

                        void addCalcListener(ActionListener listenForCalcButton){
                                submitButton.addActionListener(listenForCalcButton);
                        }
                }
                view activeView = new view();
                activeView.setVisible(true);

                class CalcListener implements ActionListener {
                        public void actionPerformed(ActionEvent e) {
                                String operator = activeView.getOperator();
                                activeView.setVisible(false);
                                calculate.handleOperator(operator);
                        }
                }

                activeView.addCalcListener(new CalcListener());
        }
}
