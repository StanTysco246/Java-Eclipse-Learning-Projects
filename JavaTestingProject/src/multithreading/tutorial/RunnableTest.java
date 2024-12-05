/**
 * 
 */
package multithreading.tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ICT
 *
 */
public class RunnableTest implements Runnable{

	private Thread thread;
	private String threadString;
	private ArrayList<Integer> numList;
	private LinkedList<Integer> linkedIntegers;
	
	public RunnableTest(String str) {
		// TODO Auto-generated constructor stub
		this.threadString = str;
		this.linkedIntegers = new LinkedList<>();
		this.numList = new ArrayList<>();
		System.out.println("Creating " + this.threadString);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + this.threadString);
		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("Thread: " + this.threadString + ", " + i);
				this.numList.add((int) (Math.random() * 100 + 1));
				System.out.println("Array List " + this.threadString + " : " + this.numList);
				Thread.sleep(100);
				this.linkedIntegers.add((int) (Math.random() * 100 + 1));
				System.out.println("Linked List " + this.threadString + " : " + this.linkedIntegers);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Thread: " + this.threadString + " interrupted");
		}
		System.out.println("Thread: " + this.threadString + " exiting");
	}
	
	public void start() {
		System.out.println("Starting: " + this.threadString);
		if(thread == null) {
			thread =  new Thread(this, threadString);
			//thread.setPriority(Thread.MIN_PRIORITY);
			//thread.setDaemon(true);
			thread.start();
		}
	}

}
