import java.util.Scanner;

public class Six {

    public Six(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Six. Input text:");
        String text = scanner.next();
        System.out.println("Counter of words is "+countWords(text));
    }

    public static void main(String[] args) {
        new Six();
    }

    private static int countWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }
}
