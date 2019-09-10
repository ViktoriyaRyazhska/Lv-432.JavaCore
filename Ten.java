import java.util.Scanner;

public class Ten {
    public Ten(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 10. Input number greater than 1:");
        int n = scanner.nextInt();
        getOne(n);
    }

    public static void main(String[] args) {
        new Ten();
    }

    public static void getOne(int n){
        if (n > 1){
            int count = 0;
            while (n != 1){
                if (n%2==0){
                    n/=2;
                    count++;
                    System.out.println(count+"th step: n="+n);
                } else {
                    n*=3;
                    n++;
                    count++;
                    System.out.println(count+"th step: n="+n);
                }
            }
            System.out.println("It took "+count+" steps");
        } else {
            System.out.println("It took 0 step '(");
        }
    }
}
