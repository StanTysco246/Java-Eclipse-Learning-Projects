/**
 * 
 */
package final_static;

/**
 * @author ICT
 *
 */
public class FinalStaticDriver {

	
	public void sum(int a, int b) {
		System.out.println(a+b);
		//subtract(a, b); static method can be accessed inside non-static method
	}
	
	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinalClass fc = new FinalClass("Hello, Final!");
		FinalClass fc2 = new FinalClass("Hello, Fantasy!");
		
		StaticClass sc =  new StaticClass();
		StaticClass sc2  = new StaticClass();
		
		FinalStaticClass fsc = new FinalStaticClass();
		
		sc.words = "Hello, Static!";
		sc2.num = 3*5;
		
		fc.printWords();
		fc2.printWords();
		
		sc.printWords();
		sc2.printWords();
		
		StaticClass.printWords(); //static field and method can be called without having new instance of class
		sc.printNumbers();
		sc2.printNumbers();
		
		fsc.printWords();
		//fsc.num = 10;
		
		/*
		 * static method have to be called inside static method
		sum(5,2);
		subtract(2,3); 
		 */
		
		
		// TODO Auto-generated method stub

	}

}
