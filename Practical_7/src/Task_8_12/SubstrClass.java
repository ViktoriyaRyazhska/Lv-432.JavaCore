package Task_8_12;

public class SubstrClass {

	public static void main(String[] args) {
		String s = "IT";
		String s1 = "IT Academy";
		System.out.println("The first variable substring second: " + s1.startsWith(s));

		// Enter surname, name and patronymic on the console as a variable of type
		// String

		String str = "Kalynivska Oksana Anatoliivna";
		
		// surnames and initials
		String str1 = str.replaceAll("Oksana Anatoliivna", "O. A.");
		System.out.println(str1);
		
		// name
		String str2 = str.substring(10, 17);
		System.out.println(str2.trim());
		
		// name, middle name and last name
		String str3 = str.substring(10);
		String str4 = str.substring(0, 10);
		System.out.println(str3.trim() + " " + str4);

	}

}
