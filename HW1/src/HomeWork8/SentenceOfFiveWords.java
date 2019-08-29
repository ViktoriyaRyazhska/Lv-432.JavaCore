package HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


/*Enter in the console sentence of five words. 
display the longest word in the sentence
determine the number of its letters
bring the second word in reverse order
 */
public class SentenceOfFiveWords {

	public static void main(String[] args) {
		String sentenceFiveWords = "";
		System.out.println("Write sentence of five words...");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			sentenceFiveWords = reader.readLine();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		String[] sentenceOfFiveWords = sentenceFiveWords.split(" ");		
		//Comparator<String> comprator = (o1, o2) -> o2.length() - o1.length();			
		Arrays.sort(sentenceOfFiveWords, new SentenceOfFiveWords().new WordComparatorLength());
		System.out.println(sentenceOfFiveWords[0]);
	}
	
	class WordComparatorLength implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {			
			return o2.length() - o1.length();
		}
		
	}
}





