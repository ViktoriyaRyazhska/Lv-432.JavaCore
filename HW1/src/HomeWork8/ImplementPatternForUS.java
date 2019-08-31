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
		//$111,111,111.00
		String strUS = "txt $100,120.56 text $1.50 dcvvf $46,152.5000 $150.10 don't $1.125.25";		
		//Pattern currencyUS = Pattern.compile("[$](\\d?[,]?)*[\\.]\\d");
		Pattern currencyUS = Pattern.compile("[$]((\\d{1,3}[,])*(\\d{3}[.]\\d{2}))|[$]\\d{1,3}[.]\\d{2}");
		Matcher matcher = currencyUS.matcher(strUS);
		matcher.reset();
		while (matcher.find()) {
			System.out.println(strUS.substring(matcher.start(), matcher.end()));
		}
		
		
		
	}

}
