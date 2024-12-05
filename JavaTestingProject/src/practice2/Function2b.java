/**
 * 
 */
package practice2;
import java.util.HashMap;
import java.util.Map;
/**
 * @author ICT
 *
 */
class Function2b {
	
	private Map<Integer, String> mapQ;
	
	public Function2b(){
		mapQ = new HashMap<>();
	}
	
	protected void addElement(int num, String str) {
		if(mapQ.containsKey(num)) {
			mapQ.put(num,str);
			System.out.println("Editted Successfully");
		}
		else {
			mapQ.put(num,str);
			System.out.println("Added Successfully");
		}
		
	}
	
	public void removeElementByKey(int num) {
		mapQ.remove(num);
	}
	
	
	public String getValue(int num) {
		return mapQ.get(num);
	}

}
