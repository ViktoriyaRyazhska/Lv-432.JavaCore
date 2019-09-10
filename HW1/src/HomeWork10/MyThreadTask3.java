package HomeWork10;

public class MyThreadTask3 extends Thread {
	public final Object monitor = new Object();
	String messege;
	int messengTimes;
	Thread thread;
	public MyThreadTask3() {}	
	public MyThreadTask3(String messege, int messengTimes) {
		this.messege = messege;
		this.messengTimes = messengTimes;		
	}
	public MyThreadTask3(Thread thread) {		
		this.thread = thread;
		
	}

	public MyThreadTask3(String messege, int messengTimes, Thread thread) {		
		this.messege = messege;
		this.messengTimes = messengTimes;
		this.thread = thread;
		//thread.start();
	}
	public void run() {	
		System.out.println(Thread.currentThread().getName()+" start thread...");
		for (int i = 0; i < messengTimes; i++) {
			System.out.println(messege);
			
		}
		
			if (thread != null) {				
				thread.start();
			}
		
		System.out.println(Thread.currentThread().getName()+" end thread...");
	}
	public Thread getThread() {
		return thread;
	}
}
