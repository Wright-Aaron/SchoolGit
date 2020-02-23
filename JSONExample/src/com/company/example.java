package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class example {

    public static String javaToJSON(Employee employee) {

        ObjectMapper mapper = new ObjectMapper();
        String s = "";

        try {
            s = mapper.writeValueAsString(employee);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return s;
    }

    public static Employee JSONToJava(String s) {

        ObjectMapper mapper = new ObjectMapper();
        Employee emp = null;

        try {
            emp = mapper.readValue(s, Employee.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

       return emp;
    }
}
