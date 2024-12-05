/**
 * 
 */
package practice1;

/**
 * @author ICT
 *
 */
abstract class Abstract1 implements Interface1 {
	
	@Override
	public void printWords(){
		System.out.println("Hello World!");
	}
	
	protected abstract void doMath(int x, int y);
}
