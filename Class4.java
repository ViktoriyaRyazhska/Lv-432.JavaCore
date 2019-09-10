import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Class4 {


        public static void main(String[] args) throws IOException {
            Set<Character> loud  = new HashSet<>();
            loud.add('a');
            loud.add('e');
            loud.add('y');
            loud.add('i');
            loud.add('o');



        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Input text: ");
        String inputtedText = br.readLine();

        int sum = 0;
        char Arr [] = inputtedText.toCharArray();
        for (char c :Arr) {
           if (loud.contains(Character.toLowerCase(c))) sum++;

            }
            System.out.println(sum);
        }


    }

