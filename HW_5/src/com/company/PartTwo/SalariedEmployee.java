package com.company.PartTwo;

public class SalariedEmployee extends Employee implements Salaryable {
    private double monthlySalary;
    private String socialSecurityNumber;

    @Override
    public double calculatePay() {
        return monthlySalary;
    }


    public SalariedEmployee(String employeeId, String name, double monthlySalary, String socialSecurityNumber) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                " monthlySalary=" + monthlySalary +
                ", socialSecurityNumber=" + socialSecurityNumber +
                '}';
    }
}
