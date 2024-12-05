/**
 * 
 */
package gradle_example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ICT
 *
 */
public class ModuleTest {

	@Test
	void Test() {
		Module module = new Module(new ArrayList<>() { 
			{
				add("Diluc");
				add("Kaeya");
				add("Zhongli");
				add("Childe");
				add("Ayato");
				add("Itto");
			}
		});
		module.addStar("AlHaitham");
		module.replaceStar(2, "Baizhu");
		assertAll("Multiple Tests",
				() -> assertEquals("Childe", module.getStarByIndex(3)),
				() -> assertEquals(true, module.isStarInList("AlHaitham")),
				() -> assertEquals("Baizhu", module.getStarByIndex(2))
				);
		System.out.println("All testings work");
		System.out.println(module.starList);
		/*
		module.addAllStar(new ArrayList<>() {
			{
				add("Zhongli");
				add("Thoma");
				add("Kazuha");
			}
		});
		System.out.println(module.starList);
		 */
		
	}
}
