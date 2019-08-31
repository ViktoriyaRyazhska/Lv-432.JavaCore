package com.company;

public class Employee {
    private String employeeld;
    private String name;
    private int id;

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Employee(String employeeld, String name, int id) {
        this.employeeld = employeeld;
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Employee{" + "employeeld='" + employeeld + '\'' + ", name='" + name + '\'' + ", id=" + id + '}';
    }
}
