package PracticalTask10;

public class PT1 {

	public static void main(String[] args) {
		//Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);)
		String s = "I study Java";
		for (int i = 0; i < 10; i++) {
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*Output two messages «Hello, world» and «Peace in the peace» 
		 * 5 times each with the intervals of 2 seconds, and the second - 3 seconds. 
		 * After printing messages, print the text «My name is …»
		 */
		String str1 = "Hello, world";
		String str2 = "Peace in the peace";
		String str3 = "My name is …";
		for (int i = 0; i < 5; i++) {			
			try {
				System.out.println(str1);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println(str2);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(str3);
	}

}
