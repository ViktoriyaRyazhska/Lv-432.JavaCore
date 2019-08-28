import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Input sentence witch has mor than one space");
		Scanner sc = new Scanner(System.in);
		String santence = sc.nextLine();
		
		santence = santence.replaceAll("  +"," ");
		santence = santence.trim();
		System.out.println(santence);
		
		
	}

}
