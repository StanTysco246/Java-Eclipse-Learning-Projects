/**
 * 
 */
package errorLearning;
import java.io.*;
import java.sql.*;
import java.util.*;
/**
 * @author ICT
 *
 */
public class ErrorCheckDriver {

	
	
	public static void recursion(int num) {
		System.out.println("Number: " + num);
		if(num == 0) {
			return;
		}
		else {
			recursion(++num);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		for(int i=0; i < 10; i++) {
			if(num < 5) {
				num++;
				continue;
			}
			System.out.println(num++);
		}
		
		/*
		 * StackOverflowError
		 recursion(1);
		 */
		
		
		/*
		 * InvalidClassException
		TestClass tc;
		try {
			FileInputStream f =  new FileInputStream("D:\\person.txt");
			ObjectInputStream in  = new ObjectInputStream(f);
			tc = (TestClass) in.readObject();
			in.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 */
		
		/*
		 * IOException
		String tc;
		try {
			FileInputStream f =  new FileInputStream("D:\\person.map");
			ObjectInputStream in  = new ObjectInputStream(f);
			tc = (String) in.readObject();
			in.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 */
		
		/*
		 * IllegalThreadStateException
		TestClass tc = new TestClass();
		
		tc.start();
		
		tc.printWords();
		
		tc.start();
		 */
		
		/*
		 * IllegalArgumentException
		TestClass tc = new TestClass();
		try {
			tc.sleep(-10);
		}catch(Exception e) {
			e.printStackTrace();
		}
		 */
		
		/*
		 * ArrayStoreException
		Object[] x = new String[5];
		x[2] = new Integer[3];
		 */
		
		/*
		 * ClassCastException - Case 1
		Object x = (int) 5;
		System.out.println((String) x);
		 * ClassCastException - Case 2
		Drink d = new Drink();
		Tea t = (Tea) d;
		System.out.println(t.drinkName);
		 * ClassCastException - Case 3
		Drink d = new Coffee();
		Tea t = (Tea) d;
		System.out.println(t.drinkName);
		 */
		
		/*
		 * Compile time error - Case 1
		String str = "5";
		System.out.println((int) str);
		 * Compile time error - Case 2
		String x;
		System.out.println(x);
		 */
		
		
		
		
		
		/*
		 * NoSuchMethodException
		m3 = dtC.getDeclaredMethod("isEnumEqualNull");
		m3.setAccessible(true);
		m3.invoke(dtm);
		 */
		
		/*
		 * SQLException
		String db_url = "jdbc:mysql://localhost:3306/sample?useSSL=false";
		String username = "root";
		String password = "h4!S4yang";
		try {
			Connection con  = DriverManager.getConnection(db_url, username, password);
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		 */
		
		/*
		 * IllegalStateException
		TestClass tc = new TestClass();
		List<String> strList = new ArrayList<>();
		
		strList.add("a");
		strList.add("b");
		
		tc.testStateException(strList);
		 */
		
		//timeEnum = TimeEnum.valueOf("NOON"); IllegalArgumentException
		
		/*
		 * IllegalArgumentException
		TestClass tc = new TestClass();
		Scanner sc = new Scanner(System.in);
		String inDate = sc.next();
		
		tc.testArgumentException(inDate);
		 */
		
		
		
		/*
		 * ArithmeticException
		int i = 50/0;
		System.out.println(i);
		 */
		
		/*
		 * NullPointerException
		 * Case 1 - Runtime error
		String[] s = null;
		System.out.println(s.length); 
		 * Case 2 - Compile error
		String[] s;
		System.out.println(s); 
		 * Case 3
		String string = null;
		System.out.println(string.length());
		 */
		

		
		/*
		 * NumberFormatException
		String s = "a";
		System.out.println(Integer.valueOf(s));
		 */
		
		/*
		 * ArrayIndexOutOfBoundsException
		 * Case 1
		Integer[] i = new Integer[5];
		System.out.println(i[1]); 
		 * Case 2 
		TestClass tc = new TestClass();
		tc.testArrayIndexOutOfBoundsOnList(5);
		 */
		
		/*
		 * ClassNotFoundException
		try {
			Class.forName("TestClass");
		}catch(ClassNotFoundException e) {
			System.out.println("This class is not found");
			e.printStackTrace();
			
		}
		catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		 */
		
		
		
		/*
		 * when exception has been handled - case 1
		try {
			System.out.println(25/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Hello World!");
		}
		 * when exception hasn't  been handled - case 2
		try {
			System.out.println(25/0);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Hello World!");
		}
		 * when there is no error in exception - case 3
		try {
			System.out.println(25/5);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Hello World!");
		}
		 */
		
		
		
		
		
		/*
		 * StringIndexOutOfBoundsException
		String s = "abcde";
		System.out.println(s.charAt(10));
		 */
		
		
	}

}
