/**
 * 
 */
package practice2;
import practice1.*;
import java.util.List;
import java.util.ArrayList;
/**
 * @author ICT
 *
 */
abstract class Abstract2 implements Interface2, Interface1b {
	
	private List<Integer> listAdd =  new ArrayList<>();
	
	
	@Override
	public void printWords(String str) {
		System.out.println(text+str);
	}
	
	@Override
	public void makeList(int x) {
		listAdd.add(1);
		listAdd.add(3);
		listAdd.add(3);
		List<Integer> listQ = new ArrayList<>();
		for(int i=0; i < x; i++) {
			listQ.add(x-i);
		}
		listQ.addAll(2, listAdd);
		System.out.println(listQ);
	}
	
	public final void printing() {
		System.out.println("Hello World");
	}
	
	protected abstract void printStars(int x);
}
