/**
 * 
 */
package final_static;

/**
 * @author ICT
 *
 */
public class StaticClass {
	
	//static String words = "Hello World!";
	static String words;
	int num;
	
	StaticClass(String w, int n){
		words = w;
		num = n;
	}
	
	StaticClass(){
		words = "Hello World!";
		num = 1+5*2;
	}
	
	public static void printWords() {
		System.out.println(words);
	}
	
	public void printNumbers() {
		System.out.println(num);
	}
}
