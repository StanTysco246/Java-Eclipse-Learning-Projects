package gameCurrencyCalculator;

public class GenshinCurrency extends GameCurrency {

	public GenshinCurrency(int curr) {
		// TODO Auto-generated constructor stub
		super(curr);
		super.daily_mission = 90;
		super.daily_curr = 150;
	}
	
	public void clearAbyss(int floor, int wave) {
		this.addCurrencyValue(floor*150*wave);
	}
	
	public void clearEvents(boolean isClear, int numCleared) {
		if (isClear) {
			this.addCurrencyValue(420*numCleared);
		}
	}
	
	public void getMTCurrency() {
		this.addCurrencyValue(600);
	}
	
	public void redeemCodes(boolean isDone) {
		if (isDone) {
			this.addCurrencyValue(300);
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
