package ua.ivanskyi.fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {

	static void write(String text) {

		String fileName = "File2.txt";

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
			writer.write(text);
			writer.newLine();
			writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	static List<String> read() {
		String fileName = "File1.txt";
		List<String> list = new ArrayList<>();
		String textFrom;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			while ((textFrom = reader.readLine()) != null) {

				list.add(textFrom);

			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	static void longestLine(List<String> list) {
		String text = "Longest line is - ";
		String result = "";

		for (String str : list) {

			if (str.length() >= result.length()) {

				result = str;

			}

		}

		Start.write(text + result);
	}

	static void amountLines(List<String> list) {

		String text = "There are " + list.size() + " lines";

		Start.write(text);

	}

	static void findNameDate(List<String> list) {

		String namePattern = "[A-Z]{1}[a-z]+\\ [A-Z]{1}[a-z]+";
		String datePattern = "(\\d{2}\\.){2}\\d{4}";

		String name = "";
		String date = "";

		Pattern pn = Pattern.compile(namePattern);
		Pattern pd = Pattern.compile(datePattern);

		for (String text : list) {

			Matcher mn = pn.matcher(text);
			while (mn.find()) {
				name = text.substring(mn.start(), mn.end());
				Start.write(name);

			}

			Matcher md = pd.matcher(text);
			while (md.find()) {
				date = text.substring(md.start(), md.end());
				Start.write(date);

			}

		}

	}

	public static void main(String[] args) {
		Start.amountLines(Start.read());
		Start.longestLine(Start.read());
		Start.findNameDate(Start.read());

	}

}
