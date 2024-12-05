/**
 * 
 */
package interface_learning;
/**
 * @author ICT
 *
 */
public class GammaClass implements Cloneable, java.io.Serializable, AlphaInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient int number;
	public static String status;
	
	GammaClass(int id_num, String n){
		this.id = id_num;
		this.name = n;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setID(int id_num) {
		this.id = id_num;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void printData() {
		System.out.println("ID: " + this.id + " - " + "Name: " + this.name);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
