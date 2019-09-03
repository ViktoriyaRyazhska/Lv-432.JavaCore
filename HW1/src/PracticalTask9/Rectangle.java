package PracticalTask9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Create a method for calculating the area of a rectangle 
	int squareRectangle (int a, int b), 
which should throw an exception if the user enters negative value. 
Input values a and b from console. Check the squareRectangle method in the method main. 
Check to input nonnumeric value.
 */
public class Rectangle {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		int sguare = 0;
		System.out.println("Plese numbers...");
		try {
			a = Integer.parseInt(reader.readLine()) ;
			b = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		 sguare = squareRectangleame(a, b);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println(sguare);

	}
	public static int squareRectangleame(int a, int b) throws Exception{
		if (a < 0 || b < 0) {
			throw new Exception("there can be a negative value");
		}
		return a * b;
	}
}
