package ua.ivanskyi.first;

public class Start {

	public static void main(String[] args) {
		Runnable run = new MyThread();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		t3.start();

	}

}
