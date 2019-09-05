package HomeWork10;

public class App2 {

	public static void main(String[] args) {
		Thread one = new Thread(new MyThreadTest());
		one.start();
	}

}
