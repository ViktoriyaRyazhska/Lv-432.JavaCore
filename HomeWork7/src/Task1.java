import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter sentence of five words");
		int lenght = 0;
		String[] sentence = sc.nextLine().split(" ");
		String bigest = sentence[0];
		for (int i = 1; i < sentence.length; i++) {
			if (sentence[i].length() > bigest.length()) {
				bigest = sentence[i];

			}

		}
		StringBuilder strBilder = new StringBuilder(bigest);

		strBilder.reverse();

		System.out.println(bigest + " - " + bigest.length() + " number of letter");

		System.out.println("Reverse stupid is: " + strBilder);
		
		sc.close();
	}

}