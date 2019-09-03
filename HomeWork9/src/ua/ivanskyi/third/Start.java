package ua.ivanskyi.third;

public class Start {

	public static void main(String[] args) {

		String pattern = "Thread number ";

		Thread t1 = new Thread("One") {

			@Override
			public void run() {
				System.out.println(pattern + Thread.currentThread().getName());
				Thread t2 = new Thread("Two") {
					@Override
					public void run() {
						for (int x = 0; x < 3; x++) {

							System.out.println(pattern + Thread.currentThread().getName());
						}
						Thread t3 = new Thread("Three") {

							public void run() {
								for (int x = 0; x < 5; x++) {

									System.out.println(pattern + Thread.currentThread().getName());
								}

							};
						};
						t3.start();
					}

				};

				t2.start();

			}

		};

		t1.start();
	}
}