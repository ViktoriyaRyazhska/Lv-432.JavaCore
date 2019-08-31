package com.company;

public class Main {

    public static void main(String[] args) {

	int [] arr = {1, 4, 2, 0, 5, 8, -3, 9, -1, 6};
    int i =0;
    boolean check = true;
    int summ = 0;
    int product = 1;

	while (i < 5){
	    if (arr[i] < 0){
	        check = false;
	        break;
        }
	    i++;
    }

	if (check == true){
	    for (int j = 0; j < arr.length-5; j++){
	        summ += arr[j];
        }
        System.out.println("Summ of first 5 numbers is: " + summ);
    }
	else if (check == false){
        for (int k = 5; k < arr.length; k++){
            product *= arr[k];
        }
        System.out.println("Product of first 5 numbers is: " + product);
        }
	else System.out.println("Something went wrong.");

    }
}
