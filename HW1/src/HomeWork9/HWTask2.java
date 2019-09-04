package HomeWork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*Write a method readNumber(int start, int end),
 *  that read from console integer number and return it,
 *   if it is in the range [start...end]. 
 *   If an invalid number or non-number text is read, the method should throw an exception. 
 */
public class HWTask2 {

	public static void main(String[] args) {
		//If an invalid number or non-number text is read, the method should throw an exception.
		
		int readConsole;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please integer number included in the parameters 10...30");
		try {
			readConsole = Integer.parseInt(reader.readLine());
			try {
				System.out.println(readNumber(readConsole, 10, 30));				
			} catch (Exception e) {				
				System.out.println(e.getMessage());
			}
		} catch (NumberFormatException | IOException e) {			
			System.out.println(e.getMessage());
		}
		 
		/*Using this method write a method main(), that has to enter 10 numbers:
		a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
		 */
		Random random = new Random();
		int counter = 10;
		while (counter > 0) {
			try {
				int randomNumber = random.nextInt(500);
				readNumber(randomNumber, 1, 100);
				System.out.println(randomNumber);
				counter--;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}
	public static int readNumber(int readConsole, int start, int end) throws Exception {
		if (start<= readConsole && readConsole <=end) {
			return readConsole;
		}
		throw new Exception("the number is not included in the parameters start...end");
	}
}
