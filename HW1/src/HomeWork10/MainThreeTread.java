package HomeWork10;

import java.lang.Thread.State;

/*Run three threads and output there different messages for 5 times. 
 *The third thread supposed to start after finishing working of the two previous threads.
 *Cause a deadlock. Organize the expectations of ending a thread in main(), 
 *and make the end of the method main() in this thread.
*/
public class MainThreeTread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread(" Tread one messenge 1 "));
		Thread t2 = new Thread(new MyThread(" Tread two messenge 1 "));		
		Thread t3 = new Thread(new MyThread(" Tread three messenge 1 "));		
		t1.start();		
		t2.start();	
		boolean bThread3 = true;
		do {			
			if(t1.getState() == State.TERMINATED && t2.getState() == State.TERMINATED) {
				t3.start();
				bThread3 = false;				
			}
		} while (bThread3);
		while (t3.getState() != State.TERMINATED) {	}		
		System.out.println("end main");
		
		
		
	}

}
