package Task_8_3;

import java.util.regex.*;

public class RegularExp {

	public static void main(String[] args) {
	
		String pattern = "(\\_)*(\\d)*\\w{3,15}+";
		// String n1=" 3Justin_23Jones1"; //true
		String n1 = "67MatthewSmith_1R"; // true
		// String n1="WilliamJ_2Brown";//true
		// String n1="Tomash_Miller14 ";//true
		// String n1="_Tom_Gregor11_13"; //true
		// String n1="LindaMc_123_14"; //true
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(n1.trim());
		if (m.matches()) {
			System.out.println("n1 correspond pattern");
		} else {
			System.out.println("n1 NOT correspond pattern");
		}
		m.reset();
		while (m.find()) {
			System.out.println(n1.substring(m.start(), m.end()) + "*");
		}

	}

}
