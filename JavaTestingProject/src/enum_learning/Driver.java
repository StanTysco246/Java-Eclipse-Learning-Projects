/**
 * 
 */
package enum_learning;
import java.lang.reflect.*;

/**
 * @author ICT
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class dtC;
		Constructor cons;
		Method m;
		Method m2;
		Method m3;
		Field f;
		DateTimeManager dtm;
		
		try {
			dtC = DateTimeManager.class;
			cons = dtC.getConstructor();
			dtm = (DateTimeManager) cons.newInstance();
			
			m = dtC.getDeclaredMethod("getWhatTime", int.class, int.class);
			m.setAccessible(true);
			m.invoke(dtm, 0, 0);
			
			System.out.println();
			
			m2 = dtC.getDeclaredMethod("printTheFirstDay");
			m2.setAccessible(true);
			m2.invoke(dtm);
			/*
			
			 */
			m3 = dtC.getDeclaredMethod("isEnumNull");
			m3.setAccessible(true);
			m3.invoke(dtm);
			
			//dtm.isEnumEqualToNull();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
