package com.softserve.edu.task_3;

import java.util.regex.*;

public class Currency {

	public static void main(String[] args) {
		String pattern = "\\$(\\d+)\\.\\d{2}";
		String text = "Different prices $2.50, $3.90, $345.25, $67.89, $125.78 ";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		m.reset();
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}

	}

}
