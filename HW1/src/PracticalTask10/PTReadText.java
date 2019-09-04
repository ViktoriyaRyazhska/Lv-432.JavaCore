package PracticalTask10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Prepare mytext.txt file with a lot of text inside.
Read context from file into array of strings.
Each array item contains one line from file.
Complete next tasks:
   1) count and write the number of symbols in every line.
   2) find the longest and the shortest line. 
   3) find and write only that lines, which consist of word «var»
*/
public class PTReadText {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String nameFile = "mytext.txt";
		String s;
		try {
			FileReader fr = new FileReader(nameFile);
			BufferedReader br = new BufferedReader(fr);
			try {				
				while (( s = br.readLine()) != null) {
					list.add(s);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//1) count and write the number of symbols in every line.
		for (String string : list) {
			System.out.println("the number of symbols = "+string.length()+". line = "+string);
		}
		//2) find the longest and the shortest line.
		System.out.println("--------------------------------------------------------------");
		Comparator<String> c = (s1, s2) -> s1.length()-s2.length();
		list.sort(c);
		System.out.println(list.get(list.size()-1).length()+" symbols :"+list.get(list.size()-1));
		//3) find and write only that lines, which consist of word «var»
		System.out.println("--------------------------------------------------------------");
		Pattern p = Pattern.compile("only");
		Matcher m;
		for (String string : list) {
			m = p.matcher(string);			
			while (m.find()) {
				System.out.println(string);
			}
		}
	}

}
