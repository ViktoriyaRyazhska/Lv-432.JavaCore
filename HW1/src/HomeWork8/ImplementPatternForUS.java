package HomeWork8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementPatternForUS {
	/*Implement a pattern for US currency: the first symbol "$", 
	 * then any number of digits, dot and two digits after the dot.
	 *  Enter the text from the console that contains several occurrences of US currency. 
	 *  Display all occurrences on the screen.
	 */
	public static void main(String[] args) {
		String strUS = "txt $1,100,120.5 text $1.50 dcvvf $456,152.50";		
		Pattern currencyUS = Pattern.compile("[$](\\d?[,]?)*[\\.]\\d+");
		Matcher matcher = currencyUS.matcher(strUS);
		matcher.reset();
		while (matcher.find()) {
			System.out.println(strUS.substring(matcher.start(), matcher.end()));
		}
	}

}
