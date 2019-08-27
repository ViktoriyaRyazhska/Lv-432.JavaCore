package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Year;

import static com.company.Util.safeParseInt;
import static com.company.Util.safeReadLine;

public class Person {
    private int birthYear;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return birthYear == 0 ? 0: LocalDate.now().getYear() - birthYear;
    }

    public void input(BufferedReader bf) throws IOException {

        System.out.print("Person first name = ");
        this.firstName = safeReadLine(bf);

        System.out.print("Person last name = ");
        this.lastName = safeReadLine(bf);

        System.out.print("Person birthday year = ");
        this.birthYear = safeParseInt(safeReadLine(bf));

    }

    public void output() {
        System.out.println("Person [ firstName = " + firstName +
                ", lastName = " + lastName + ", age = " + getAge() + "]");
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
