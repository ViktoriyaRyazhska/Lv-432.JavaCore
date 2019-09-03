package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

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

    public int getAge() {
        if (this.birthYear == 0) return 0;
        return LocalDate.now().getYear() - birthYear;
    }

    public void inputInformation(BufferedReader br) throws IOException {
        System.out.println("Write first name: ");
        this.firstName = br.readLine();
        System.out.println("Write last name: ");
        this.lastName = br.readLine();
        System.out.println("Write birth year: ");
        this.birthYear = Integer.parseInt(br.readLine());
    }

    public String outputInformation() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
