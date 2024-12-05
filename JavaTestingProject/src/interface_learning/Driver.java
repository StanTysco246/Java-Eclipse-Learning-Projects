/**
 * 
 */
package interface_learning;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.lang.reflect.*;
/**
 * @author ICT
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AlphaClass ac = new AlphaClass();
		
		//AlphaClass ac = null;
		Class c1 = AlphaClass.class;
		Class c2 = BetaClass.class;
		Class c3 = GammaClass.class;
		Constructor cons1; Constructor cons2; Constructor cons3;
		AlphaClass ac; BetaClass bc; GammaClass gc; GammaClass gc2;
		Method[] methods1; Method[] methods2;
		//String[] methodNames1; String[] methodNames2;
		Method md1; Method md2; Method md3;
		Field f3;
		List<String> inList; List<String> inList2;
		Optional<Integer> op;
		
		String[] strList = null;
		//Integer listSize = strList.length;
		String a = null;
		String b = a;
		a = "aku";
		Optional<String> op1 = Optional.ofNullable(a);
		//Optional<AlphaClass> op1 = Optional.ofNullable(ac);
		op1.ifPresentOrElse(x -> System.out.println("Found: "+x), () -> System.out.println("Not Found"));
		System.out.println(op1.filter(x -> x == b));
		//ac.removeKeyandValue(1, "b");
		
		try {
			cons1 = c1.getDeclaredConstructor();
			cons2 = c2.getDeclaredConstructor();
			cons3 = c3.getDeclaredConstructor(int.class, String.class);
			cons1.setAccessible(true);
			cons2.setAccessible(true);
			cons3.setAccessible(true);
			
			ac = (AlphaClass) cons1.newInstance();
			bc = (BetaClass) cons2.newInstance();
			gc = (GammaClass) cons3.newInstance(1, "Otto");
			gc2 = (GammaClass) gc.clone();
			
			
			methods1 = c1.getMethods();
			methods2 = c2.getMethods();
			/*
			System.out.println("Alpha Class methods: ");
			for(Method m: methods1) {
				System.out.println(m.getName());
			}
			
			System.out.println();
			
			System.out.println("Beta Class methods: ");
			for(Method m: methods2) {
				System.out.println(m.getName());
			}
			 */
			
			
			md2 = c2.getDeclaredMethod("addString", String.class);
			md2.invoke(bc, "k");
			md2.invoke(bc, "e");
			md2.invoke(bc, "v");
			md2.invoke(bc, "i");
			md2.invoke(bc, "n");
			
			System.out.println();
			
			md2 = c2.getDeclaredMethod("getList");
			inList = (List<String>) md2.invoke(bc);
			inList2 = inList.stream().collect(Collectors.toList());
			//System.out.println(inList2);
			inList2.remove(2);
			inList2.remove(2);
			
			
			md1 = c1.getDeclaredMethod("addKeyandValue", int.class, List.class);
			md1.invoke(ac, 1, inList);
			md1.invoke(ac,2,inList2);
			
			System.out.println();
			
			inList = inList2.stream().collect(Collectors.toList());
			inList.add("k");
			inList.add("i");
			
			md1 = c1.getDeclaredMethod("getKey", List.class);
			op = (Optional<Integer>) md1.invoke(ac, inList);
			op.ifPresentOrElse(x -> System.out.println("Found Key: " + x), 
					() -> System.out.println("Not Found"));
			//System.out.println("Found Key: " + );
			
			System.out.println();
			
			md1 = c1.getDeclaredMethod("addKeyandValue", int.class, List.class);
			md1.invoke(ac, 3, inList);
			
			md1 = c1.getDeclaredMethod("removeKeyandValue", int.class, List.class);
			md1.invoke(ac, 2, inList2);
			
			System.out.println();
			
			System.out.println("From class object gc: ");
			md3 = c3.getDeclaredMethod("printData");
			md3.invoke(gc);
			
			f3 = c3.getDeclaredField("number");
			f3.setAccessible(true);
			f3.setInt(gc, 110022);
			System.out.println("Number: " + f3.getInt(gc));
			
			System.out.println();
			
			System.out.println("From class object gc2: ");
			gc2.setName("Joachim");
			gc2.printData();
			f3 = c3.getDeclaredField("number");
			f3.setAccessible(true);
			f3.setInt(gc2, 221133);
			System.out.println("Number: " + f3.getInt(gc2));
			
			System.out.println();
			
			FileOutputStream fileOut = new FileOutputStream("D:\\person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(gc);
			out.close();
			fileOut.close();
			System.out.println("Written in person.ser Successfully");
			
			FileInputStream fileIn = new FileInputStream("D:\\person.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			gc = (GammaClass) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Data has been read from person.ser file successfully");
			gc.printData();
			System.out.println("Number: " + f3.getInt(gc));
			
			//System.out.println();
			
			
			/*
			md3 = c3.getDeclaredMethod("printWords");
			md3.invoke(ai);
			File f = new File("D:\\person.ser");
			if(f.delete()) {
				System.out.println("person.ser file has been deleted successfully");
			}
			else {
				System.out.println("person.ser file is not found");
			}
			 */
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
