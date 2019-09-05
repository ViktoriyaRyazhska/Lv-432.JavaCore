package HomeWork10;
/*Create a thread «one», which would start the thread «two», 
 * which has to output its number («Thread number two») 3 times and create thread «three», 
 * which would to output message «Thread number three» 5 times.*/
public class MainTask3 {

	public static void main(String[] args) {
		Thread three = new Thread(new MyThreadTask3("Thread number three", 5));
		Thread two = new Thread(new MyThreadTask3("Thread number two", 3, three));	
		Thread one = new MyThreadTask3("Thread number one",2,two);
		one.start();
		
		
	}

}
