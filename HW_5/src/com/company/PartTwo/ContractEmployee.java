package com.company.PartTwo;

public class ContractEmployee extends Employee implements Salaryable {
    private double hourlyRate;
    private int hoursWorked;
    private String federalTaxIdNumber;


    public ContractEmployee(String employeeId, String name, double hourlyRate, int hoursWorked, String federalTaxIdNumber) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
                " hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", federalTaxIdNumber='" + federalTaxIdNumber + '\'' +
                ", salary="+
                this.calculatePay() +
                '}';
    }
}
