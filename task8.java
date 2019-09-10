package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number in range 1 to 1 000 000");
		String number = br.readLine();
		int inumber = Integer.parseInt(number);
		if (inumber < 1 || inumber > 1000000) {
			System.out.println("Incorect number");
		} else {
			int ts1, ts10, ts100;
			if (inumber >= 1000 && inumber < 10000) {
				System.out.println("The number is "+getNum(number.substring(0, 1))+" thousand "+getNum(number.substring(1)));
			} else if (inumber >= 10000 && inumber < 100000) {
				System.out.println("The number is "+getNum(number.substring(0, 2))+" thousand "+getNum(number.substring(2)));
			} else if (inumber >= 100000 && inumber < 1000000) {
				System.out.println("The number is "+getNum(number.substring(0, 3))+" thousand "+getNum(number.substring(3)));
			}else
				System.out.println("The number is one million");
		}
	}

	public static String getNum(String number) {
		String[] num   = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] num10 = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] num11 = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String hundred = "hundred";

		char[] cnum = number.toCharArray();
		int inumber = Integer.parseInt(number);

		if (cnum.length == 1) {
			return (num[Character.getNumericValue(cnum[0])]);
		} else if (cnum.length == 2 && inumber > 10 && inumber < 20) {
			return (num11[inumber - 10]);
		} else if (cnum.length == 2 && inumber == 10 || inumber == 20 || inumber == 30 || inumber == 40 || inumber == 50
				|| inumber == 60 || inumber == 70 || inumber == 80 || inumber == 90) {
			return (num10[inumber / 10]);
		} else if (cnum.length == 2 && inumber >= 20) {
			return (num10[Character.getNumericValue(cnum[0])] + " " + num[Character.getNumericValue(cnum[1])]);
		} else if (cnum.length == 3 && inumber == 100 || inumber == 200 || inumber == 300 || inumber == 400
				|| inumber == 500 || inumber == 600 || inumber == 700 || inumber == 800 || inumber == 900) {
			return (num[inumber / 100] + " " + hundred);
		} else if (cnum.length == 3 && inumber > 110 && inumber < 120) {
			return (num[inumber / 100] + " " + hundred + " " + num11[Character.getNumericValue(cnum[2])]);
		} else if (cnum.length == 3 && inumber >= 120) {
			return (num[inumber / 100] + " " + hundred + " " + num10[Character.getNumericValue(cnum[1])] + " "
					+ num[Character.getNumericValue(cnum[2])]);
		}
		return hundred;

	}

}
