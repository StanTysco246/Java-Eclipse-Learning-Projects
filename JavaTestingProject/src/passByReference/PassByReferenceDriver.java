/**
 * 
 */
package passByReference;

/**
 * @author ICT
 *
 */
public class PassByReferenceDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "Hello World!";
		//a = "Hi";
		String b = a;
		
		
		System.out.println("Before: ");
		System.out.println(a);
		System.out.println(b);
		
		a = "abcde";
		
		System.out.println("After: ");
		System.out.println(a);
		System.out.println(b);
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = x;
		
		System.out.println("Before: ");
		System.out.println(x);
		System.out.println(y);
		
		x = 5;
		
		System.out.println("After: ");
		System.out.println(x);
		System.out.println(y);
		
		Test1 test1 = new Test1("ABCDE");
		Test1 test2 = test1;
		
		System.out.println("Before: ");
		System.out.println(test1.getA());
		System.out.println(test2.getA());
		
		test1.setA("Ayam");
		System.out.println("After: ");
		System.out.println(test1.getA());
		System.out.println(test2.getA());
		
		System.out.println("abcde"+"12345");
		System.out.println(1267+2);
		
		StringBuffer str1 = new StringBuffer("a");
		StringBuffer str2 = str1;
		
		System.out.println("Before: ");
		System.out.println(str1);
		System.out.println(str2);
		
		str1.append("b");
		
		System.out.println("After: ");
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}

}


