package com.softserve.training;

public class ThreadTest implements Runnable {

	public final static ThreadGroup GROUP = new ThreadGroup("Daemon demo");
	private int start;

	public ThreadTest(int s) {
		start = (s % 2 == 0) ? s : s + 1;
		new Thread(GROUP, this, "Thread " + start).start();
	}

	public void run() {
		for (int i = start; i > 0; i--) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}

			if (start > 2 && i == start / 2) {
				new ThreadTest(i);
			}
		}
	}

	public static void main(String s[]) {
		new ThreadTest(16);
		new DaemonDemo();
	}
}

/////////////////////////////////////////////////////////////

class DaemonDemo extends Thread {
	public DaemonDemo() {
		super("Daemon demo thread");
		setDaemon(true);
		start();
	}

	public void run() {
		Thread threads[] = new Thread[10];
		while (true) {
			int count = ThreadTest.GROUP.activeCount();
			if (threads.length < count) {
				threads = new Thread[count + 10];
			}
			count = ThreadTest.GROUP.enumerate(threads);

			for (int i = 0; i < count; i++) {
				System.out.print(threads[i].getName() + ", ");
			}
			System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}
