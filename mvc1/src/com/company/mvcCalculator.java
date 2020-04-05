package com.company;

public class mvcCalculator {
    public static void main(String[] args) {

        /* This Java file is designed to allow you to spin up the program with your choice of Model, View, and controller.
        * This application will only have options for the view. All areas that need to be changed in the code will be marked
        * with this //<---<---*/

        view1 activeView = new view1(); //<---<--- The view reference needs to be changed to reflect the desired view
        model activeModel = new model();
        controller Controller = new controller(activeView,activeModel);

        activeView.setVisible(true); //<---<--- This needs to be commented out in order to use view2
    }
}
