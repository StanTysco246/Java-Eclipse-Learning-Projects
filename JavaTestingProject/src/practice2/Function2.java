/**
 * 
 */
package practice2;
import java.lang.reflect.*;
import java.util.Optional;
import java.util.Random;
import practice1.*;
/**
 * @author ICT
 *
 */
public class Function2 extends Abstract2 {
	private String word = "Hello World!";
	
	private Optional<String> opText;
	private Optional<String> opText2;
	private Optional<Integer> opNum;
	private Optional<Integer> opNum2;
	private Random rd = new Random();
	private Class[] cList;
	private Class c;
	private Field[] fieldList;
	private Field f;
	private Constructor[] consList;
	private Constructor cons;
	private Method[] methodList;
	private Method m;
	private Function2b func2b;
	
	/*
	 * Final method can't be overridden by subclass
	@Override
	public void printing() {
		System.out.println("Hi!");
	}
	 */
	
	public void setWord(String str) {
		word = str;
	}
	
	public String getWord() {
		return word;
	}
	
	public void checkNull(int index) {
		String[] strArrays = new String[10];
		
		//strArrays.length;
		
		strArrays[rd.nextInt(10)] = "a";
		strArrays[rd.nextInt(10)] = "b";
		strArrays[rd.nextInt(10)] = "c";
		
		opText = Optional.ofNullable(strArrays[index]);
		opText2 = Optional.empty();
		
		
		if(opText.isPresent()) {
			System.out.println(opText.get());
		}
		else {
			System.out.println("This element does not have any text");
		}
		System.out.println("Is text present? " + opText.isPresent());
		System.out.println(opText.orElse("Non-existent"));
		System.out.println("Is text empty? " + opText2.isEmpty());
		
	}
	
	public void checkNullNumber(int num) {
		Integer[] numArrays =  new Integer[10];
		
		numArrays[rd.nextInt(10)] = 1;
		numArrays[rd.nextInt(10)] = 1;
		numArrays[rd.nextInt(10)] = 1;
		
		opNum = Optional.ofNullable(numArrays[num]);
		//opNum2 = Optional.of(rd.nextInt(10));
		opNum2 = Optional.empty();
		System.out.println("Is number present? " + opNum.isPresent());
		System.out.println(opNum.orElse(-1));
		System.out.println("Filtered Number: " + opNum.filter(a->a == 1));
		System.out.println("Value by optionalOf: " + opNum2);
		System.out.println("Value by OrElseGet: " + opNum2.orElseGet( () -> (int)(Math.random() * 100)));
	}
	
	
	public void printClass() {
		func2b = new Function2b();
		c = Function2b.class;
		methodList = c.getMethods();
		//m = c.getDeclaredMethod("addElement",int.class, String.class);
		consList = c.getConstructors();
		
		System.out.println(c.getName());
		
		
		//System.out.println(consList[0].getName());
		//System.out.println(cons.getName());
		for(Method method: methodList) {
			System.out.println(method.getName());
		}
		
		try {
			for(Constructor constructor: consList) {
				System.out.println(constructor.getName());
			}
			cons = c.getConstructor();
			cons.setAccessible(true);
			m = c.getDeclaredMethod("addElement",int.class, String.class);
			m.setAccessible(true);
			m.invoke(func2b, 1, "a");
			System.out.println(cons.getName());
			System.out.println(m.getName());
			for(Method method: Function1.class.getMethods()) {
				System.out.println(Modifier.toString(method.getModifiers()));
			}
			//System.out.println("Modifiers in Function1:\n" + Modifier.toString(Function1.class.getModifiers()));
		}catch(Exception e){
			
		}
		/*
		try {
			cList = new Class[] { c };
			cons = c.getConstructor(cList);
			System.out.println(c.getName());
			System.out.println(cons.getName());
			for(Method method: methodList) {
				System.out.println(method.getName());
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		 */
		
		
		//System.out.println(c.getName());
		//System.out.println();
	}
	
	@Override
	public void printStars(int x) {
		for(int i=1; i <= x; i++) {
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
