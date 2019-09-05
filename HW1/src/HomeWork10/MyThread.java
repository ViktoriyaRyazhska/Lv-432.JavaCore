package HomeWork10;

public class MyThread implements Runnable{
	private String messenge;
	private static final Object monitor = new Object();
	public MyThread(String messenge) {		
		this.messenge = messenge;
	}

	@Override
	public void run() {			
			for (int i = 0; i < 5; i++) {
				System.out.println(messenge);				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
			
	}
}
