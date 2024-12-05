/**
 * 
 */
package gameCurrencyCalculator;

/**
 * @author ICT
 *
 */
public class Honkai3Currency extends GameCurrency {
	
	public Honkai3Currency(int curr) {
		// TODO Auto-generated constructor stub
		super(curr);
		super.daily_curr = 100;
		super.daily_mission = 40;
	}
	
	public void clearER(boolean isClear) {
		if (isClear) {
			this.addCurrencyValue(500);
		}
	}
	
	public void clearAbyss(boolean isClear) {
		if (isClear) {
			this.addCurrencyValue(100);
		}
	}
	
	public void clearMA(boolean isClear) {
		if (isClear) {
			this.addCurrencyValue(100);
		}
	}
	
	public void clearDaily(boolean isMonthlyActive, int day) {
		super.isMonthlyOn = isMonthlyActive;
		if (super.isMonthlyOn) {
			this.addCurrencyValue(daily_curr*day);
		}
		else {
			this.addCurrencyValue(daily_mission*day);
		}
	}
}
