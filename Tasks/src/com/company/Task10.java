public class Task_10 {


    public void findOne(int randomNumber) {

        int count = 0;
        do {
            if (randomNumber % 2 == 0) {
                randomNumber = randomNumber / 2;
                count++;
            } else {
                randomNumber = (randomNumber * 3) + 1;
                count++;
            }
        } while (randomNumber != 1);
        System.out.println(count);
    }
