/**
 * 
 */
package gradle_example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ICT
 *
 */
public class Module {
	
	List<String> starList;
	
	Module(List<String> inList){
		this.starList = inList;
	}
	
	Module(){
		this.starList = new ArrayList<>();
	}
	
	public void addStar(String e) {
		this.starList.add(e);
	}
	
	public String getStarByIndex(int i) {
		return this.starList.get(i);
	}
	
	public boolean isStarInList(String e) {
		return this.starList.contains(e);
	}
	
	public void removeStar(String e) {
		this.starList.remove(e);
	}
	
	public void removeStar(int i) {
		this.starList.remove(i);
	}
	
	public void replaceStar(int i, String e) {
		this.starList.set(i, e);
	}
	
	public void addAllStar(List<String> inList) {
		this.starList.addAll(inList);
	}
	
	public void printStars() {
		int i=1;
		for(String str: this.starList) {
			if(i < 4) {
				i++;
				continue;
			}
			System.out.println(i++ + ": " + str);
		}
	}
}
