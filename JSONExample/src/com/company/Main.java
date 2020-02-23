package com.company;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Aaron");
        emp.setPhone(9999999);
        emp.setRole("Security analyst");

        String json = example.javaToJSON(emp);
        System.out.println(json);

        Employee employee = example.JSONToJava(json);
        employee.getEmpData();
    }
}
