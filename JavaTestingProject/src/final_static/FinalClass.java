/**
 * 
 */
package final_static;

/**
 * @author ICT
 *
 */
public final class FinalClass {

	//final String words ="Hello World!";
	final String words;
	
	FinalClass(String w){
		this.words = w;
	}
	
	public final void printWords() {
		System.out.println(words);
	}
}
