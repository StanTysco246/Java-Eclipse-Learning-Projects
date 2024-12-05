/**
 * 
 */
package turn.based.rpg.text;

/**
 * @author ICT
 *
 */
public class Warrior extends Player{

	
	public Warrior() {
		// TODO Auto-generated constructor stub
		this.str = 10;
		this.vit = 10;
		this.agi = 5;
		this.dex = 7;
		this.wis = 3;
		this.cur_exp = 0;
		this.lvl = 1;
		this.max_exp = this.lvl * 100;
		this.Stat();
	}
	
	@Override
	public void setHPBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void level_up() {
		// TODO Auto-generated method stub
		this.str += 4;
		this.vit += 4;
		this.agi += 2;
		this.dex += 3;
		this.wis += 1;
		this.lvl += 1;
		this.Stat();
	}

}
