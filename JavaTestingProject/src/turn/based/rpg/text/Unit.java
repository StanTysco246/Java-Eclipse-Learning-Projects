/**
 * 
 */
package turn.based.rpg.text;

import java.util.Random;

/**
 * @author ICT
 *
 */
public abstract class Unit implements HPBar {
	protected int cur_HP;
	protected int max_HP;
	
	protected int lvl;
	
	protected int base_atk;
	protected int evade_rate;
	protected int crit_rate;
	protected double crit_multi;
	
	private Random random = new Random();
	
	private Boolean canEvade() {
		//random = new Random();
		if(this.evade_rate >= this.random.nextInt(100)) {
			return true;
		}
		return false;
	}
	
	public void damageCalculation(Unit u) {
		if(!canEvade()) {
			this.cur_HP -= u.dealDamage();
		}
	}
	
	public int dealDamage() {
		if(this.crit_rate >= this.random.nextInt(100)) {
			return (int)(this.base_atk * this.crit_multi);
		}
		return this.base_atk;
	}
}
