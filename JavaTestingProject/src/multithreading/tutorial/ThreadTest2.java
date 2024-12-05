/**
 * 
 */
package multithreading.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author ICT
 *
 */
public class ThreadTest2 extends Thread {

	private List<String> existList = Arrays.asList("Hi", "Hola","Nihao", "Konnichiwa", "Hello", "Halo", "Hai", "Hey", "Bonjour");
	private String searchedString;
	
	public ThreadTest2(String str) {
		// TODO Auto-generated constructor stub
		this.searchedString = str;
	}
	
	public void setSearchedString(String searchedString) {
		this.searchedString = searchedString;
	}
	
	public String getSearchedString() {
		return searchedString;
	}
	
	private Optional<String> filterString(){
		return this.existList.stream().filter(x -> x.equalsIgnoreCase(this.searchedString)).findAny();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Optional<String> foundOptional = this.filterString();
		foundOptional.ifPresentOrElse(x -> System.out.println("Thread: " + this.getName() + " founds " + x + " inside the list"), 
				() -> System.out.println("Thread: " + this.getName() + " cannot find it inside the list"));
	}
}
