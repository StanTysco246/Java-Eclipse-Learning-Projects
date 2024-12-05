/**
 * 
 */
package turn.based.rpg.text;

/**
 * @author ICT
 *
 */
public abstract class Enemy extends Unit {
	
	protected int exp;
	private int exp_multi;
	
	
	private int expMultiplierBasedLvl(Unit u) {
		if(this.lvl > u.lvl) {
			return this.lvl - u.lvl;
		}
		return 1;
	}
	
	public int giveExp(Unit u) {
		this.exp_multi = this.expMultiplierBasedLvl(u);
		return this.exp * this.exp_multi;
	}
}
