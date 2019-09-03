package com.company.PartTwo;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("kapp", "Andry", 500, "kkgs"),
                new ContractEmployee("ha", "Oleg", 12, 60, "khh"),
                new ContractEmployee("hfta", "Peter", 14, 24, "df6h"),
                new SalariedEmployee("kjg46", "Olga", 654, "kkr5672")
        };

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
