/**
 * 
 */
package errorLearning;
import java.util.*;
import java.sql.Date;

/**
 * @author ICT
 *
 */
public class TestClass extends Thread {
	public String a;
	public int i;
	private List<Integer> intList;
	
	public void printWords() {
		System.out.println("Hello World!");
	}
	
	public <T> void testStateException(List<T> inList) {
		Iterator<T> iter = inList.listIterator();
		iter.remove();
	}
	
	public void testArgumentException(String date) {
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:SS");
		//LocalDate ld = LocalDate.parse(date);
		Date dt = Date.valueOf(date);
		System.out.println(dt);
	}
	
	public void testArrayIndexOutOfBoundsOnList(int num) {
		intList = Arrays.asList(1, 2, 3, 4, 5);
		
		System.out.println(intList.get(num));
		
	}
}
