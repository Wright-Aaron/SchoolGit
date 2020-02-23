package com.company;

import java.util.List;

public class Employee {

    private String name;
    private long phone;
    private String role;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }

    public void setRole(String job) {
        this.role = job;
    }

    public String getRole() {
        return role;
    }

    public void getEmpData() {
        System.out.println("Name " + name + "\nPhone " + phone + "\nRole " + role);
    }
}
