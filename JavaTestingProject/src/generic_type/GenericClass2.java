/**
 * 
 */
package generic_type;

/**
 * @author ICT
 *
 */
public class GenericClass2<K, V> {
	private K key;
	private V val;
	
	public GenericClass2(K k, V v) {
		this.key = k;// TODO Auto-generated constructor stub
		this.val = v;
	}
	
	public V getValue(K k) {
		if(this.key == k) {
			return this.val;
		}
		return null;
	}
	
	public K getKey(V v) {
		if(this.val == v) {
			return this.key;
		}
		return null;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public V getVal() {
		return val;
	}
	
	public void setKeyandValue(K k, V v) {
		this.key = k;
		this.val = v;
	}
	
	public void setVal(V val) {
		this.val = val;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
}
