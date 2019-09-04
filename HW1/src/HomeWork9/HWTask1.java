package HomeWork9;
/*Create method div(), which calculates the dividing of two double numbers.
 *  In main method input 2 double numbers and call this method.
 *   Catch all exceptions. 
 */
public class HWTask1 {

	public static void main(String[] args) {
		double rezDiv;
		try {
			rezDiv = div(2.0, 5);
			System.out.println("rezDiv = " + rezDiv);
		} catch (Exception e) {
			e.printStackTrace();			
		}

	}
	public static double div(double a, double b) throws Exception {
		if (b == 0.0) {
			throw new Exception("Division of an integer by zero is not determined...");
		}
		return a/b;
	}

}
