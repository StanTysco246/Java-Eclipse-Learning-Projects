/**
 * 
 */
package errorLearning;

/**
 * @author ICT
 *
 */
public class Coffee extends Drink {

	Coffee(){
		super.drinkName = "Coffee";
	}
	
	@Override
	public void printMsg() {
		System.out.println("This is a Coffee");
	}
}
