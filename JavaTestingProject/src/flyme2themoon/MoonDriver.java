/**
 * 
 */
package flyme2themoon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import final_static.StaticClass;

/**
 * @author ICT
 *
 */
public class MoonDriver {
	
	static String string_y;
	
	public static void printOptionalFilter(int num) {
		//static String string_x = "APHO"; static field cannot be created inside static method
		final String string_x = "APHO";
		string_y = "Da Capo";
		
		Optional<Integer> optional1 = Optional.ofNullable(num);
		optional1 = optional1.filter(x -> x % 3 <= 1);
		optional1.ifPresentOrElse(x -> System.out.println("Result: " + x), () -> System.out.println("Not Found"));
		
		System.out.println(string_x);
	}
	
	
	public static void setValkyrie(Valkryrie val) {
		val.setName("Durandal");
	}
	
	public static void setValkyrieName(String str) {
		str = "Seele";
	}
	
	public static void printInstanceOf(Scoring s) {
		if(s instanceof Abyss) {
			Abyss a = (Abyss) s;
			a.printScore(500);
		}
	}
	
	public static void printInstanceOf(Stage s) {
		if(s instanceof Abyss) {
			Abyss a = (Abyss) s;
			a.printScore(1000);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string_x = "APHO";
		BigDecimal bigDecimal1 = new BigDecimal("5");
		BigDecimal bigDecimal2 = new BigDecimal("3");
		
		bigDecimal1 =  bigDecimal1.add(bigDecimal2).subtract(BigDecimal.valueOf(10)).multiply(new BigDecimal("10.0"));
		System.out.println(bigDecimal1.abs().intValue());
		
		Class class1 = OptionalList.class;
		OptionalList optionalList1;
		Method method1;
		
		String string1 = "Kiana";
		String string2 = "Mei";
		String string3 = "Bronya";
		
		Valkryrie valkryrie1 = new Valkryrie(string1, 1);
		Valkryrie valkryrie2 = new Valkryrie(string2, 2);
		Valkryrie valkryrie3 = new Valkryrie(string3, 3);
		
		List<Valkryrie> list1 = Arrays.asList(valkryrie1, valkryrie2, valkryrie3);
		Map<String, Valkryrie> map1 = new HashMap<>();
		Set<String> set1 = new HashSet<>(Arrays.asList(string1, string2, string3));
		
		
		Abyss abyss = new Abyss();
		Stage stage = new Abyss();
		Scoring scoring = new Abyss();
		
		printInstanceOf(scoring);
		printInstanceOf(stage);
		
		for(Valkryrie valkryrie: list1) {
			map1.put(valkryrie.getName(), valkryrie);
			//set1.add(valkryrie.name);
		}
		
		
		
		try {
			Constructor constructor1 = class1.getDeclaredConstructor(List.class);
			optionalList1 = (OptionalList) constructor1.newInstance(list1);
			
			method1 = class1.getDeclaredMethod("printOptionalResult", String.class);
			method1.invoke(optionalList1, "bronya");
			//throw new Exception("error");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println(list1);
			System.out.println(map1);
			System.out.println(set1);
			
			setValkyrieName(string3);
			setValkyrie(valkryrie2);
			
			System.out.println(list1);
			System.out.println(map1);
			System.out.println(set1);
			
			//printOptionalFilter(6);
			abyss.printParty(list1);
			abyss.printScore(500);
			stage.printParty(list1);
			stage.printScore(1000);
			//scoring.printParty(list1);
			scoring.printScore(1500);
			printInstanceOf(scoring);
			//System.out.println(valkryrie1);
		}

	}

}
