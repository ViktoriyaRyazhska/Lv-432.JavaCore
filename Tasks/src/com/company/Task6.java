package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Input text and calculate number of words in this text
 * @author 999
 *
 */
public class Task6 {	
	public static int numberOfWords() {
		System.out.println("Enter string");
		String text = new Scanner(System.in).nextLine();
		List<String> textOfWord = new ArrayList<String>();	
		Pattern pattern = Pattern.compile("[A-Za-z]+");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {			
			textOfWord.add(text.substring(matcher.start(), matcher.end()));
		}
		return textOfWord.size();		
	}
}
