/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2023 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
/**
 * 
 */
package example.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ICT
 *
 */
public class LibraryTest {

	@Test
	void Test() {
		Library library = new Library();
		
		library.addPairs("Jean", 2);
		library.addPairs("Keqing", 5);
		library.addPairs("Eula", 5);
		library.addPairs("Raiden Shogun", 3);
		library.addPairs("Yae Miko", 4);
		library.addPairs("Ganyu", 7);
		
		library.addPairs("Hutao", 5);
		library.addPairs("Eula", 6);
		
		assertAll("Multiple Tests",
				() -> assertEquals(5, library.getValue("Keqing")),
				() -> assertEquals(true, library.isStarKeyInMap("Hutao")),
				() -> assertEquals(6, library.getValue("Eula"))
				);
		
		System.out.println("All testings work very well");
		System.out.println(library.starMap);
	}
}
