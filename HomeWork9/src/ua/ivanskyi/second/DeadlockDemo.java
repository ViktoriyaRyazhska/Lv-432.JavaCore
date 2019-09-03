package ua.ivanskyi.second;

public class DeadlockDemo {

	public static void main(String s[]) {

		ResourceOne r1 = new ResourceOne();
		ResourceTwo r2 = new ResourceTwo();

		synchronized (r1) {

			try {
				r1.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			synchronized (r2) {

			}

		}

		Thread t1 = new Thread() {
			public void run() {
				synchronized (r2) {

					try {
						r2.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					synchronized (r1) {

					}
				}
			}
		};

		t1.start();

	}
}
