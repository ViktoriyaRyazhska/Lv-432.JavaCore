package com.company;

public class Main {

    public static void main(String[] args) {

        Calculate tmp;
        int i = 0;

        Calculate[] employees =
                {new SalariedEmployee("worker1", "Max", 1, 1234, 2900 ),
                 new SalariedEmployee("worker2", "Vasya", 2, 4321, 2500 ),
                 new ContractEmployee("worker3", "Petya", 3, 20, 108, 8785),
                 new ContractEmployee("worker4", "Ivan", 4, 15, 120, 6394)
                };

        for (int z = 0; z < employees.length; z++){
            for (int x = 0; x < employees.length - 1 - z; x++){
                if (employees[x].calculatePay() > employees[x+1].calculatePay()){
                    tmp = employees[x];
                    employees[x] = employees [x+1];
                    employees[x+1] = tmp;
                }
            }
        }

        while (i < employees.length){
            System.out.println(employees[i].toString());
            i++;
        }



    }
}
