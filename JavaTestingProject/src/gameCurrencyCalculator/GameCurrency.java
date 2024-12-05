/**
 * 
 */
package gameCurrencyCalculator;

/**
 * @author ICT
 *
 */
public class GameCurrency {
	private int currency;
	protected int daily_mission;
	protected int daily_curr;
	protected boolean isMonthlyOn;
	
	public GameCurrency(int curr) {
		// TODO Auto-generated constructor stub
		this.currency = curr;
	}
	
	protected void addCurrencyValue(int val) {
		this.currency += val;
	}
	
	public int getCurrency() {
		return this.currency;
	}
}
