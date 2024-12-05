/**
 * 
 */
package practice1;
//import java.sql.Connection;
//import java.sql.DriverManager;
import practice2.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.lang.reflect.*;
/**
 * @author ICT
 *
 */
public class driver1 {

	static int number = 5;
	
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Function1 func1 = new Function1();
		Function2 func2 = new Function2();
		
		Abstract2b func3 = new Function1();
		
		Interface1 func4 =  new Function1();
		
		func3.isPalindrome("2022");
		func4.printWords();
		
		//Function1 func4 = new Abstract2b();
		System.out.println(func1.rd.nextInt(100));
		
		/* 
		System.out.println(func1.getNum());
		func1.setNum(5);
		System.out.println(func1.getNum());
		
		System.out.println(func2.getWord());
		func2.setWord("Hai Sayang");
		System.out.println(func2.getWord());
		 */
		
		//func1.printWords();
		//func1.doMath(5, 2);
		//func1.makeList(10);
		//func1.printRandomNumbers(10);
		//func2.printWords("Hai Sayang");
		//func2.printStars(5);
		//func2.makeList(10);
		func1.printTimeNow();
		func1.printToday();
		//func1.printTimeZoneList();
		func1.printDateTimeNowByTimeZone("Asia/Tokyo");
		func1.printExpiredDate(number);
		func1.printDate(number);
		func2.checkNull(6);
		func2.checkNullNumber(3);
		//func2.printClass();
		//func3.makeList(5);
		//System.out.println(func3.isPalindrome("Aabbaa".toLowerCase()));
		//func3.printRandomNumbers(5);
		
		
		
		/*
		String MySQLUrl= "jdbc:mysql://localhost:3306/test?useSSL=false";
		String username = "root";
		String password = "h4!S4yang";
		try {
			System.out.println("Connecting to database........"+MySQLUrl);
			Connection con = DriverManager.getConnection(MySQLUrl, 
					username, password);
			System.out.println("Connected");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		*/
		//Function1 func1 = new Function1();
		//func1.addNumber(number);
		//func1.addNumber(2);
		//func1.addNumber(number-2);
		//func1.addNumber(2);
		//System.out.println(func1.isFound(2));// TODO Auto-generated method stub
		//func1.FindUniqueKey();
		//func1.printSquare(10);
		
		/*
		
		 */
		BigDecimal a = new BigDecimal("5");
		BigDecimal b = new BigDecimal("2.36");
		BigDecimal c = new BigDecimal("3");
		BigDecimal d = new BigDecimal("2");
		
		double num1 = 2.5;
		int num2 = 3;
		double d1=5, d2=3,totalNum;
		float f1=5, f2=3, totalFNum;
		
		System.out.println(a);
		//a = a.add(c);
		//System.out.println(a);
		//a = a.add(BigDecimal.valueOf(num1));
		//System.out.println(a);
		//a = a.add(BigDecimal.valueOf(num2));
		//System.out.println(a);
		//a = a.subtract(b);
		//System.out.println(a);
		//a = a.multiply(BigDecimal.valueOf(num1));
		//System.out.println(a);
		//a = a.divide(c, 2);
		//System.out.println(a);
		//a = a.pow(num2).add( d.multiply( BigDecimal.valueOf(num1).subtract(b) )
		//		.divide( BigDecimal.valueOf(num2), BigDecimal.ROUND_HALF_UP ) );
		//totalNum = Math.pow(1.25, num2) + (2 * (2.5 - 2.36) / 3);
		a = a.divide(c, MathContext.DECIMAL128);
		totalNum = d1 / d2;
		totalFNum = f1/f2;
		System.out.println(a);
		System.out.println(totalNum);
		System.out.println(totalFNum);
		System.out.println(a.doubleValue());
		System.out.println(a.toString()+"a");
	}

}
