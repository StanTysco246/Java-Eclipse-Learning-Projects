/**
 * 
 */
package flyme2themoon;

import java.util.jar.Attributes.Name;

/**
 * @author ICT
 *
 */
public class Valkryrie {
	String name;
	int id;
	
	Valkryrie(String str, int i){
		this.name = str;
		this.id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name=" + this.name + ", ID=" + this.id +"]";
	}
}
