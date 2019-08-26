package ua.com.softserve.homework3;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Volt", Breed.CHIHUAHUA, 1);
        Dog dog2 = new Dog("Rex", Breed.DOBERMAN, 7);
        Dog dog3 = new Dog("Tuzik", Breed.ROTTWEILER, 4);
        Dog oldestDog = null;

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            oldestDog = dog1;
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            oldestDog = dog2;
        } else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge())
            oldestDog = dog3;

            System.out.println("The older dog is " + oldestDog.getName() + ", his breed: " +
                    oldestDog.getBreed() + ", his age: " + oldestDog.getAge());

//        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
//            System.out.println("The oldest dog is " + dog1.getName() + ", his breed: " +
//                    dog1.getBreed() + ", his age: " + dog1.getAge());
//
//        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
//            System.out.println("The oldest dog is " + dog2.getName() + ", his breed: " +
//                    dog2.getBreed() + ", his age: " + dog2.getAge());
//
//        }else {
//        System.out.println("The oldest dog is " + dog3.getName() + ", his breed: " +
//                dog3.getBreed() + ", his age: " + dog2.getAge());
//        }

         if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) ||
                 dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two same names!");
        }else {
            System.out.println("There are no same names!");
        }

    }
}
