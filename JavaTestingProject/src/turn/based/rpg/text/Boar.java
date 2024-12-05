/**
 * 
 */
package turn.based.rpg.text;

/**
 * @author ICT
 *
 */
public class Boar extends Enemy {

	public Boar() {
		// TODO Auto-generated constructor stubS
		this.lvl = 1;
		this.max_HP = this.lvl * 100;
		this.base_atk = this.lvl * 5;
		this.crit_rate = 10;
		this.crit_multi = 1 + this.lvl * 0.2;
		this.exp = 50;
	}
	
	@Override
	public void setHPBar() {
		// TODO Auto-generated method stub
		
	}

}
