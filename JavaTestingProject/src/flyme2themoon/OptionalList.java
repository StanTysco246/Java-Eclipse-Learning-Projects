/**
 * 
 */
package flyme2themoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author ICT
 *
 */
public class OptionalList {
	
	private List<Valkryrie> list1;
	private Optional<Valkryrie> optional1;
	
	public OptionalList() {
		// TODO Auto-generated constructor stub
		this.list1 = new ArrayList<>();
	}
	
	public OptionalList(List<Valkryrie> l) {
		this.list1 = new ArrayList<>();
		this.list1.addAll(l);
	}
	
	public void addAllintoList(List<Valkryrie> l) {
		this.list1.addAll(l);
	}
	
	public Valkryrie getAnotherName() {
		return new Valkryrie("Durandal", 4);
	}
	
	public String getNameByIndex(int i) {
		return list1.get(i).toString();
	}
	
	public Optional<Valkryrie> getOptionalFromList(String str){
		//optional1 = Optional.ofNullable(str);
		return this.list1.stream().filter(x -> x.name.equalsIgnoreCase(str) ).findAny();
	}
	
	public void printOptionalResult(String str) {
		this.optional1 = this.getOptionalFromList(str);
		this.optional1.ifPresentOrElse(x -> System.out.println("Found: " + x), () -> System.out.println("Not Found"));
		System.out.println("Result: " + this.optional1.orElseGet( () -> this.getAnotherName() ));
		System.out.println("Is it empty? " + this.optional1.isEmpty());
		System.out.println("Is it present? " + this.optional1.isPresent());
	}
	

}
