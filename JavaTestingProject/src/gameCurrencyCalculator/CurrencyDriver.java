/**
 * 
 */
package gameCurrencyCalculator;

/**
 * @author ICT
 *
 */
public class CurrencyDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCurrency hi3 = new Honkai3Currency(6666);
		GenshinCurrency genshin = new GenshinCurrency(6143);
		
		genshin.clearAbyss(3,2);
		genshin.clearEvents(true, 2);
		genshin.getMTCurrency();
		genshin.redeemCodes(true);
		genshin.clearDaily(true, 24);

		System.out.println(genshin.getCurrency());
	}

}
