/**
 * 
 */
package generic_type;

import java.util.Map;

/**
 * @author ICT
 *
 */
public class GenericClass<T extends Comparable<T> > {
	T element1;
	T element2;
	
	GenericClass(T e1, T e2){
		this.element1 = e1;
		this.element2 = e2;
	}
	
	public T maxValue() {
		if(this.element2.compareTo(this.element1) > 0) {
			return this.element2;
		}
		return this.element1;
	}
	
	public void swapValue() {
		
		System.out.println("Before: ");
		System.out.println(this.element1);
		System.out.println(this.element2);
		
		T temp = this.element1;
		this.element1 = this.element2;
		this.element2 = temp;
		
		System.out.println("After: ");
		System.out.println(this.element1);
		System.out.println(this.element2);
	}
}
