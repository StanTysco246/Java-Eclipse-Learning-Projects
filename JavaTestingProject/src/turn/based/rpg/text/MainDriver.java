/**
 * 
 */
package turn.based.rpg.text;

import java.util.Scanner;

/**
 * @author ICT
 *
 */
public class MainDriver {
	
	public static void printInstanceOf(Unit u) {
		if (u instanceof Warrior) {
			Warrior war = (Warrior) u;
			war.level_up();
			System.out.println("Warrior levels up to " + war.lvl);
		}
		else if (u instanceof Boar) {
			Boar boar = (Boar) u;
			System.out.println(boar.giveExp(u));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit unit = new Warrior();
		Unit unit2 = new Boar();
		
		printInstanceOf(unit);
		printInstanceOf(unit2);
		

	}

}
