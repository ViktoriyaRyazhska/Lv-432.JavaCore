import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HomeWork8 {

	public static void main(String[] args) {
		/*Enter in the console sentence of five words. 
		display the longest word in the sentence
		determine the number of its letters
		bring the second word in reverse order
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence of five words...");
		String sentenceOfFiveWords = "";
		try {
			sentenceOfFiveWords = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		String[] s = sentenceOfFiveWords.split(" ");
		String maxWordOfThesentence = s[0];
		for (String string : s) {			
			if(maxWordOfThesentence.length() < string.length()) {
				maxWordOfThesentence = string;
			}
		}
		System.out.println("longest word in the sentence = "+maxWordOfThesentence);
		System.out.println("determine the number of its letters = "+maxWordOfThesentence.length());
		
	}

}
