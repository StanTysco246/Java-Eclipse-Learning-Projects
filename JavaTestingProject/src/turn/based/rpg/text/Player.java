/**
 * 
 */
package turn.based.rpg.text;

/**
 * @author ICT
 *
 */
public abstract class Player extends Unit{
	
	protected int str;
	protected int agi;
	protected int vit;
	protected int wis;
	protected int dex;
	
	protected int cur_sp;
	protected int max_sp;
	
	protected int cur_exp;
	protected int max_exp;
	
	
	protected void Stat() {
		this.base_atk = (int)(this.str * 2.5);
		
		this.max_HP =  this.vit * 5;
		
		this.evade_rate = this.agi * 1;
		
		this.crit_rate = this.dex * 1;
		
		this.crit_multi = 1 + (int) (this.dex * 0.6 + this.str * 0.4);
		
		this.max_sp = this.wis * 3;
		
		this.cur_HP = this.max_HP;
		this.cur_sp = this.max_sp;
	}
	
	protected abstract void level_up();
}
