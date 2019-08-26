package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String template = "([-+][0-9]+\\.\\d{2})";
	
		System.out.println("Enter five number");
		System.out.println("First..");
		String first = "$"+ Float.parseFloat(br.readLine());
		System.out.println("Second..");
		String second = "$"+ Float.parseFloat(br.readLine());
		System.out.println("Third..");
		String thitd = "$"+ Float.parseFloat(br.readLine());
		System.out.println("Fourth..");
		String fourth = "$"+ Float.parseFloat(br.readLine());
		System.out.println("Fifth..");
		String fifth = "$"+ Float.parseFloat(br.readLine());
		String allCurr = first +" "+ second +" "+ thitd +" "+ fourth +" "+ fifth;
		System.out.println(allCurr);
		Pattern p = Pattern.compile(template);
		Matcher m = p.matcher(allCurr);
		while(m.find())
		{
			System.out.print("rezult "+allCurr);
			//Що не так тут? Нічого не фільтрує патерн
		}
		
	}

}
