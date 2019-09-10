import java.util.Scanner;

public class Seven {

    public Seven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seven. Input number:");
        int n = scanner.nextInt();
        System.out.println("Factorial of this number is "+factorial(n));
    }

    public static void main(String[] args) {
        new Seven();
    }

    public int factorial(int f){
        if(f == 0) {
            return 1;
        } else {
            return (f*factorial(f-1));
        }
    }
}
