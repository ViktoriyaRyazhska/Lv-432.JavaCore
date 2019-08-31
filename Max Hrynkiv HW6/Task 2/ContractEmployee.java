package com.company;

public class ContractEmployee extends Employee implements Calculate {

    private int hourlyRate;
    private int workedHours;
    private int federalTaxIdMember;

    public ContractEmployee(String employeeld, String name, int id, int hourlyRate, int workedHours, int federalTaxIdMember) {
        super(employeeld, name, id);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }


    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWordedHours() {
        return workedHours;
    }

    public void setWordedHours(int wordedHours) {
        this.workedHours = wordedHours;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(int federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * workedHours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + "hourlyRate=" + hourlyRate + ", workedHours=" + workedHours + ", federalTaxIdMember=" + federalTaxIdMember + ", payment=" + calculatePay() + "} " + super.toString();
    }
}