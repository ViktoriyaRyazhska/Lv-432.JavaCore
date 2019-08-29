package com.company.part2;

import com.sun.istack.internal.NotNull;

public class ContractEmployee extends Employee implements Salaryable {
    private double hourlyRate;
    private int hoursWorked;
    private String federalTaxIdNumber;

    public String getFederalTaxIdNumber() {
        return federalTaxIdNumber;
    }

    public void setFederalTaxIdNumber(String federalTaxIdNumber) {
        this.federalTaxIdNumber = federalTaxIdNumber;
    }


    public ContractEmployee(String employeeId, String name, double hourlyRate, int hoursWorked, String federalTaxIdNumber) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", salary=" + calculatePay() +
                ", federalTaxIdNumber='" + federalTaxIdNumber + '\'' +
                "} " + super.toString();
    }
}
