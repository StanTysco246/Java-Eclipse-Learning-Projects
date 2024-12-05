/**
 * 
 */
package interface_learning;


/**
 * @author ICT
 *
 */
public abstract class AlphaAbstract <T extends Comparable<T> > {
	//private Map<Integer, String> mapList;
	
	private T a;
	private T b;
	
	AlphaAbstract(){
		//mapList = new HashMap<>();
	}
	
	public void setNumbers(T A, T B) {
		a = A;
		b = B;
	}
	
	public void printResults() {
		System.out.println("");
	}
}
