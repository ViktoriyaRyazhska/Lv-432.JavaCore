package HomeWork10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date. 
 */
public class TextTaskfour {
	private static final String myCareerTxt = "file1.txt";
	private static final String myCareerTxtWrite = "file2.txt";
	public static void main(String[] args) {
		List<String> myFile1Read = new ArrayList<String>();
		List<String> myWriteRead = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(myCareerTxt);
			BufferedReader br = new BufferedReader(fr);
			String str;
			try {
				while ((str = br.readLine()) != null) {
					myFile1Read.add(str);
				}
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String string : myFile1Read) {
			System.out.println(string);
		}
		myWriteRead.add("number of lines in file1.txt = "+String.valueOf(myFile1Read.size()));
		Comparator<String> comparator = (s1,s2)-> s1.length() - s2.length();
		myFile1Read.sort(comparator);
		myWriteRead.add("the longest line in file1.txt = "+myFile1Read.get(myFile1Read.size()-1));

		Pattern p = Pattern.compile("name | birthday");
		Matcher m;
		for (String string : myFile1Read) {
			m = p.matcher(string);
			while (m.find()) {
				myWriteRead.add(string);
			}
		}
		try(FileWriter fw = new FileWriter(myCareerTxtWrite)) {
			for (String string : myWriteRead) {
				fw.write(string+"\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
