package com.company;

public class Main {

    public static void main(String[] args) {

    int i = 0;
    int k =0;
    int counter = 0;
    int minPos = 0;
    int min = 0;

	int [] arr = {-2, 4, -6, -8, 10};
	while (i < arr.length){
	    if (arr[i] > 0){
	        counter ++;
            if (counter == 2){
                System.out.println("Second positive num is: " + arr[i]);
                System.out.println("It's position is: " + (++i));
                break;
            }
        }
	    i++;
        }

	min = arr[0];
	while (k < arr.length){
	    if (arr[k] < min){
	        min = arr[k];
	        minPos = k+1;
        }
	    k++;
    }
        System.out.println("Min number is: " + min + ". Its position is: " + minPos);
    }
}

