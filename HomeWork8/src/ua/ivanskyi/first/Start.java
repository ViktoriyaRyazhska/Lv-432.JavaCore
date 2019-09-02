package ua.ivanskyi.first;

public class Start {

	static double div(double x, double y) throws ArithmeticException {

		if (y == 0) {
			throw new ArithmeticException();
		}

		return x / y;

	}

	public static void main(String[] args) {

		double x = 10;
		double y = 1;
		double result = 0.0;

		try {

			result = Start.div(x, y);

		} catch (ArithmeticException e) {

			System.out.println("Number cannot be zero");

		}

		System.out.println(result);

	}

}
