import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		
		System.out.println("How mach $ you wonna have?");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String pattern = "\\$(\\d*)(\\.\\d{2})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		if (m.matches()) {
			System.out.println("User wrote right sum");
		}else {
			System.out.println("User wrote wrong right sum");
		}
		m.reset();
		
	
	}

}
