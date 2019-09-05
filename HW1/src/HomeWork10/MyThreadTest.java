package HomeWork10;

public class MyThreadTest implements Runnable {
	public void run() {
		Thread two = new Thread(new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName() + "  Thread number two");
				}
				Thread three = new Thread(new Runnable() {					
					@Override
					public void run() {
						for (int i = 0; i < 5; i++) {
							System.out.println(Thread.currentThread().getName() + "  Thread number three");
						}					
					}					
				});
				three.start();
			}
		});
		two.start();
	}


}
