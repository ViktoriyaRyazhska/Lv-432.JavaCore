package PracticalTask8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class StringPracticalMain {

	public static void main(String[] args) throws IOException {
		/*Enter the two variables of type String. 
		 * Determine whether the first variable substring second. 
		 * For example, if you typed «IT» and «IT Academy» you must receive true.
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 ="";
		//str1 = reader.readLine();
		String str2 = "" ;
		//str2 = reader.readLine();
		boolean b = false;
		if (str1.length() <= str2.length()) {
			if(str1.equals(str2.substring(0, str1.length()))) {
				b = true;
				System.out.println(b);
			}else {
				System.out.println(b);
			}
		}
		/*Enter surname, name and patronymic on the console as a variable of type String. 
		 * Output on the console:
			surnames and initials
			name
			name, middle name and last name
		 */
		String name = "";
		//name = reader.readLine();
		String surname = "";
		//surname = reader.readLine();
		String patronymic = "";
		//patronymic  = reader.readLine();
//		System.out.println(surname + " "+name.substring(0,1)+"."+patronymic.substring(0,1)+".");
//		System.out.println(name);
//		System.out.println(name+" "+surname +" "+patronymic);
		/*The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. 
		 * Using regular expressions implement checking the user name for validity. 
		 * Input five names in the main method . 
		 * Output a message to the console of the validation of each of the entered names.
		 */
		String[] userName = new String[5];
		System.out.println("Enter five the user name can be 3 to 15 characters of the Latin alphabet,"
				+ " numbers, and underscores");
		for (int i = 0; i < 5; i++) {
			userName[i] = reader.readLine();
		}
		for (String string : userName) {
			if (string.length()>=3 && string.length() < 16) {
				Pattern pattern = Pattern.compile("\\w*|_*");
				Matcher matcher = pattern.matcher(string);
				while (matcher.find()) {
					System.out.println(string.substring(matcher.start(), matcher.end()));
				}
			}else {
				System.out.println("User name must: "
						+ "The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores");
			}
		}
		
	}

}
