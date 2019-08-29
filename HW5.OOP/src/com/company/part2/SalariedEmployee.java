package com.company.part2;

public class SalariedEmployee extends Employee implements Salaryable {
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", salary=" + calculatePay() +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                "} " + super.toString();
    }
}
