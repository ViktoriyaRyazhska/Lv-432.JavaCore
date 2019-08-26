package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork7_2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a sentence that contains the words between more than one space");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
				
		System.out.println(sentence.trim().replaceAll(" +"," "));
	}

}
