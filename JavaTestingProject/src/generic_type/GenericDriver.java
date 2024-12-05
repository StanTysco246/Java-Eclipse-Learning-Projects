/**
 * 
 */
package generic_type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import errorLearning.*;

/**
 * @author ICT
 *
 */
public class GenericDriver {

	
	public static <T> void checkValue(Map<T, Boolean> inMap, T key) {
		if(inMap.get(key)) {
			System.out.println("This key is valid");
		}
		else {
			System.out.println("This key is invalid");
		}
	}
	
	//static int i = 5;
	//final int j = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//final int j = 10;
		GenericClass<Integer> intGen = new GenericClass<>(2, 7);
		GenericClass<String> strGen = new GenericClass<>("Jack","Alibaba");
		//GenericClass<Drink> drinkGen = new GenericClass<>(null, null);
		
		//GenericClass2<String, Boolean> strPair =  new GenericClass2<>("K.K", true);
		//GenericClass2<Integer, Boolean> intPair = new GenericClass2<>(1, false);
		
		
		System.out.println("Max number: " + intGen.maxValue());
		System.out.println("Max value of String: " + strGen.maxValue());
		
		Map<String, Boolean> strMap = new HashMap<>();
		Map<Integer, Boolean> intMap = new HashMap<>();
		
		
		
		strMap.put("a", true);
		//strMap.put(1, false); compile error due to generic type has been changed into String type
		strMap.put("b", true);
		strMap.put("c", false);
		strMap.put("d", true);
		
		intMap.put(1, true);
		intMap.put(2, false);
		intMap.put(3, true);
		intMap.put(4, true);
		
		checkValue(strMap, "b");
		checkValue(intMap, 1);
		
		intGen.swapValue();
		strGen.swapValue();
		
		//j = 5; final variable value can't be changed
		//i = 8;
		//System.out.println(i);
		// TODO Auto-generated method stub

	}

}
