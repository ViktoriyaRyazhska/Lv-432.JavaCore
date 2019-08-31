package com.company;

public class Main {


    public static void main(String[] args) {
        float a = 2.8f;
        float b = 5.0f;
        float c = 12.2f;

        int d = 2;
        int e = 3;
        int f = 1;

        int error = 401;

        if (a >= -5 && a <= 5){
            System.out.println("a in the range");
        }
        else {
            System.out.println("a out of the range");
        }
        if (b >= -5 && b <= 5){
            System.out.println("b in the range");
        }
        else {
            System.out.println("b out of the range");
        }
        if (c >= -5 && c <= 5){
            System.out.println("c in the range");
        }
        else {
            System.out.println("c out of the range\n");
        }


        if (d > e && d > f){
            System.out.println("d is biggest number");
        }
        else if (e > d && e > f){
            System.out.println("e is biggest number");
        }
        else if (f > d && f > e){
            System.out.println("f is biggest number");
        }

        if (d < e && d < f){
            System.out.println("d is smallest number\n");
        }
        else if (e < d && e < f){
            System.out.println("e is smallest number\n");
        }
        else if (f < d && f < e){
            System.out.println("f is smallest number\n");
        }


        switch (error){
            case 400:
                System.out.println(HTTPError.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HTTPError.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(HTTPError.PAYMENT_REQUIRED);
                break;
        }




        Dog dog1 = new Dog("Qwerty", Breed.DOBERMAN, 3);
        Dog dog2 = new Dog("Lucky", Breed.BULLDOG, 4);
        Dog dog3 = new Dog("Beam", Breed.TERRIER, 1);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())){
            System.out.println("\nHere is two dogs with same name");
        }
        else {
            System.out.println("\nNo dogs with same name\n");
        }

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()){
            System.out.println("Oldest dog is " + dog1.getName() + ". His breed is " + dog1.getBreed() + ".");
        }
        else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()){
            System.out.println("Oldest dog is " + dog2.getName() + ". His breed is " + dog2.getBreed() + ".");
        }
        else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()){
            System.out.println("Oldest dog is " + dog3.getName() + ". His breed is " + dog3.getBreed() + ".");
        }
    }
}
