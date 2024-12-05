/**
 * 
 */
package multithreading.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ICT
 *
 */
public class ThreadDriver {

	public static void doThread(Thread t) {
		if (t instanceof ThreadTest) {
			ThreadTest threadTest = (ThreadTest) t;
			threadTest.setMaxRange(50);
			System.out.println(threadTest.getMaxRange());
			//threadTest.start();
		}
		else if (t instanceof ThreadTest2) {
			ThreadTest2 threadTest2 = (ThreadTest2) t;
			threadTest2.setSearchedString("Hi");
			System.out.println(threadTest2.getSearchedString());
			
			//threadTest2.start();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RunnableTest rt1 = new RunnableTest("Thread-Alpha");
		//rt1.start();
		
		//RunnableTest rt2 = new RunnableTest("Thread-Omega");
		//rt2.start();
		
		List<RunnableTest> runnableTests = new ArrayList<>();
		
		int max_threads = 5;
		int max_executors = 3;
		
		for(int i=0; i < max_threads; i++) {
			runnableTests.add(new RunnableTest("Thread-"+ i));
		}
		/*
		ExecutorService executorService = Executors.newFixedThreadPool(max_executors);
		
		for(int i=0; i < max_threads; i++) {
			executorService.execute( runnableTests.get(i) );
		}
		executorService.shutdown();
		
		
		Thread thread1 = new ThreadTest(100);
		thread1.setPriority(Thread.MAX_PRIORITY);
		//thread1.setDaemon(true);
		System.out.println("Starting " + thread1.getName());
		//thread1.start();
		
		Thread thread2 = new ThreadTest2("Hello World!");
		thread2.setDaemon(true);
		System.out.println("Starting: " + thread2.getName());
		 */
		
		Thread thread3 = new ThreadTest3(5);
		System.out.println("Starting: " + thread3.getName());
		
		
		Thread thread3b = new ThreadTest3(100);
		System.out.println("Starting: " + thread3b.getName());
		
		thread3.start();
		thread3b.start();
		//thread2.start();
		/*
		try {
			thread2.join();
			//thread1.wait();
			//thread2.wait();
		}catch(InterruptedException e) {
			System.out.println("Thread: " + thread2.getName() + " interrupted");
		}
		  
		 */
		
		
		
		//thread1.interrupt();
		//thread2.interrupt();
		
		//doThread(thread1);
		//doThread(thread2);
	}

}
