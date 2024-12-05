/**
 * 
 */
package multithreading.tutorial;

import java.util.Random;

/**
 * @author ICT
 *
 */
public class Modules {
	private int randomNum;
	
	private final int constantNum;
	
	private Random rd;
	
	public Modules(int n) {
		// TODO Auto-generated constructor stub
		this.rd =  new Random();
		this.constantNum = rd.nextInt(100);
		this.randomNum = this.constantNum + n;
		
	}
	
	public synchronized void printRandomNumber() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Result: " + this.randomNum*i);
			
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
