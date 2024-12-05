/**
 * 
 */
package multithreading.tutorial;

import java.util.Iterator;

/**
 * @author ICT
 *
 */
public class ThreadTest3 extends Thread {

	private Modules modules;
	
	public ThreadTest3(int n) {
		// TODO Auto-generated constructor stub
		modules = new Modules(n);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		modules.printRandomNumber();
	}
	
	
}
