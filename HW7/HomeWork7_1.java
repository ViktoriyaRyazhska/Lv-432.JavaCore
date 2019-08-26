package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class HomeWork7_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence of five words");
		String sent = " "+br.readLine();
		sent.trim();
		String[] sen;
		sen = sent.split(" ");
		String longWord = sen[0];
		int countLetter = -1;
		for(int i=0; i<sen.length; i++) {
			if(sen[i].length() > longWord.length()) {
				longWord = sen[i];
				countLetter = sen[i].length();
			}
		}
		Arrays.sort(sen, Collections.reverseOrder());
		/*як сортувати масив не по алфавіту а по словах?*/
		for(String s : sen)
		{
			System.out.println(s);
		}
		System.out.println("long word is " + longWord + ", count letter is " + countLetter + ", the second word in reverse order is " + sen[1]);
	}

}

