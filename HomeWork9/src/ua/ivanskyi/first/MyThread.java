package ua.ivanskyi.first;

public class MyThread implements Runnable {

	private String message;

	@Override
	public void run() {
		int n = 5;
		while (n > 0) {
			System.out.println(Thread.currentThread().getName());
			n--;
		}

	}

}
