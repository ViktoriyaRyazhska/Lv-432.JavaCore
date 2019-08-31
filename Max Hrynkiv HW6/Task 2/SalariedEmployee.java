package com.company;

public class SalariedEmployee extends Employee implements Calculate {

    private int socialSecurityNumber;
    private int fixedSalary;

    public SalariedEmployee(String employeeld, String name, int id, int socialSecurityNumber, int fixedSalary) {
        super(employeeld, name, id);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedSalary = fixedSalary;
    }


    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public int calculatePay() {
        return fixedSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "socialSecurityNumber=" + socialSecurityNumber + ", fixedSalary=" + fixedSalary + ", payment=" + calculatePay() + "} " + super.toString();
    }
}
