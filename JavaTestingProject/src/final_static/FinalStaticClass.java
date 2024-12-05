/**
 * 
 */
package final_static;

/**
 * @author ICT
 *
 */
public class FinalStaticClass extends StaticClass {
	public final static int num = 10; //final static = constant/gk akan berubah
	//public final static int num; final static must be declared
	
	/*
	FinalStaticClass(int i){
		num = i;
	}

	 */
	
	
	/*
	 * Static method can't be overridden
	@Override
	public void printWords() {
		
	} 
	 */
	
	
	public final static void printWords() {
		System.out.println(num);
	}
}	
	
