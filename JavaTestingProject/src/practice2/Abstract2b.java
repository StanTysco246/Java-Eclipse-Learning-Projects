/**
 * 
 */
package practice2;
import practice1.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
/**
 * @author ICT
 *
 */
public abstract class Abstract2b implements Interface1b {
	
	private Set<Integer> setQ = new HashSet<>();
	public Random rd = new Random();
	
	@Override
	public void makeList(int x) {
		for(int i = 0; i < x; i++) {
			setQ.add(rd.nextInt(x+number));
		}
		System.out.println(setQ);
	}
	
	
	public boolean isPalindrome(String in) {
		String temp = "";
		for(int i=in.length()-1; i >= 0; i--) {
			temp += in.charAt(i);
		}
		//System.out.println(temp);
		
		
		if(in.equals(temp)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected abstract void printRandomNumbers(int x);
}
