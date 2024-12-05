/**
 * 
 */
package interface_learning;
import java.util.*;
/**
 * @author ICT
 *
 */
public final class BetaClass {
	private List<String> arrayList;
	
	BetaClass(){
		arrayList = new ArrayList<>();
	}
	
	public List<String> getList(){
		return this.arrayList;
	}
	
	public void addString(String e) {
		this.arrayList.add(e);
		System.out.println("Element: " + e + " has been added successfully");
	}
	
	public String getStringByIndex(int i) {
		return this.arrayList.get(i);
	}
	
	public void removeString(String e) {
		if(this.arrayList.remove(e)) {
			System.out.println("Element: " + e +" has been removed successfully");
		}
		else {
			System.out.println("This element is not in this list");
		}
	}
	
	public void removeStringByIndex(int i) {
		System.out.println("Removed element: " + this.arrayList.remove(i));
	}
	
	public void addStringByIndex(int i, String e) {
		this.arrayList.add(i, e);
		System.out.println("Element: " + e + " has been added successfully at index " + i);
	}
	
	public void replaceStringByIndex(int i, String e) {
		this.arrayList.set(i, e);
		System.out.println("Element at index: " + i + " has been replaced successfully with Element: " + e);
	}
	
	public void replaceStringByOldOne(String o, String n) {
		if(this.arrayList.indexOf(o) != -1) {
			this.arrayList.set(this.arrayList.indexOf(o), n);
			System.out.println("Old Element: " + o + " has been replaced successfully with New Element: " + n);
		}
		else {
			System.out.println("Old Element: " + o + " is not found in this list");
		}
	}
	
	public void printList() {
		System.out.println(this.arrayList);
	}
	
	
}
