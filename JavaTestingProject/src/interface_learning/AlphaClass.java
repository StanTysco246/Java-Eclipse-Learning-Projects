/**
 * 
 */
package interface_learning;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
/**
 * @author ICT
 *
 */
public final class AlphaClass {
	private Map<Integer, List<String> > mapList;
	
	AlphaClass(){
		mapList = new HashMap<>();
	}
	
	public Map<Integer, List<String> > getMap(){
		return this.mapList;
	}
	
	public Optional<Integer> getKey(List<String> v) {
		return this.mapList.entrySet().stream().filter(i  -> Objects.equals(i.getValue(), v))
				.map(Map.Entry::getKey).findAny();
	}
	
	public List<String> getValue(int k){
		return this.mapList.get(k);
	}
	
	public void addKeyandValue(int k, List<String> v) {
		if(this.mapList.containsKey(k)) {
			System.out.println("Value in Key: " + k + " has been updated into " + v);
		}else {
			System.out.println("Key: " + k +" and Value: " + v +" have been added successfully");
		}
		this.mapList.put(k, v);
	}
	
	public void removeKey(int k) {
		System.out.println("Removed value: " + this.mapList.remove(k));
	}
	
	public void removeKeyandValue(int k, List<String> v) {
		if(this.mapList.remove(k, v)) {
			System.out.println("Key: " + k + " and Value: "+ v + " have been removed successfully");
		}
		else {
			System.out.println("Invalid key or value");
		}
	}
	
	public void printMap() {
		System.out.println(this.mapList);
	}
}
