/**
 * 
 */
package multithreading.tutorial;

/**
 * @author ICT
 *
 */
public class ThreadTest extends Thread {

	private int maxRange;
	
	public ThreadTest(int max) {
		// TODO Auto-generated constructor stub
		this.maxRange = max;
	}
	
	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}
	
	public int getMaxRange() {
		return maxRange;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int pair1, pair2, count=0;
		Boolean isRunning = true;
		while(isRunning) {
			pair1 = (int) (Math.random() * this.maxRange + 1);
			pair2 = (int) (Math.random() * this.maxRange + 1);
			count++;
			if(pair1 == pair2) {
				isRunning = false;
			}
		}
		System.out.println("Thread: "+ this.getName() + " gets a pair of same number at the count of " + count);
		
	}
}
